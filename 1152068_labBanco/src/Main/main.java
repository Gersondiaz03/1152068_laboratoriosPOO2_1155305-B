package Main;

import Cliente.Cliente;
import Cuenta.Ahorro;
import Cuenta.Corriente;
import Cuenta.Cuenta;
import Plataforma.Plataforma;
import java.util.Scanner;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class main {

    public static void main(String[] args) {

        Plataforma plataforma = new Plataforma();
        Cliente clienteGeneral = new Cliente();
        Cuenta cuentaGeneral = new Cuenta();

        Cuenta cuenta1 = new Ahorro(123456, (float) 5.000, (float) 10.000, 5, (float) 3.5);
        Cuenta cuenta2 = new Corriente(223456, (float) 6.000, (float) 10.000, (float) 2.000, (float) 3.500, (float) 4.000);

        Cliente cliente = new Cliente("Gerson", "Diaz", 1152068);
        plataforma.agregarCliente(cliente);
        cliente.agregarCuenta(cuenta1);
        cliente.agregarCuentaAhorro((Ahorro)cuenta1);
        cliente.agregarCuenta(cuenta2);
        cliente.agregarCuentaCorriente((Corriente)cuenta2);

        Cliente cliente2 = new Cliente("Andres", "Pastrana", 1152069);
        plataforma.agregarCliente(cliente2);
        cliente2.agregarCuenta(cuenta1);
        cliente2.agregarCuentaAhorro((Ahorro)cuenta1);

        Cliente cliente3 = new Cliente("Diego", "Solorzano", 1152070);
        plataforma.agregarCliente(cliente3);
        cliente3.agregarCuenta(cuenta2);
        cliente3.agregarCuentaCorriente((Corriente)cuenta2);

        Scanner sc = new Scanner(System.in);

        byte opcion = 1;
        while (opcion != 0) {
            System.out.println("""
                               Bienvenido al CucuCredito! Que deseas hacer? 
                               1. Mostrar cuentas asignadas a un cliente. 
                               2. Determinar la cantidad de cuentas de un cliente en espec\u00edfico. 
                               3. Mostrar el saldo de la cuenta de ahorros y corriente de un cliente en espec\u00edfico. 
                               0. Salir del aplicativo.""");
            opcion = sc.nextByte();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Digite el RUT del cliente del que desea mostrar sus diferentes cuentas:");
                    int rut = sc.nextInt();
                    if (plataforma.existeCliente(rut) == true) {
                        plataforma.imprimirCuentasCliente(plataforma.obtenerObjetoCliente(rut));
                    }
                    else {
                        System.out.println("NO EXISTE EL CLIENTE EN EL SISTEMA!");
                    }
                    System.out.println();
                }

                case 2 -> {
                    System.out.println("Digite el RUT del cliente al que desea mostrar el numero (conteo) de cuentas:");
                    int rut = sc.nextInt();
                    if (plataforma.existeCliente(rut)) {
                        plataforma.contarCuentasCliente(plataforma.obtenerObjetoCliente(rut));
                    }
                    else {
                        System.out.println("NO EXISTE EL CLIENTE EN EL SISTEMA!");
                    }
                    System.out.println();
                }

                case 3 -> {
                    System.out.println("Digite el RUT del cliente del que desea mostrar sus saldos de cuenta:");
                    int rut = sc.nextInt();
                    System.out.println();
                }

                case 0 ->
                    System.out.println("Hasta luego!");
                default ->
                    throw new AssertionError();
            }
        }

    }

}
