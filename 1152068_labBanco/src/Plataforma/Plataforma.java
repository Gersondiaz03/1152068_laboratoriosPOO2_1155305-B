package Plataforma;

import Cliente.Cliente;
import Cuenta.Ahorro;
import Cuenta.Corriente;
import Cuenta.Cuenta;
import java.util.ArrayList;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class Plataforma {

    ArrayList<Cliente> listaClientes = new ArrayList();

    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public boolean existeCliente(int RUT) {
        for (int i = 0; i < listaClientes.size(); i++) {
            if (this.listaClientes.get(i).getRUT() == RUT) {
                return true;
            }
        }
        return false;
    }

    public Cliente obtenerObjetoCliente(int RUT) {
        Cliente cliente = listaClientes.get(0);
        for (int i = 0; i < listaClientes.size(); i++) {
            if (this.listaClientes.get(i).getRUT() == RUT) {
                return cliente = this.listaClientes.get(i);
            }
        }
        return cliente;
    }

    public void imprimirClientes() {
        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println("Lista de clientes");
            Cliente get = listaClientes.get(i);
            System.out.println(get);
        }
        System.out.println();
    }

    public void imprimirCuentasCliente(Cliente cliente) {
        System.out.println("Cuentas pertenecientes al cliente: " + cliente.getNombre() + " " + cliente.getApellidos());
        for (Cuenta cuentas : cliente.getListaCuentas()) {
            System.out.println(cuentas);
        }
        System.out.println();
    }

    public void contarCuentasCliente(Cliente cliente) {
        System.out.println("EL NUMERO DE CUENTAS QUE AL CLIENTE " + cliente.getNombre() + " " + cliente.getApellidos() + " le pertenecen son:");
        System.out.println("Número de cuentas de ahorro: " + cliente.getListaCuentasAhorro().size());
        System.out.println("Número de cuentas corriente: " + cliente.getListaCuentasCorriente().size());
        System.out.println();

}
