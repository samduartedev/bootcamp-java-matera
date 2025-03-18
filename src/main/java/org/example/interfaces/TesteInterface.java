package org.example.interfaces;

public class TesteInterface {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(5000.00);
        System.out.println("Saldo Conta Corrente após depósito: " + contaCorrente.getSaldo());

        contaCorrente.sacar(200.00);
        System.out.println("Saldo Conta Corrente após saque: "+ contaCorrente.getSaldo());

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(15000.00);
        System.out.println("Saldo Conta Poupança após depósito: "+ contaPoupanca.getSaldo());
    }
}
