package practica6.ej4;
import java.util.Comparator;
public class ComparadorPorVisitas implements Comparator<SitioWeb> {
    public int compare(SitioWeb a, SitioWeb b) {
        if (a.getVisitas() < b.getVisitas()) {
            return -1;
        } else if (a.getVisitas() > b.getVisitas()) {
            return 1;
        } else {
            return 0;
        }
    }
}
