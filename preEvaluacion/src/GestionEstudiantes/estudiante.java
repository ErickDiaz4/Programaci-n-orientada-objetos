package GestionEstudiantes;

import java.util.Arrays;

public class estudiante {
    private String nombre;
    private double[] notas;

    public estudiante(String nombre, double[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public double calificacionFinal(){
        Double sumaTotal = 0.0;
        for (double calificacion:notas ) {
            sumaTotal += calificacion;
        }
        return sumaTotal /= notas.length;
    }

    @Override
    public String toString() {
        return "El estuadiante con nombre: "+ nombre + '\n' +
                "Con las notas: " + Arrays.toString(notas) + '\n' +
                "Recibe una notal final de promedio acumulado de: " + calificacionFinal();
    }
}
