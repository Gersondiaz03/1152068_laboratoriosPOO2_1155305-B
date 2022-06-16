/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Departamento;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class Departamento {
    public int codigo;
    public String nombre;
    public int numeroCurulCamara;

    public Departamento(int codigo, String nombre, int numeroCurulCamara) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroCurulCamara = numeroCurulCamara;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCurulCamara() {
        return numeroCurulCamara;
    }

    public void setNumeroCurulCamara(int numeroCurulCamara) {
        this.numeroCurulCamara = numeroCurulCamara;
    }
    
    
}
