package practica6.ej4;

import java.util.List;

public class Catalogo {
    private List<SitioWeb> sitios;

    public Catalogo() {
    }

    public Catalogo(List<SitioWeb> sitios) {
        this.sitios = sitios;
    }

    public List<SitioWeb> getSitios() {
        return sitios;
    }

    public void setSitios(List<SitioWeb> sitios) {
        this.sitios = sitios;
    }
}
