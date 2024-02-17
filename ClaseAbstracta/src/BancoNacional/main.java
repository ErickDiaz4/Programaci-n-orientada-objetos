package BancoNacional;

public class main {
    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente();
        cuenta1.depositar(100);
        cuenta1.saldoTotal();
        double impuesto = cuenta1.gravar(10);
        System.out.println("El impuesto gravado " + impuesto);
        cuenta1.saldoTotal();
    }
}
