package org.example.Switch;

public class TesteSwitch {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();

        exibeTipoConta(contaCorrente);
        exibeTipoConta(contaPoupanca);
        exibeTipoContaJava17(contaCorrente);

    }

    private static void exibeTipoConta(Conta conta){
        switch (conta.getTipoConta()){
            case "Conta Corrente":
                System.out.println("É uma Conta Corrente");
                break;
            case "Conta Poupança":
                System.out.println("É uma Conta Poupança");
                break;
            case "Conta Comum":
                System.out.println("É uma Conta Comum");
                break;
            default:
                System.out.println("Não foi identificado o tipo de conta");

        }
    }
    private static void exibeTipoContaJava17(Conta conta){
        String mensagem = switch (conta.getTipoConta()){
            case "Conta Corrente" -> "É uma Conta Corrente";
            case "Conta Comum" -> "É uma Cconta Comum";
            case "Conta Poupanca" -> "É uma Conta Poupança";
            default -> "Não foi identificado o tipo de conta";
        };
        System.out.println(mensagem);
    }
}
