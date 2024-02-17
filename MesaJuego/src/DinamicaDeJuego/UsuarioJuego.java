package DinamicaDeJuego;

public class UsuarioJuego {
    private String nombre;
    private String clave;
    private Integer puntaje;
    private Integer nivel;

    public UsuarioJuego(String nombre, String clave, Integer puntaje, Integer nivel) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = puntaje;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public void aumentarPuntaje(){
        this.puntaje ++;
    }
    public void aumentarNivel(){
        this.nivel ++;
    }
    public void bonus (int valor){
        System.out.println("Su puntaje con el bonus recibido aumento a: "+ (valor += nivel) + " actualmente");
    }

    public void datosDeUsuario(UsuarioJuego usuarioJuego){

        System.out.println("Nombre de usuario: " + nombre +
                "\nClave asignada: " + clave +
                "\nPuntaje actual: " + puntaje +
                "\nNivel actual: " + nivel);
    }

    public void mostrarPuntaje(){
        System.out.println("Su puntaje aumentado es de: "+ this.puntaje + " actualmente");
    }
    public void mostrarNivel(){
        System.out.println("Su nivel aumentado es de: "+ this.nivel + " actualmente");
    }

}
