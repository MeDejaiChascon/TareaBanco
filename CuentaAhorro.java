class CuentaAhorro extends Cuenta {
    private double tasaReajusteAnual;

    public CuentaAhorro(int numeroCuenta, String fechaApertura, double saldo, double tasaReajusteAnual) {
        super(numeroCuenta, fechaApertura, saldo);
        this.tasaReajusteAnual = tasaReajusteAnual;
    }

    public double getTasaReajusteAnual() {
        return tasaReajusteAnual;
    }

    public void setTasaReajusteAnual(double tasaReajusteAnual) {
        this.tasaReajusteAnual = tasaReajusteAnual;
    }
}