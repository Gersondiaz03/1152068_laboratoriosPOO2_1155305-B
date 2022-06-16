/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta;

/**
 *
 * @author estudiante
 */
public class Corriente extends Cuenta {

    private float lineaCredito;
    private float saldoDisponible;
    private float saldoContable;

    public Corriente() {
    }

    public Corriente(int numero, float monto, float saldo, float lineaCredito, float saldoDisponible, float saldoContable) {
        super(numero, monto, saldo);
        this.lineaCredito = lineaCredito;
        this.saldoDisponible = saldoDisponible;
        this.saldoContable = saldoContable;
    }

    public float getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(float lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    public float getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(float saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public float getSaldoContable() {
        return saldoContable;
    }

    public void setSaldoContable(float saldoContable) {
        this.saldoContable = saldoContable;
    }

    public void mostrarSaldo() {

    }

    @Override
    public String toString() {
        return "Corriente{" + "lineaCredito=" + lineaCredito + ", saldoDisponible=" + saldoDisponible + ", saldoContable=" + saldoContable + '}';
    }

}
