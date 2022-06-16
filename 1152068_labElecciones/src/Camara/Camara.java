/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Camara;

import Candidato.Candidato;
import Departamento.Departamento;
import partidoPolitico.partidoPolitico;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class Camara extends Candidato {

    public int numero;
    public Departamento numeroCurulCamara;
    public static String nombre = "CAMARA DE REPRESENTANTES";

    public Camara() {
    }

    public Camara(int numero, Departamento numeroCurulCamara) {
        this.numero = numero;
        this.numeroCurulCamara = numeroCurulCamara;
    }

    public Camara(int numero, Departamento numeroCurulCamara, String nombre, int CC, String email, char genero, double numeroTelefono, partidoPolitico partido, int numeroCandidato) {
        super(nombre, CC, email, genero, numeroTelefono, partido, numeroCandidato);
        this.numero = numero;
        this.numeroCurulCamara = numeroCurulCamara;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Departamento getNumeroCurulCamara() {
        return numeroCurulCamara;
    }

    public void setNumeroCurulCamara(Departamento numeroCurulCamara) {
        this.numeroCurulCamara = numeroCurulCamara;
    }

    public boolean perteneceCamara(int numero) {

        boolean pertenece;
        if (numero > 100 && numero <= (105)) {
            return pertenece = true;
        } else {
            return pertenece = false;
        }
    }

}
