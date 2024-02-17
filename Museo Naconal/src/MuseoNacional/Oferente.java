package MuseoNacional;

import java.util.ArrayList;
import java.util.List;

public class Oferente implements Observable{
    private String nombre;
    private String apellido;
    private int dni;
    private double montoTope;
    private int notificaciones = 0;

    public Oferente(String nombre, String apellido, int dni, double montoTope) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.montoTope = montoTope;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getMontoTope() {
        return montoTope;
    }

    public int getNotificaciones() {
        return notificaciones;
    }

    @Override
    public void notificar() {
        notificaciones++;
        System.out.println("Cantidad de notificaciones " + getNotificaciones());
    }
}
