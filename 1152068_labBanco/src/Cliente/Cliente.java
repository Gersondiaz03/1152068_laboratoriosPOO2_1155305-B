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

    public void agregarCuenta(Cuenta cuenta) {
        listaCuentas.add(cuenta);
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", RUT=" + RUT + '}';
    }

}
