package Objetos;

public class Cliente {
    private String nombre;
    private String direcion;

    public Cliente(String nombre, String direcion) {
        this.nombre = nombre;
        this.direcion = direcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }
    public void comprar(Producto producto){
        System.out.println("Acaste de adquirir el siguiente producto: " + producto.getNombre());
        System.out.println("Viene con: "+ producto.getDescripcion());
        System.out.println("El precio abonado fue: "+producto.getPrecio());
    }
}
