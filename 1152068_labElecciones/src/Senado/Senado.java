/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Senado;

import Candidato.Candidato;
import partidoPolitico.partidoPolitico;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class Senado extends Candidato {

    public int numero;
    public static String nombre = "SENADOR";

    public Senado(int numero) {
        this.numero = numero;
    }

    public Senado() {
    }

    public Senado(String nombre, int CC, String email, char genero, double numeroTelefono, partidoPolitico partido, int numeroCandidato, int numero) {
        super(nombre, CC, email, genero, numeroTelefono, partido, numeroCandidato);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean perteneceSenado(int numero) {

        boolean pertenece;
        if (numero > 0 && numero <= 100) {
            return pertenece = true;
        } else {
            return pertenece = false;
        }
    }
}
