package PresencialObjetos;

public class Nave extends Objeto{
    private double velocidad;
    private int vida;

    public Nave(int posX, int posY, char direccion, double velocidad, int vida) {
        super(posX, posY, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }

    @Override
    public void irA(int posX, int posY, char direccion) {
        super.irA(posX, posY, direccion);
    }

    public void girar(char direccion){
        System.out.println("Dirección: "+ direccion);
    }
    public void restaVida(int valor){
        System.out.println("vidas actuales: "+ (valor - vida));
    }
}
