package Impresora;

public class Impresoras {
    private String modelo;
    private int cantidadHojas;
    private int cantidadImpresiones;

    public Impresoras(String modelo, int cantidadHojas, int cantidadImpresiones) {
        this.modelo = modelo;
        this.cantidadHojas = cantidadHojas;
        this.cantidadImpresiones = cantidadImpresiones;
    }

    public boolean confirmandoImpresion(){
        if(cantidadHojas >= cantidadImpresiones){
            return true;
        }
        return false;
    };
    public void imprimir(){
        if(confirmandoImpresion()){
            cantidadHojas -= cantidadImpresiones;
            System.out.println("Imprimiendo");
        } else if (!confirmandoImpresion()) {
            System.out.println("No hay hojas suficientes");
        }

    };
    public void hojasTotales(){
        System.out.println("las hojas restantes son: "+ cantidadHojas);
    };
}
