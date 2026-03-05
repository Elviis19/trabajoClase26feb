package com.pbc.cuenta;

public interface ITransaccion {
    void depositar(double monto);
    boolean retirar(double monto);
    double getSaldo();
}