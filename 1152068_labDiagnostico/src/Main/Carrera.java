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
public class Carrera {

    private String codigo;
    private String nombre;
    private int numCreditos;

    public Carrera() {
    }

    public Carrera(String codigo, String nombre, int numCreditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numCreditos = numCreditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(int numCreditos) {
        this.numCreditos = numCreditos;
    }

}
