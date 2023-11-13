package ejPractica.ej2;

public class TestEquipos {
    public static void main(String[] args) {
        Jugador[] jugadores = new Jugador[5];
        jugadores[0] = new Jugador("Juan", Posicion.ARQUERO, Posicion.DEFENSOR);
        jugadores[1] = new Jugador("Pedro", Posicion.DEFENSOR, Posicion.MEDIOCAMPISTA);
        jugadores[2] = new Jugador("Pablo", Posicion.MEDIOCAMPISTA, Posicion.DELANTERO);
        jugadores[3] = new Jugador("Jose", Posicion.DELANTERO, Posicion.DEFENSOR);
        jugadores[4] = new Jugador("Carlos", Posicion.MEDIOCAMPISTA, Posicion.DELANTERO);
        Equipo equipo = new Equipo("Equipo 1", jugadores);
        System.out.println(equipo.verificarEquipo());
    }
}
