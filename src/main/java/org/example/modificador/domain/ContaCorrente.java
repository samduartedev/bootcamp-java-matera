package org.example.modificador.domain;

public class ContaCorrente {
    public static void main(String[] args) {
        Conta contaCorrente = new Conta(100.00);

        contaCorrente.setSaldo(10.00);
        contaCorrente.getSaldo();
    }
}
