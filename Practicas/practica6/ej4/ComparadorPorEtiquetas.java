package practica6.ej4;
import java.util.Comparator;
public class ComparadorPorEtiquetas implements Comparator<SitioWeb>{

    public ComparadorPorEtiquetas() {
    }
    public int compare(SitioWeb a, SitioWeb b) {
        if (a.getEtiquetas().size() < b.getEtiquetas().size()) {
            return -1;
        } else if (a.getEtiquetas().size() > b.getEtiquetas().size()) {
            return 1;
        } else {
            return 0;
        }
    }
}
