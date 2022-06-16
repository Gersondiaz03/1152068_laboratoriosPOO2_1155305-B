package Cliente;

import Cuenta.Cuenta;
import java.util.ArrayList;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class Cliente {

    private String nombre;
    private String apellidos;
    private int RUT;
    private ArrayList<Cuenta> listaCuentas = new ArrayList();
    private ArrayList<Ahorro> listaCuentasAhorro = new ArrayList();
    private ArrayList<Corriente> listaCuentasCorriente = new ArrayList();

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, int RUT) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.RUT = RUT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getRUT() {
        return RUT;
    }

    public void setRUT(int RUT) {
        this.RUT = RUT;
    }

    public ArrayList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }
    
    public ArrayList<Ahorro> getListaCuentasAhorro() {
        return listaCuentasAhorro;
    }

    public ArrayList<Corriente> getListaCuentasCorriente() {
        return listaCuentasCorriente;
    }

    
    public void agregarCuenta(Cuenta cuenta) {
        listaCuentas.add(cuenta);
    }

    public void agregarCuentaAhorro(Ahorro ahorro){
        listaCuentasAhorro.add(ahorro);
    }
    
    public void agregarCuentaCorriente(Corriente corriente){
        listaCuentasCorriente.add(corriente);
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", RUT=" + RUT + '}';
    }

}
