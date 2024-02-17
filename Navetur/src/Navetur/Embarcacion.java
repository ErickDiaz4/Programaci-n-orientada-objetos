package Navetur;

public abstract class Embarcacion extends Capitan{

    private Double precioBase;
    private Double valorAdicional;
    private int anioFabricacion;
    private Double longitud;

    public Embarcacion(String nombre, String apellido, String matriculaNavegacion, Double precioBase, Double valorAdicional, int anioFabricacion, Double longitud) {
        super(nombre, apellido, matriculaNavegacion);
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.longitud = longitud;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public abstract double montoAlquiler();
}
