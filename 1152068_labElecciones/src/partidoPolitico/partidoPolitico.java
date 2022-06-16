/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partidoPolitico;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class partidoPolitico {
    public String nombre;
    public int añoCreacion;

    public partidoPolitico() {
    }

    public partidoPolitico(String nombre, int añoCreacion) {
        this.nombre = nombre;
        this.añoCreacion = añoCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoCreacion() {
        return añoCreacion;
    }

    public void setAñoCreacion(int añoCreacion) {
        this.añoCreacion = añoCreacion;
    }
    
    
    
}
