package ListasEquipo;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private int cantidadLesionados = 0;
    private List<Jugador> jugadores = new ArrayList<>();
    private List<Jugador> jugadoresTitulares = new ArrayList<>();
    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public void agregarJugador(Jugador jugadores){
        this.jugadores.add(jugadores);
    }
    public void jugadoresTitulares(Jugador jugadores){
        for (Jugador jugadore : this.jugadores) {
            if (jugadores.isTitular() && !jugadores.isLesionado()){
                this.jugadoresTitulares.add(jugadores);
                System.out.println("Jugador titular: " + jugadores.getNombre());
            }
        }
    }
    public void cantidadLesionados(){
        for (Jugador jugadore : jugadores) {
            if (jugadore.isLesionado()){
                    cantidadLesionados++;
            }       
        }
        System.out.println(cantidadLesionados);
    }
}
