package ejPractica.ej1;

public class Planeta {
    private String nombre;
    private int cantidadLunas;
    private long kmDiametro;
    private long kmDistanciaSol;
    private TipoPlaneta tipoPlaneta;

    public Planeta(){

    }

    public Planeta(String nombre, int cantidadLunas, long kmDiametro, long kmDistanciaSol, TipoPlaneta tipoPlaneta){
        this.nombre = nombre;
        this.cantidadLunas = cantidadLunas;
        this.kmDiametro = kmDiametro;
        this.kmDistanciaSol = kmDistanciaSol;
        this.tipoPlaneta = tipoPlaneta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadLunas() {
        return cantidadLunas;
    }

    public void setCantidadLunas(int cantidadLunas) {
        this.cantidadLunas = cantidadLunas;
    }

    public double getKmDiametro() {
        return kmDiametro;
    }

    public void setKmDiametro(long kmDiametro) {
        this.kmDiametro = kmDiametro;
    }

    public long getKmDistanciaSol() {
        return kmDistanciaSol;
    }

    public void setKmDistanciaSol(long kmDistanciaSol) {
        this.kmDistanciaSol = kmDistanciaSol;
    }

    public TipoPlaneta getTipoPlaneta() {
        return tipoPlaneta;
    }

    public void setTipoPlaneta(TipoPlaneta tipoPlaneta) {
        this.tipoPlaneta = tipoPlaneta;
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + nombre + '\'' +
                ", cantidadLunas=" + cantidadLunas +
                ", kmDiametro=" + kmDiametro +
                ", kmDistanciaSol=" + kmDistanciaSol +
                ", tipoPlaneta=" + tipoPlaneta +
                '}';
    }
}
