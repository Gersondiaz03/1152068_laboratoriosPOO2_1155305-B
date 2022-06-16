/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Camara.Camara;
import Candidato.Candidato;
import Departamento.Departamento;
import Eleccion.Eleccion;
import Senado.Senado;
import partidoPolitico.partidoPolitico;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class main {
    public static void main(String[] args) {
        Departamento norteDeSantander = new Departamento (1,"Norte de Santander",3);
        partidoPolitico centro = new partidoPolitico("Centro Democratico", 1992);
        Camara camNdS = new Camara(102, norteDeSantander);
        Senado senNdS = new Senado(92);
        Senado senNdS1= new Senado(37);
        
        Candidato Petro = new Candidato("Petro",1094282914,"petro@gmail.com",'M',314345622, centro, camNdS.getNumero() );
        Candidato Hernando = new Candidato("Hernando",1094282913,"hernando@gmail.com",'M',314345623, centro, senNdS.getNumero());
        Candidato Fico = new Candidato("Fico",1094282912,"fico@gmail.com",'M',314325623, centro, senNdS1.getNumero());
        
        Eleccion eleccion2022 = new Eleccion();
        
        
        eleccion2022.registrarCandidatoCamara(Petro);
        eleccion2022.votarCamara(Petro, camNdS);
        
        System.out.println();
        eleccion2022.registrarCandidatoSenado(Hernando);
        eleccion2022.votarSenado(Hernando, senNdS);
        
        System.out.println();
        eleccion2022.registrarCandidatoSenado(Fico);
        eleccion2022.votarSenado(Fico, senNdS1);
        
        System.out.println();
        eleccion2022.imprimirCamara();
        eleccion2022.imprimirSenado();
        
        System.out.println("================================");
        
        eleccion2022.imprimirVotosCamara(Petro);
        eleccion2022.imprimirVotosSenado(Fico);
    }
    

}
