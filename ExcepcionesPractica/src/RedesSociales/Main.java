package RedesSociales;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Erick","Saavedra");
        Seguidores seguidores = new Seguidores("Andres", "Loazano");

        usuario.agregarSeguidor(seguidores);
        usuario.subirFoto();
        seguidores.recibirnotificacion("La siguiente notfificación");
    }
}
