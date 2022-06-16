/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class Docente extends Persona {

    private String profesion;
    private double salario;
    private double estatura;
    private double peso;

    public Docente() {
    }

    public Docente(String codigo, String nombre, String apellido, String profesion, double salario, double estatura, double peso) {
        super(codigo, nombre, apellido);
        this.profesion = profesion;
        this.salario = salario;
        this.estatura = estatura;
        this.peso = peso;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void calcularIMC() {
        double IMC = (peso) / (Math.pow(estatura, 2));

        System.out.println("IMC = " +IMC);
        if (IMC < 18.5) {
            System.out.println("Su peso es inferior al normal.");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Su peso es normal.");
        } else if (IMC >= 25.0 && IMC <= 29.9) {
            System.out.println("Su peso es superior al normal.");
        } else if (IMC >= 30.0) {
            System.out.println("Sufre de obesidad.");
        }

    }
}
