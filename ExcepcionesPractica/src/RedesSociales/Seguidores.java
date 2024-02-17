package RedesSociales;

public class Seguidores implements Observador{
    private String nombre;
    private String apellido;
    private int cantidadNotificaciones = 0;

    public Seguidores(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    @Override
    public void recibirnotificacion(String mensaje) {
        System.out.println("Usted fue notificado con: " + mensaje);
        cantidadNotificaciones++;
    }
}
