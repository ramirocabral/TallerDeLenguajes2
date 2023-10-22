package ejPractica.ej1;
import java.util.List;
import java.util.ArrayList;
public class SistemaSolar {

    private static SistemaSolar INSTANCE;
    private List<Planeta> planetas;

    private SistemaSolar(){
        planetas = new ArrayList<>();
    }

    public static SistemaSolar getInstance(){
        if (INSTANCE == null){
            INSTANCE = new SistemaSolar();
        }
        return INSTANCE;
    }
    public void agregarPlaneta(Planeta planeta){
        planetas.add(planeta);
    }

    public void eliminarPlaneta(Planeta planeta){
        planetas.remove(planeta);
    }

    public List<Planeta> getPlanetas(){
        return planetas;
    }

    public void setPlanetas(List<Planeta> planetas){
        this.planetas = planetas;
    }

    @Override
    public String toString() {
        return "SistemaSolar{" +
                "planetas=" + planetas.toString() +
                '}';
    }
}

