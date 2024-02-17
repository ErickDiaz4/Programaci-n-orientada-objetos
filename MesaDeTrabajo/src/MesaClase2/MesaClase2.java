package MesaClase2;


import java.util.Scanner;

/*Ejercicio 1
        Hacer una función que dado un número indica si es un número primo o no. Un número
        primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
        ya que 25 es divisible por 1, 5 y 25. 17 sí es primo porque solo se puede dividir por 1 y por
        17.
        Usar esta función en un programa, que permita el ingreso de un número y luego llame a la
        función desarrollada para comprobar si es primo o no. Para resolverlo usar la función
        obtenida en el ejercicio desarrollado en la clase asincrónica. boolean esDivisible(int n, int
        divisor)*/
public class MesaClase2 {
    public static boolean numerosPrimos (int n1 , int n2){
        return n1 % n2 == 0;
    }
    public static boolean numeroDivisible (int numero){
        if (numero <= 1){
            return false;
        }
        for (int i = 2; i < numero/2; i++){
            if (numerosPrimos(numero , i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sacanner = new Scanner(System.in);
        System.out.println("Inserte su numero, por favor");
        int numero = sacanner.nextInt();
        if(numeroDivisible(numero)){
            System.out.println("El numero: " + numero + " si es un primo" );
        }else {
            System.out.println("El numero: " + numero + " no es un primo");
        }
    }
}


