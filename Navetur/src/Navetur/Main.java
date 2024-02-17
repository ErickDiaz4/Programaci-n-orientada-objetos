package Navetur;

public class Main {
    public static void main(String[] args) {
        Velerones velerones = new Velerones("Erick", "Diaz","123456",500.000,
                300.000,2021, 40.0, 5);

        System.out.println(velerones.toString());
        System.out.println("El barco pedido tiene un monto total de: " + velerones.montoAlquiler() +
                           " y " + velerones.grande());
    }
}
