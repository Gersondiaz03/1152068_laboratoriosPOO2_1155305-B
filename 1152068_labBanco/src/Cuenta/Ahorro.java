package Cuenta;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class Ahorro extends Cuenta {

    private int numeroMaximoGiros;
    private float tasaInteres;

    public Ahorro() {
    }

    public Ahorro(int numeroMaximoGiros, float tasaInteres) {
        this.numeroMaximoGiros = numeroMaximoGiros;
        this.tasaInteres = tasaInteres;
    }

    public Ahorro(int numero, float monto, float saldo, int numeroMaximoGiros, float tasaInteres) {
        super(numero, monto, saldo);
        this.numeroMaximoGiros = numeroMaximoGiros;
        this.tasaInteres = tasaInteres;
    }

    public int getNumeroMaximoGiros() {
        return numeroMaximoGiros;
    }

    public void setNumeroMaximoGiros(int numeroMaximoGiros) {
        this.numeroMaximoGiros = numeroMaximoGiros;
    }

    public float getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(float tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public void mostrarSaldo() {

    }

    @Override
    public String toString() {
        return "Ahorro{" + "numeroMaximoGiros=" + numeroMaximoGiros + ", tasaInteres=" + tasaInteres + '}';
    }

}
