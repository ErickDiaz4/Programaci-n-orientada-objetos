package ScannerAfondo;

import java.util.Scanner;

public class DatosDeUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        char letraInicialNombre = primeraLetra(nombre);
        char letraFinalNombre = UltimaLetra(nombre);
        System.out.println("Ingrese su apellido");
        String apellido = scanner.nextLine();
        char letraInicialApellido = primeraLetra(apellido);
        char letraFinalApellido = UltimaLetra(apellido);
        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        if (ValidarEdad(edad)){
            System.out.println("cumles con laa edad requerida");
        }else {
            System.out.println("No cumples con la edadrequerida");
        }
        System.out.println("ingrese su estatura");
        Double estatura = scanner.nextDouble();
        if (ValidarEstatura(estatura)){
            System.out.println("Cumples con la estatura requerida");
        }else {
            System.out.println("No cumples la estatura requerida, vuelve en unos años");
        }
        System.out.println("la primera letra de tu nombre es: " + letraInicialNombre + " La ultima letra es: " +
                letraFinalNombre + " \nla primera letra de tu apellido es: " + letraInicialApellido + " La ultima letra es: " +
                letraFinalApellido + " \nSu edad es: " + edad + " \nEstatura valida de: " + estatura);

    }

    public static char primeraLetra(String nombre){ return nombre.charAt(0);}
    public static char UltimaLetra(String nombre){return nombre.charAt(nombre.length()-1);}

    public static boolean ValidarEdad(int edad){return edad >= 18;}

    public static boolean ValidarEstatura(double estatura){ return estatura>= 1.68;}
}
