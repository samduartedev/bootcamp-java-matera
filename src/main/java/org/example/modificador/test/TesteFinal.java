package org.example.modificador.test;

import org.example.modificador.domain.Conta;

public class TesteFinal {
    final static Conta contaFinal = new Conta(500.00);

    public static void main(String[] args) {
        contaFinal.setSaldo(600.00);
        System.out.println(contaFinal.getSaldo());
    }
}
