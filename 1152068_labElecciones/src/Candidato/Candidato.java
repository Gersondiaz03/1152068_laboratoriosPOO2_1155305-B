/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Candidato;

import Camara.Camara;
import Senado.Senado;
import partidoPolitico.partidoPolitico;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class Candidato {

    public String nombre;
    public int CC;
    public String email;
    public char genero;
    public double numeroTelefono;
    public partidoPolitico partido;
    public int numeroCandidato;
    public int numeroVotos;

    public Candidato() {
    }

    public Candidato(String nombre, int CC, String email, char genero, double numeroTelefono, partidoPolitico partido, int numeroCandidato) {
        this.nombre = nombre;
        this.CC = CC;
        this.email = email;
        this.genero = genero;
        this.numeroTelefono = numeroTelefono;
        this.partido = partido;
        this.numeroCandidato = numeroCandidato;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public partidoPolitico getPartido() {
        return partido;
    }

    public void setPartido(partidoPolitico partido) {
        this.partido = partido;
    }

    public int getNumeroCandidato() {
        return numeroCandidato;
    }

    public void setNumeroCandidato(int numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }

    public double getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(double numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getNumeroVotos() {
        return numeroVotos;
    }

    public void setNumeroVotos(int numeroVotos) {
        this.numeroVotos = numeroVotos;
    }

    public void imprimir() {
        if (numeroCandidato > 0 && numeroCandidato <=100) {
            String nombreEstado = Senado.nombre;
            System.out.println(nombreEstado+"\n"
                    + "Partido politico: " +partido.getNombre()+ ".\n"
                    + "Nombre: " +nombre+ ".\n"
                    + "Documento: " +CC+ ".\n"
                    + "Email: " +email+ ".\n"
                    + "Numero: " +numeroCandidato+ ".\n");
        } else if(numeroCandidato > 100 && numeroCandidato <=105) {
            String nombreEstado = Camara.nombre;
            System.out.println(nombreEstado+"\n"
                    + "Partido politico: " +partido.getNombre()+ ".\n"
                    + "Nombre: " +nombre+ ".\n"
                    + "Documento: " +CC+ ".\n"
                    + "Email: " +email+ ".\n"
                    + "Numero: " +numeroCandidato+ ".\n");
        }
        
    }
}
