/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eleccion;

import Camara.Camara;
import Candidato.Candidato;
import Senado.Senado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class Eleccion {

    public ArrayList<Candidato> candidatoCamara = new ArrayList<>();
    public ArrayList<Candidato> candidatoSenado = new ArrayList<>();
    public int votosTotalesCamara;
    public int votosTotalesSenado;
    Senado senado = new Senado();
    Camara camara = new Camara();

    public Eleccion() {
    }

    public void registrarCandidatoCamara(Candidato candidato) {

        if (camara.perteneceCamara(candidato.numeroCandidato)) {
            candidatoCamara.add(candidato);
            System.out.println("Se agregó a la camara");
        } else {
            System.out.println("El presente candidato no se puede agregar a la elección del senado o la cámara.");
        }

    }

    public void registrarCandidatoSenado(Candidato candidato) {

        if (senado.perteneceSenado(candidato.numeroCandidato)) {
            candidatoSenado.add(candidato);
            System.out.println("Se agregó al senado");
        } else {
            System.out.println("El presente candidato no se puede agregar a la elección del senado o la cámara.");
        }

    }

    public void votarCamara(Candidato candidato, Camara camara) {
        if (candidato.numeroCandidato > 100 && candidato.numeroCandidato <= (101 + camara.numeroCurulCamara.getNumeroCurulCamara())) {
            System.out.println("Cuántos votos deseas asignar al candidato " + candidato.nombre + " cuyo número de cámara es " + candidato.numeroCandidato + "\n");
            Scanner votos = new Scanner(System.in);
            int voto = votos.nextInt();
            candidato.numeroVotos = voto;
            votosTotalesCamara += voto;
        } else {
            System.out.println("ERROR: Número no válido para participar en la cámara.");
        }
    }

    public void votarSenado(Candidato candidato, Senado senado) {
        if (candidato.numeroCandidato > 0 && candidato.numeroCandidato <= 100) {
            System.out.println("Cuántos votos deseas asignar al candidato " + candidato.nombre + " cuyo número de senado es " + candidato.numeroCandidato + "\n");
            Scanner votos = new Scanner(System.in);
            int voto = votos.nextInt();
            candidato.numeroVotos = voto;
            votosTotalesSenado += voto;
        } else {
            System.out.println("ERROR: Número no válido para participar en el senado.");
        }
    }

    public void imprimirCamara() {
        for (Candidato candidato : candidatoCamara) {
            if (camara.perteneceCamara(candidato.numeroCandidato)) {
                String nombreEstado = Camara.nombre;
                System.out.println(nombreEstado + "\n"
                        + "Partido politico: " + candidato.partido.getNombre() + ".\n"
                        + "Nombre: " + candidato.nombre + ".\n"
                        + "Documento: " + candidato.CC + ".\n"
                        + "Email: " + candidato.email + ".\n"
                        + "Numero: " + candidato.numeroCandidato + ".\n");
            } else {
                System.out.println("No se registró ningún participante a la cámara.");
            }
        }

    }
    
    public void imprimirSenado(){
        for (Candidato candidato : candidatoSenado) {
            if (senado.perteneceSenado(candidato.numeroCandidato)) {
                String nombreEstado = Senado.nombre;
                System.out.println(nombreEstado + "\n"
                        + "Partido politico: " + candidato.partido.getNombre() + ".\n"
                        + "Nombre: " + candidato.nombre + ".\n"
                        + "Documento: " + candidato.CC + ".\n"
                        + "Email: " + candidato.email + ".\n"
                        + "Numero: " + candidato.numeroCandidato + ".\n");
            } else {
                System.out.println("No se registró ningún participante al senado.");
            }
        }
    }
    
    public void imprimirVotosCamara(Candidato candidato){
        System.out.println(Camara.nombre);
        System.out.println("Nombre del candidato: " +candidato.nombre+ ", Partido del candidato: " +candidato.partido.getNombre()+ ", Numero de tarjeton: " +candidato.numeroCandidato);
        double porcentajeVotacion = ((100)*(candidato.numeroVotos))/(votosTotalesCamara);
        
        System.out.println("El porcentaje de votos del candidato es de " +porcentajeVotacion+ "% del total de " +votosTotalesCamara+ " votos.");
        System.out.println();
    }
    
    public void imprimirVotosSenado(Candidato candidato){
        System.out.println(Senado.nombre);
        System.out.println("Nombre del candidato: " +candidato.nombre+ ", Partido del candidato: " +candidato.partido.getNombre()+ ", Numero de tarjeton: " +candidato.numeroCandidato);
        double porcentajeVotacion = ((100)*(candidato.numeroVotos))/(votosTotalesSenado);
        
        System.out.println("El porcentaje de votos del candidato es de " +porcentajeVotacion+ "% del total de " +votosTotalesSenado+ " votos.");
        System.out.println();
    }
    
}
