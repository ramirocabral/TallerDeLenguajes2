package ejPractica.ej2;

public class Equipo {
    private String nombre;
    private Jugador[] jugadores;

    public Equipo() {
    }

    public Equipo(String nombre, Jugador[] jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public boolean verificarEquipo(){
        if (this.jugadores.length < 5)
            return false;
        int[] pos = new int[4];
        for (Jugador j : this.jugadores){
            if (j.getPos1().equals(Posicion.DEFENSOR) && (pos[1] < 2))
                    pos [1]++;
            else if (pos[j.getPos1().ordinal()] == 0)
                pos[j.getPos1().ordinal()]++;
            else
                pos[j.getPos2().ordinal()]++;
        }
        for (int i = 0; i < pos.length; i++){
            if (i != 1 && pos[i] < 1)
                return false;
            else if (i == 1 && pos[i] < 2)
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", jugadores=" + jugadores +
                '}';
    }
}
