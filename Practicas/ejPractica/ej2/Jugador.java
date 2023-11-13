package ejPractica.ej2;

public class Jugador {
    private String nombre;
    private Posicion pos1;
    private Posicion pos2;

    public Jugador(){
    }
    public Jugador(String nombre, Posicion pos1, Posicion pos2) {
        this.nombre = nombre;
        this.pos1 = pos1;
        this.pos2 = pos2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Posicion getPos1() {
        return pos1;
    }

    public void setPos1(Posicion pos1) {
        this.pos1 = pos1;
    }

    public Posicion getPos2() {
        return pos2;
    }

    public void setPos2(Posicion pos2) {
        this.pos2 = pos2;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", pos1=" + pos1 +
                ", pos2=" + pos2 +
                '}';
    }
}
