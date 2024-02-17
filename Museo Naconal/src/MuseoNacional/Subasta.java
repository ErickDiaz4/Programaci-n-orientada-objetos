package MuseoNacional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subasta implements Observable{
    private double monto;
    private String descripcion;

    private List<Oferente> observadores = new ArrayList<>();

    public Subasta(double monto, String descripcion) {
        this.monto = monto;
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public List<Oferente> getObservadores() {
        return observadores;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void anadirOferente(Oferente oferente){
        this.observadores.add(oferente);
        System.out.println("Fue agregado a la lista de subastadores por un: " + getDescripcion() );
    }

    @Override
    public void notificar() {
        for (Oferente observadore : observadores) {
            if (observadore.getMontoTope() < getMonto()){
                System.out.println("Usuario: " + observadore.getNombre() + " " + observadore.getApellido() +
                        " El monto minimo a ofertar es de: " + getMonto() + " su monto ofertado es de: " + observadore.getMontoTope());
            } else if (observadore.getMontoTope() >= getMonto()) {
                System.out.println("Usuario: " + observadore.getNombre() + " " + observadore.getApellido() +
                        " fue agregado a esta subasta. Con un monto minimo de: " + getMonto());
            }
        }
    }
}
