package BancoNacional;

public abstract class Cuentas {
    protected double saldo;
    public void depositar(double monto){
        saldo += monto;
    };
    public abstract void extraer(double monto);
    public void saldoTotal(){
        System.out.println("Su saldo actual es igual a " + saldo);
    };
}
