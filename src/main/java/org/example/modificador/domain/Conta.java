package org.example.modificador.domain;

public class Conta {
    private Double saldo;

    public Conta(Double saldo){
        this.saldo = saldo;
    }

    public Double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
