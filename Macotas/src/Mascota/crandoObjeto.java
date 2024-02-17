package Mascota;

public class crandoObjeto {
    public static void main(String[] args) {
        System.out.println("Welcome");
        tipoMascota manchitas = new tipoMascota("Manchitas", 2 , 1.5 , "Guaf Guaf");
        System.out.println(manchitas.toString());
    }
}
