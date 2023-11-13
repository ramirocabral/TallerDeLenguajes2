package practica6.ej4;
import java.util.List;
import java.util.ArrayList;
public class TestCatalogador {
    public static void main(String[] args) {
        Catalogador catalogador = new Catalogador();
        ArrayList <SitioWeb> sitios= new ArrayList<SitioWeb>();
        sitios.add(new SitioWeb("www.google.com", 10, new Fecha(1, 1, 2000),new ArrayList<String>()));
        sitios.add(new SitioWeb("www.twitter.com", 30, new Fecha(1, 1, 2010),new ArrayList<String>()));
        sitios.add(new SitioWeb("www.facebook.com", 20, new Fecha(1, 1, 2005),new ArrayList<String>()));
        sitios.add(new SitioWeb("www.youtube.com", 0, new Fecha(1, 1, 2023),new ArrayList<String>()));
        sitios.get(0).getEtiquetas().add("Ciencia");
        sitios.get(0).getEtiquetas().add("Deportes");
        sitios.get(1).getEtiquetas().add("Tecnologia");
        sitios.get(2).getEtiquetas().add("Tecnologia");
        sitios.get(2).getEtiquetas().add("Ciencia");
        sitios.get(3).getEtiquetas().add("Fulbo");
        sitios.get(3).getEtiquetas().add("Informatica");
        sitios.get(3).getEtiquetas().add("Juegos");
        sitios.get(3).getEtiquetas().add("CARROS");
        Catalogo catalogo = new Catalogo(sitios);
        Filtro filtro = new FiltradoPorVisitas(9);
        ComparadorPorVisitas comparator1 = new ComparadorPorVisitas();
        ComparadorPorEtiquetas comparator2 = new ComparadorPorEtiquetas();

        Catalogo catalogoFiltrado = catalogador.obtenerCatalogo(catalogo, filtro, comparator2);
        System.out.println(catalogoFiltrado.getSitios().toString());
    }
}
