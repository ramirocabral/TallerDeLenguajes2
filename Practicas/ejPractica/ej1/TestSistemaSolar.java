package ejPractica.ej1;
import java.util.ArrayList;
import java.util.List;

public class TestSistemaSolar {
    public static void main(String[] args){
        List<Planeta> listaPlanetas = new ArrayList<>();

        listaPlanetas.add(new Planeta("Tierra", 1, 12742, 149600000, TipoPlaneta.ROCOSO));
        listaPlanetas.add(new Planeta("Marte", 2, 6779, 227900000, TipoPlaneta.ROCOSO));
        listaPlanetas.add(new Planeta("Jupiter", 79, 139822, 778500000, TipoPlaneta.GASEOSO));

        SistemaSolar sistema = SistemaSolar.getInstance();
        sistema.setPlanetas(listaPlanetas);

        Telescopio tel = new Telescopio();
        for (Planeta planeta : sistema.getPlanetas()){
            System.out.println(tel.distancia(planeta));
            tel.tipo(planeta);
        }
    }
}
