package org.example.classesabstratas.test;

import org.example.classesabstratas.domain.ContaCorrente;
import org.example.classesabstratas.domain.ContaPoupanca;

public class TesteClasseAbstrata {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.imprimeExtrato();

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.imprimeExtrato();
    }
}
