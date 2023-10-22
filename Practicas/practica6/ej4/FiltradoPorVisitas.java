package practica6.ej4;
import java.util.List;
import java.util.ArrayList;
public class FiltradoPorVisitas implements Filtro{
   private final int visitas;
    public FiltradoPorVisitas(int visitas) {
        this.visitas = visitas;
    }
    public List<SitioWeb> filtrar(List<SitioWeb> lista){
       ArrayList<SitioWeb> newList = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getVisitas() > this.visitas) {
                newList.add(lista.get(i));
            }
        }
        return newList;
    }
}
