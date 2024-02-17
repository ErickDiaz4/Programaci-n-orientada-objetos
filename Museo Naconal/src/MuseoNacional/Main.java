package MuseoNacional;

public class Main {
    public static void main(String[] args) {
        Subasta subasta1 = new Subasta(100.000, "Carro");
        Oferente oferente1 = new Oferente("Erick", "Diaz", 1232124,100.900);
        Oferente oferente2 = new Oferente("Santiago", "Saavedra", 12287593,100.100);
        Oferente oferente3 = new Oferente("Andres", "Suarez", 1279024,99.900);

        subasta1.anadirOferente(oferente1);
        subasta1.anadirOferente(oferente2);
        subasta1.anadirOferente(oferente3);

        subasta1.notificar();

        oferente1.notificar();
        oferente2.notificar();
        oferente3.notificar();
    }
}
