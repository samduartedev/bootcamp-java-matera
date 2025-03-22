package org.example.classeanonima;

public class TesteClasseAnonima {
    public static void main(String[] args) {
        CarteiraContas carteira = new CarteiraContas();
        carteira.contaCorrente.imprimeTipoConta();
        carteira.contaPoupanca.imprimeTipoConta();
    }
}
