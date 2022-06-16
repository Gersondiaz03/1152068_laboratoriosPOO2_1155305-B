/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plataforma;

import Modelo.Feligres;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class Plataforma {

    public ArrayList<Feligres> listaFeligreces = new ArrayList<>();

    public void agregarFeligres(Feligres feligres) {
        listaFeligreces.add(feligres);
        JOptionPane.showMessageDialog(null, "FELIGRES GUARDADO CON EXITO.");
    }

    public String imprimirFeligreces() {
        return Arrays.toString(listaFeligreces.toArray());
    }

    public String buscarFeligres(int cedula) {
        for (int i = 0; i < listaFeligreces.size(); i++) {
            if (listaFeligreces.get(i).getCedula() == cedula) {
                return listaFeligreces.get(i).toString();
            }
        }
        return "No existe el feligres que buscas!";
    }

    public boolean existeFeligres(int cedula) {
        for (int i = 0; i < listaFeligreces.size(); i++) {
            if (listaFeligreces.get(i).getCedula() == cedula) {
                return true;
            }
        }
        return false;
    }

    public void actualizarFeligres(Feligres feligres) {
        for (int i = 0; i < listaFeligreces.size(); i++) {
            if (listaFeligreces.get(i).getCedula() == feligres.getCedula()) {
                listaFeligreces.get(i).setNombre(feligres.getNombre());
                listaFeligreces.get(i).setDireccion(feligres.getDireccion());
                listaFeligreces.get(i).setTelefono(feligres.getTelefono());
                listaFeligreces.get(i).setEstado(feligres.getEstado());
                JOptionPane.showMessageDialog(null, "ACTUALIZACION CON EXITO.");
            }
        }
    }

    public void eliminarFeligres(int cedula) {
        for (int i = 0; i < listaFeligreces.size(); i++) {
            if (listaFeligreces.get(i).getCedula() == cedula) {
                listaFeligreces.remove(i);
                JOptionPane.showMessageDialog(null, "FELIGRES ELIMINADO CON EXITO.");
            }
            else {
                JOptionPane.showMessageDialog(null, "NO HAY NINGUN FELIGRES CON CEDULA " + cedula);
            }
        }
    }

    public String consultarDiezmoFeligres(int cedula) {
        for (int i = 0; i < listaFeligreces.size(); i++) {
            if (listaFeligreces.get(i).getCedula() == cedula) {
                return listaFeligreces.get(i).getValorDiezmo() + "";
            }
        }
        return "NO EXISTE ESE FELIGRES EN EL SISTEMA";
    }

    public String pagarDiezmo(int cedula) {
        for (int i = 0; i < listaFeligreces.size(); i++) {
            if (listaFeligreces.get(i).getCedula() == cedula) {
                listaFeligreces.get(i).setValorDiezmo(0);
                listaFeligreces.get(i).setEstado("Cumplido");
                return "Pago de diezmo realizado con exito! Feligres " +cedula;
            }
        }
        return "Pago realizado con exito!";
    }

    public String totalizarDiezmos() {
        float totalDiezmo = 0;
        for (int i = 0; i < listaFeligreces.size(); i++) {
            totalDiezmo += listaFeligreces.get(i).getValorDiezmo();
        }
        return "El total a pagar de diezmo de todos los feligreces es de " + totalDiezmo;

    }
}
