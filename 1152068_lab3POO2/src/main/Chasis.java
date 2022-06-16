/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class Chasis {

    private int numero;
    private String procedencia;

    public Chasis() {
    }

    public Chasis(int numero, String procedencia) {
        this.numero = numero;
        this.procedencia = procedencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Chasis{");
        sb.append("numero=").append(numero);
        sb.append(", procedencia=").append(procedencia);
        sb.append('}');
        return sb.toString();
    }
    
    

}
