/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();

        Chasis chasis = new Chasis(1, "Italia");
        plataforma.agregarChasis(chasis);
        Chasis chasis2 = new Chasis(2, "Espania");
        plataforma.agregarChasis(chasis2);

        Motor motor = new Motor("LOL212", 506);
        plataforma.agregarMotor(motor);
        Motor motor2 = new Motor("XDS153", 120);
        plataforma.agregarMotor(motor2);

        Automovil automovil = new Automovil(1, "Terios", "2020", 4, motor, chasis);
        plataforma.agregarAutomovil(automovil);
        Automovil automovil2 = new Automovil(2, "Lambo", "2022", 2, motor, chasis);
        plataforma.agregarAutomovil(automovil2);

        //'M' corresponde al género masculino - 'F' corresponde al género femenino
        Cliente cliente = new Cliente(1, "Gerson", "Diaz", 'M', "Prados del Este");
        plataforma.agregarCliente(cliente);
        Cliente cliente2 = new Cliente(2, "Andres", "PiedraHita", 'M', "Prados del Norte");
        plataforma.agregarCliente(cliente2);

        cliente.comprarAutomovil(automovil);
        cliente.comprarAutomovil(automovil2);
        cliente2.comprarAutomovil(automovil);

        cliente.mostrarListaAutomoviles();
        System.out.println();
        cliente2.mostrarListaAutomoviles();
        System.out.println();
        plataforma.imprimirPorGenero();
        System.out.println();

        System.out.println("===============================");
        System.out.println("MODIFICAR AUTOMOVIL");
        System.out.println();
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuál automovil deseas modificar? Escribe el id del automovil para el update:"));
        plataforma.modificarAutomovil(id);

    }

}
