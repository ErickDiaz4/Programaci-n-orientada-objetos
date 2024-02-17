package Impresora;

public class ImpresoraColor extends Impresoras{

    public ImpresoraColor(String modelo, int cantidadHojas, int cantidadImpresiones) {
        super(modelo, cantidadHojas, cantidadImpresiones);
    }

    @Override
    public boolean confirmandoImpresion() {
        return super.confirmandoImpresion();
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }

    @Override
    public void hojasTotales() {
        super.hojasTotales();
    }
}
