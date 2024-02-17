import DinamicaDeJuego.UsuarioJuego;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        UsuarioJuego usuarioJuego = new UsuarioJuego("Erick", "123456", 0, 0);

        usuarioJuego.datosDeUsuario(usuarioJuego);
        System.out.println("datos aumentados");
        usuarioJuego.aumentarPuntaje();
        usuarioJuego.mostrarPuntaje();
        usuarioJuego.aumentarNivel();
        usuarioJuego.mostrarNivel();
        usuarioJuego.bonus(20);
        System.out.println("Sus datos definitivos son");
        usuarioJuego.datosDeUsuario(usuarioJuego);
        usuarioJuego.bonus(20);
    }
}