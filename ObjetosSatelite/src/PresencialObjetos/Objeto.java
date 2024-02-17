package PresencialObjetos;

public class Objeto {
    private int posX;
    private int posY;
    private char direccion;

    public Objeto(int posX, int posY, char direccion) {
        this.posX = posX;
        this.posY = posY;
        this.direccion = direccion;
    }

    public void irA(int posX, int posY, char direccion){
        this.posX = posX;
        this.posY = posY;
        this.direccion = direccion;
    }
}
