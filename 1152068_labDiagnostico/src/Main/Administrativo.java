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
public class Administrativo extends Persona {

    private int anioIngreso;

    public Administrativo() {
    }

    public Administrativo(String codigo, String nombre, String apellido, int anioIngreso) {
        super(codigo, nombre, apellido);
        this.anioIngreso = anioIngreso;
    }

    public void antiguedad() {
        if ((2022 - this.anioIngreso) > 0) {
            System.out.println("El anio presente es 2022");
            System.out.println("El administrativo " + this.nombre + " " + this.apellido + " ingreso a la universidad en el anio " + this.anioIngreso
                    + ", lleva " + (2022 - this.anioIngreso) + " anios trabajando en la universidad.");
        }
        else {
            System.out.println("El anio presente es 2022");
            System.out.println("El administrativo " + this.nombre + " " + this.apellido + " ingreso a la universidad en el presente anio " + this.anioIngreso);
        }

    }
}
