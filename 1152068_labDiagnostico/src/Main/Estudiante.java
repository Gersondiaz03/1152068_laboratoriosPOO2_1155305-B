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
public class Estudiante extends Persona {
    
   
    private String semestre;
    private int numCreditos;

    public Estudiante() {
    }

    public Estudiante(String codigo, String nombre, String apellido, String semestre, int numCreditos ) {
        super(codigo, nombre, apellido);
        this.semestre = semestre;
        this.numCreditos = numCreditos;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(int numCreditos) {
        this.numCreditos = numCreditos;
    }
    
    public void matricularProyectoGrado(Carrera carrera){
        if ((carrera.getNumCreditos()*(0.9)) == (numCreditos)) {
            System.out.println("Numero de creditos del estudiante: " +numCreditos);
            System.out.println("Numero de creditos del 90% de la carrera: " +carrera.getNumCreditos()*(0.9));
            System.out.println("Estudiante " +nombre+ " " +apellido+ " YA puede matricular el proyecto de grado.");
        } else 
        {
            System.out.println("Numero de creditos del estudiante: " +numCreditos);
            System.out.println("Numero de creditos del 90% de la carrera: " +carrera.getNumCreditos()*(0.9));
            System.out.println("Estudiante " +nombre+ " " +apellido+ " NO puede matricular el proyecto de grado.");
        }
    }
    
}
