package org.example.classesabstratas.domain;

public class ContaPoupanca extends Conta {
    @Override
    public void imprimeExtrato() {
        System.out.println("Extrato da conta Poupança");

    }
}
