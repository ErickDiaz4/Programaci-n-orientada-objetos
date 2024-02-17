package PresencialObjetos;

public class Asteroide extends Objeto{
    private int lesion;

    public Asteroide(int posX, int posY, char direccion, int lesion) {
        super(posX, posY, direccion);
        this.lesion = lesion;
    }

    @Override
    public void irA(int posX, int posY, char direccion) {
        super.irA(posX, posY, direccion);
    }
}
