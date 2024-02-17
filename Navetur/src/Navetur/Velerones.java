package Navetur;

public class Velerones extends Embarcacion implements montoAlquiles{

    private int cantidadMastiles;

    public Velerones(String nombre, String apellido, String matriculaNavegacion, Double precioBase, Double valorAdicional, int anioFabricacion, Double longitud, int cantidadMastiles) {
        super(nombre, apellido, matriculaNavegacion, precioBase, valorAdicional, anioFabricacion, longitud);
        this.cantidadMastiles = cantidadMastiles;
    }

    public String grande(){
        if (cantidadMastiles > 4){
            return "El velero es de tipo grande";
        };
        return "El velero no es de tipo grande";
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
