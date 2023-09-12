import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestionBanco banco = new GestionBanco();

        // Agregar clientes
        banco.agregarCliente(1, "Cliente 1");
        banco.agregarCliente(2, "Cliente 2");

        // Agregar cuentas
        banco.agregarCuenta(1, new CuentaAhorro(101, "01/01/2023", 1000.0, 0.03));
        banco.agregarCuenta(1, new CuentaCorriente(102, "01/01/2023", 2000.0, 500.0));
        banco.agregarCuenta(2, new CuentaAhorro(201, "01/01/2023", 1500.0, 0.02));

        // Agregar sucursal
        SucursalBancaria sucursal = new SucursalBancaria(1, "12345");
        sucursal.agregarCuentaAhorro(new CuentaAhorro(301, "01/01/2023", 3000.0, 0.04));
        sucursal.agregarCuentaCorriente(new CuentaCorriente(302, "01/01/2023", 4000.0, 1000.0));
        banco.agregarSucursal(sucursal);

        // Obtener cuentas de un cliente
        List<Cuenta> cuentasCliente1 = banco.obtenerCuentasCliente(1);
        System.out.println("Cuentas del Cliente 1:");
        for (Cuenta cuenta : cuentasCliente1) {
            System.out.println("Número de Cuenta: " + cuenta.getNumeroCuenta());
        }

        // Obtener cuentas de ahorro de una sucursal
        List<CuentaAhorro> cuentasAhorroSucursal = banco.obtenerCuentasAhorroSucursal(1);
        System.out.println("Cuentas de Ahorro de la Sucursal 1:");
        for (CuentaAhorro cuenta : cuentasAhorroSucursal) {
            System.out.println("Número de Cuenta de Ahorro: " + cuenta.getNumeroCuenta());
        }

        // Obtener cuentas corriente de una sucursal
        List<CuentaCorriente> cuentasCorrienteSucursal = banco.obtenerCuentasCorrienteSucursal(1);
        System.out.println("Cuentas Corriente de la Sucursal 1:");
        for (CuentaCorriente cuenta : cuentasCorrienteSucursal) {
            System.out.println("Número de Cuenta Corriente: " + cuenta.getNumeroCuenta());
        }
    }
}