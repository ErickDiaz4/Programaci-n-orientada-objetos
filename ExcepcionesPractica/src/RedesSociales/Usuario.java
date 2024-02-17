package RedesSociales;

import java.util.ArrayList;
import java.util.List;

public class Usuario{
    private String nombre;
    private String apellido;
    private List<Observador> Seguidores = new ArrayList<>();


    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void subirFoto(){
        String mensaje = nombre + " " + apellido + " recientemente subio una foto";
        notificarSeguidores(mensaje);
    }

    public void agregarSeguidor (Observador Seguidor){
        Seguidores.add(Seguidor);
    }

    public void eliminarSeguidor (Observador Seguidor){
        Seguidores.remove(Seguidor);
    }

    public void notificarSeguidores(String mensaje){
        for (Observador seguidore : Seguidores) {
            seguidore.recibirnotificacion(mensaje);
        }
    }


}
