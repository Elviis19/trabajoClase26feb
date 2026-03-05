package com.pbc.cuenta;

public class cuenta implements ITransaccion {

    private String titular;
    private double saldo;

    public cuenta(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
            System.out.println("Depósito exitoso. Saldo actual: $" + saldo);
        } else {
            System.out.println("El monto debe ser mayor a $0");
        }
    }

    public boolean retirar(double monto) {
        if (monto > saldo) {
            System.out.println("Saldo insuficiente.");
            return false;
        }
        saldo = saldo - monto;
        System.out.println("Retiro exitoso. Saldo actual: $" + saldo);
        return true;
    }
}
