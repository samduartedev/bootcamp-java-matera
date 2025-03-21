package org.example.sobrescritaSobrecarga;

public class TesteSobrescritaSobrecarga {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(6000.00);
        contaPoupanca.depositar(500.00);

        ContaCorrente contaCorrenteSemTaxa = new ContaCorrente(9000.00);
        contaCorrenteSemTaxa.sacar(1000.00);

        System.out.println("Saldo da Conta Poupança: " + contaPoupanca.getSaldo());
        System.out.println("Saldo da Conta Corrente sem taxa: " + contaCorrenteSemTaxa.getSaldo());

        ContaCorrente contaCorrenteComTaxa = new ContaCorrente(9000.00);
        contaCorrenteComTaxa.sacar(1000.00,0.45);

        System.out.println("Saldo da Conta Corrente com taxa: " + contaCorrenteComTaxa.getSaldo());


    }
}
