package practica6.ej4;

import java.util.Arrays;
import java.util.List;

public class SitioWeb {
    private String direccion;
    private int visitas;
    private Fecha fechaCreacion;
    private List<String> etiquetas;

    public SitioWeb(String direccion, int visitas, Fecha fechaCreacion, List<String> etiquetas) {
        this.direccion = direccion;
        this.visitas = visitas;
        this.fechaCreacion = fechaCreacion;
        this.etiquetas = etiquetas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getVisitas() {
        return visitas;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }

    public Fecha getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Fecha fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    @Override
    public String toString() {
        return "SitioWeb{" +
                "direccion='" + direccion + '\'' +
                ", visitas=" + visitas +
                ", fechaCreacion=" + fechaCreacion +
                ", etiquetas=" + etiquetas.toString() +
                '}';
    }
}
