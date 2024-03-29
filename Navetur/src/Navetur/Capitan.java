package Navetur;

public class Capitan {
    private String nombre;
    private String apellido;
    private String matriculaNavegacion;

    public Capitan(String nombre, String apellido, String matriculaNavegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNavegacion = matriculaNavegacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMatriculaNavegacion() {
        return matriculaNavegacion;
    }

    @Override
    public String toString() {
        return "El capitan con nombre, apellido: " + getNombre() + getApellido() +
                " con la matricula de navegación: " + getMatriculaNavegacion();
    }
}
