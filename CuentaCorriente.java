class CuentaCorriente extends Cuenta {
    private double lineaSobregiro;

    public CuentaCorriente(int numeroCuenta, String fechaApertura, double saldo, double lineaSobregiro) {
        super(numeroCuenta, fechaApertura, saldo);
        this.lineaSobregiro = lineaSobregiro;
    }

    public double getLineaSobregiro() {
        return lineaSobregiro;
    }

    public void setLineaSobregiro(double lineaSobregiro) {
        this.lineaSobregiro = lineaSobregiro;
    }
}
