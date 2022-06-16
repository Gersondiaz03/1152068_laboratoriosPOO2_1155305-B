/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import control.Control;
import vista.Vista;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class Principal {

    private Vista vista;

    public static void main(String[] args) {
        Vista vista = new Vista();
        Control cl = new Control(vista);
        vista.setVisible(true);
    }
}
