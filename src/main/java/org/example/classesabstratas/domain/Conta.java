package org.example.classesabstratas.domain;

public abstract class Conta {
    private Double saldo;

    public Double getSaldo(){
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public abstract void imprimeExtrato();
}
