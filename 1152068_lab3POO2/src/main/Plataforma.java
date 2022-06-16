/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class Plataforma {

    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private ArrayList<Automovil> listaAutomovil = new ArrayList<>();
    private ArrayList<Chasis> listaChasis = new ArrayList<>();
    private ArrayList<Motor> listaMotor = new ArrayList<>();
    private Chasis chasis;
    private Motor motor;

    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void agregarAutomovil(Automovil automovil) {
        listaAutomovil.add(automovil);
    }

    public void agregarMotor(Motor motor) {
        listaMotor.add(motor);
    }

    public void agregarChasis(Chasis chasis) {
        listaChasis.add(chasis);
    }

    public void imprimirAutomoviles() {
        for (Automovil automovil : listaAutomovil) {
            System.out.println(automovil);
        }
    }

    public void modificarAutomovil(int id) {
        for (int i = 0; i < listaAutomovil.size(); i++) {
            if (listaAutomovil.get(i).getId() == id) {
                System.out.println("MODIFICACION DE CARRO CUYA MARCA ES " + this.listaAutomovil.get(i).getMarca() + " y cuyo id es " + id);
                
                String marca = JOptionPane.showInputDialog(null,"Escriba la nueva marca del carro: ");
                listaAutomovil.get(i).setMarca(marca);
                
                String modelo = JOptionPane.showInputDialog(null, "Escriba el nuevo modelo para el carro de marca " + this.listaAutomovil.get(i).getMarca() + " y cuyo id es " + id);
                listaAutomovil.get(i).setModelo(modelo);

                int numPuertas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el nuevo numero de puertas para el carro de marca " + this.listaAutomovil.get(i).getMarca() + " y cuyo id es " + id));
                listaAutomovil.get(i).setNumPuertas(numPuertas);

                System.out.println("------------------");
                for (Motor motors : listaMotor) {
                    System.out.println(motors);
                }
                for (Chasis chasiss : listaChasis) {
                    System.out.println(chasiss);
                }

                String numSerie = JOptionPane.showInputDialog(null, "Ingrese el numero de serie del motor nuevo a cambiar: ");
                listaAutomovil.get(i).setMotor(cambiarMotor(listaAutomovil.get(i), numSerie));

                int numeroChasis = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de chasis nuevo a cambiar: "));
                listaAutomovil.get(i).setChasis(cambiarChasis(listaAutomovil.get(i), numeroChasis));

                System.out.println();
                System.out.println("AUTOMOVIL MODIFICADO CON EXITO OwO");
                imprimirAutomoviles();

            }
        }
    }

    public Motor cambiarMotor(Automovil automovil, String numSerie) {

        for (int i = 0; i < listaMotor.size(); i++) {
            if (listaMotor.get(i).getNumSerie().equals(numSerie)) {

                return listaMotor.get(i);
            }
        }
        System.out.println("NO EXISTE ESTE MOTOR EN EL SISTEMA");
        return automovil.getMotor();
    }

    public Chasis cambiarChasis(Automovil automovil, int numero) {
        for (int i = 0; i < listaChasis.size(); i++) {
            if (listaChasis.get(i).getNumero() == numero) {
                return listaChasis.get(i);
            }
        }
        System.out.println("NO EXISTE ESTE CHASIS EN EL SISTEMA");
        return automovil.getChasis();
    }

    public void imprimirPorGenero() {
        char masculino = 'M';
        char femenino = 'F';
        int contM = 0;
        int contF = 0;

        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getGenero() == masculino) {
                contM++;
            }
            else if (listaClientes.get(i).getGenero() == femenino) {
                contF++;
            }
        }

        System.out.println("Cantidad de clientes masculinos en la plataforma: " + contM);
        System.out.println("Cantidad de clientes femeninas en la plataforma: " + contF);
    }
}
