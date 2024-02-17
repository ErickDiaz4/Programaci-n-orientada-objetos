package GestionEstudiantes;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<estudiante> estudiantes = new ArrayList<>();
        System.out.println("Ingrese la cantidad de estudiantes");
        int numeroEstudiantes = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numeroEstudiantes; i++){
            System.out.println("Ingrese el nombre del estudiante"+ (i + 1));
            String nombre = scanner.nextLine();
            System.out.println("Cantidad de notas: ");
            int numCalificacion = scanner.nextInt();
            scanner.nextLine();
            double[] calificaciones = new double[numCalificacion];
            for(int j = 0; j < numCalificacion; j++){
                System.out.println("Ingrese la nota " + (j + 1));
                calificaciones[j] = scanner.nextDouble();
            }
            scanner.nextLine();
            estudiante estudiante = new estudiante( nombre , calificaciones );
            estudiantes.add(estudiante);
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Resumen " +'\n' +  estudiante);
        }
        scanner.close();
    }
}
