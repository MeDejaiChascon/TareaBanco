import java.util.ArrayList;
import java.util.List;

class SucursalBancaria {
    private int codigoSucursal;
    private String codigoPostal;
    private List<CuentaAhorro> cuentasAhorro;
    private List<CuentaCorriente> cuentasCorriente;

    public SucursalBancaria(int codigoSucursal, String codigoPostal) {
        this.codigoSucursal = codigoSucursal;
        this.codigoPostal = codigoPostal;
        this.cuentasAhorro = new ArrayList<>();
        this.cuentasCorriente = new ArrayList<>();
    }

    public void agregarCuentaAhorro(CuentaAhorro cuenta) {
        cuentasAhorro.add(cuenta);
    }

    public void agregarCuentaCorriente(CuentaCorriente cuenta) {
        cuentasCorriente.add(cuenta);
    }

    public int getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(int codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public List<CuentaAhorro> getCuentasAhorro() {
        return cuentasAhorro;
    }

    public List<CuentaCorriente> getCuentasCorriente() {
        return cuentasCorriente;
    }
}