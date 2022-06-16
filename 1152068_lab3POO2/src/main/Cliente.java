/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class Cliente {

    private int id;
    private String nombre;
    private String apellido;
    private char genero;
    private String direccion;

    private ArrayList<Automovil> listaAutomovil = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(int id, String nombre, String apellido, char genero, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void comprarAutomovil(Automovil automovil){
        listaAutomovil.add(automovil);
    }
    public void mostrarListaAutomoviles() {
            System.out.println("Lista de automoviles pertenecientes a " +this.nombre+ " "+this.apellido+": ");
            for (Automovil vehiculo : listaAutomovil) {
                System.out.println(vehiculo);
            }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", genero=").append(genero);
        sb.append(", direccion=").append(direccion);
        sb.append(", listaAutomovil=").append(listaAutomovil);
        sb.append('}');
        return sb.toString();
    }

    
}
