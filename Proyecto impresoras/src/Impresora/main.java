package Impresora;

public class main {
    public static void main(String[] args) {
        ImpresoraColor impresoraColor = new ImpresoraColor("A1200", 10, 2);
        impresoraColor.confirmandoImpresion();
        impresoraColor.imprimir();
        impresoraColor.hojasTotales();
    }
}
