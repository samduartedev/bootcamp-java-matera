package org.example.classesabstratas.domain;

public class ContaCorrente extends Conta {
    @Override
    public void imprimeExtrato() {
        System.out.println("Extrato da Conta Corrente");
    }
}
