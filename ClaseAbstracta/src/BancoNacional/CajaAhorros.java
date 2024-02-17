package BancoNacional;

public class CajaAhorros extends Cuentas{
    private double tasaInteres = 1.2;

    @Override
    public void extraer(double monto) {
        saldo += monto;
    }
    public void cobrarIntereses(){
        saldo -= tasaInteres;
    }
    public void informasSaldo(){
        System.out.println("saldo actual "+ saldo);
    }
}
