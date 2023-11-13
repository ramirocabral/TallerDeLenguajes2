package practica6.ej4;
import java.util.Comparator;
import java.util.List;
public class Catalogador {
    Catalogo obtenerCatalogo(Catalogo cjtoSitiosWeb,Filtro filtro,Comparator<SitioWeb> orden){
        Catalogo catalogo = new Catalogo();
        List<SitioWeb> lista = filtro.filtrar(cjtoSitiosWeb.getSitios());
        lista.sort(orden);
        catalogo.setSitios(lista);
        return catalogo;
    }
}
