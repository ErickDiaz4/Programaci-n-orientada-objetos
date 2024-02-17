package ListasEquipo;

public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Barcelona");
        Jugador jugador = new Jugador(10,"De jong",false,true);
        Jugador jugador1 = new Jugador(8,"Gundogan",true,true);
        Jugador jugador2 = new Jugador(9,"Raphina",true,true);

        equipo.agregarJugador(jugador);
        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);

        equipo.jugadoresTitulares(jugador);
        equipo.jugadoresTitulares(jugador1);
        equipo.jugadoresTitulares(jugador2);

        equipo.cantidadLesionados();
    }
}
