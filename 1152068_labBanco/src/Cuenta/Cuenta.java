/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta;

import Cliente.Cliente;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class Cuenta {

    private int numero;
    private float monto;
    private float saldo;

    public Cuenta() {
    }

    public Cuenta(int numero, float monto, float saldo) {
        this.numero = numero;
        this.monto = monto;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", monto=" + monto + ", saldo=" + saldo + '}';
    }

}
