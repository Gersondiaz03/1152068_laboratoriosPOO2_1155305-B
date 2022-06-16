/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class Feligres {

    private int cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private int estrato;
    private float valorDiezmo;
    private String estado;

    public Feligres() {
    }

    public Feligres(int cedula, String nombre, String direccion, String telefono, int estrato, float valorDiezmo, String estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estrato = estrato;
        this.valorDiezmo = valorDiezmo;
        this.estado = estado;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public float getValorDiezmo() {
        return valorDiezmo;
    }

    public void setValorDiezmo(float valorDiezmo) {
        this.valorDiezmo = valorDiezmo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static float calcularValorDiezmo(int estrato) {
        if (estrato == 1) {
            return 250000;
        }
        if (estrato == 2) {
            return 500000;
        }
        if (estrato >= 3) {
            return 1000000;
        }
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Feligres{");
        sb.append("cedula=").append(cedula);
        sb.append(", nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", telefono=").append(telefono);
        sb.append(", estrato=").append(estrato);
        sb.append(", valorDiezmo=").append(valorDiezmo);
        sb.append(", estado=").append(estado);
        sb.append('}');
        System.out.println();
        return sb.toString();
    }

    
}
