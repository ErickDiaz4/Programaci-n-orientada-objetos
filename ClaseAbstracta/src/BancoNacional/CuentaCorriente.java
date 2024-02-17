package BancoNacional;

public class CuentaCorriente extends Cuentas implements ImpuestoGravable {
    protected double saldoPermitido = 1000;

    @Override
    public void extraer(double monto) {
        saldo -= monto;
    }

    @Override
    public double gravar(double porcentaje) {
        double impuesto= saldo*(porcentaje/100);
        saldo-=impuesto;
        return impuesto;
    }
}
