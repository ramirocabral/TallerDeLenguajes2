package practica6.ej4;
import java.util.ArrayList;
import java.util.List;
public class FiltradoPorNombreDeEtiqueta implements Filtro{
    private final String etiqueta;
    public FiltradoPorNombreDeEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    public List<SitioWeb> filtrar(List<SitioWeb> lista){
       ArrayList<SitioWeb> newList = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getEtiquetas().contains(this.etiqueta)) {
                newList.add(lista.get(i));
            }
        }
        return newList;
    }
}