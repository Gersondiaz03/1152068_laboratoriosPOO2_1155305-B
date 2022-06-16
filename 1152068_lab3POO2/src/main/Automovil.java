/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class Automovil {

    private int id;
    private String marca;
    private String modelo;
    private int numPuertas;
    private Motor motor;
    private Chasis chasis;
    private Plataforma plataforma;

    public Automovil() {
    }

    public Automovil(int id, String marca, String modelo, int numPuertas, Motor motor, Chasis chasis) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.numPuertas = numPuertas;
        this.motor = motor;
        this.chasis = chasis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    @Override
    public String toString() {
        return "Automovil{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", numPuertas=" + numPuertas + ", motor=" + motor + ", chasis=" + chasis + '}';
    }

}
