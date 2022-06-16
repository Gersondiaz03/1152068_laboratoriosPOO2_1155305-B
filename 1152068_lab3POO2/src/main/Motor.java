/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class Motor {

    private String numSerie;
    private int capacidad;

    public Motor() {
    }

    public Motor(String numSerie, int capacidad) {
        this.numSerie = numSerie;
        this.capacidad = capacidad;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motor{");
        sb.append("numSerie=").append(numSerie);
        sb.append(", capacidad=").append(capacidad);
        sb.append('}');
        return sb.toString();
    }

    

}
