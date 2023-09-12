import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GestionBanco {
    private Map<Integer, Cliente> clientes;
    private List<SucursalBancaria> sucursales;

    public GestionBanco() {
        this.clientes = new HashMap<>();
        this.sucursales = new ArrayList<>();
    }

    public void agregarCliente(int id, String nombre) {
        Cliente cliente = new Cliente(id, nombre);
        clientes.put(id, cliente);
    }

    public void agregarCuenta(int idCliente, Cuenta cuenta) {
        Cliente cliente = clientes.get(idCliente);
        if (cliente != null) {
            cliente.agregarCuenta(cuenta);
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    public void agregarSucursal(SucursalBancaria sucursal) {
        sucursales.add(sucursal);
    }

    public List<Cuenta> obtenerCuentasCliente(int idCliente) {
        Cliente cliente = clientes.get(idCliente);
        if (cliente != null) {
            return cliente.getCuentas();
        } else {
            System.out.println("Cliente no encontrado.");
            return new ArrayList<>();
        }
    }

    public List<CuentaAhorro> obtenerCuentasAhorroSucursal(int codigoSucursal) {
        for (SucursalBancaria sucursal : sucursales) {
            if (sucursal.getCodigoSucursal() == codigoSucursal) {
                return sucursal.getCuentasAhorro();
            }
        }
        System.out.println("Sucursal no encontrada.");
        return new ArrayList<>();
    }

    public List<CuentaCorriente> obtenerCuentasCorrienteSucursal(int codigoSucursal) {
        for (SucursalBancaria sucursal : sucursales) {
            if (sucursal.getCodigoSucursal() == codigoSucursal) {
                return sucursal.getCuentasCorriente();
            }
        }
        System.out.println("Sucursal no encontrada.");
        return new ArrayList<>();
    }
}