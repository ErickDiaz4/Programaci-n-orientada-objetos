import Objetos.Cliente;
import Objetos.Facturador;
import Objetos.Producto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Sandwich de pollo", "pollo, lechuga, tomate , salsas", 2.00);
        Cliente cliente = new Cliente("Santiago", "Sopo cundinamarca");
        //cliente.comprar(producto);
        Facturador facturador = new Facturador(cliente , producto );
        facturador.facturar();
    }
}