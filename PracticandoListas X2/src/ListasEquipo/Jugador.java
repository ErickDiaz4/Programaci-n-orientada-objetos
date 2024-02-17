package ListasEquipo;

public class Jugador {
    private int nroCamisa;
    private String nombre;
    private boolean lesionado;
    private boolean titular;

    public Jugador(int nroCamisa, String nombre, boolean lesionado, boolean titular) {
        this.nroCamisa = nroCamisa;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public int getNroCamisa() {
        return nroCamisa;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isTitular() {
        return titular;
    }

    public boolean isLesionado() {
        return lesionado;
    }
}
