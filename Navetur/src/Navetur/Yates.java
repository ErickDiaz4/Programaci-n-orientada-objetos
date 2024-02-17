package Navetur;

public class Yates extends Embarcacion{

    private int camarotes;

    public Yates(String nombre, String apellido, String matriculaNavegacion, Double precioBase, Double valorAdicional, int anioFabricacion, Double longitud, int camarotes) {
        super(nombre, apellido, matriculaNavegacion, precioBase, valorAdicional, anioFabricacion, longitud);
        this.camarotes = camarotes;
    }
    @Override
    public double montoAlquiler() {
        if(getAnioFabricacion() <= 2020){
            return getPrecioBase();
        }else {
            return getPrecioBase() + getValorAdicional();
        }
    }
}
