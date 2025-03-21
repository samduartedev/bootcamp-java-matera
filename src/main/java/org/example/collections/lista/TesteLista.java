package org.example.collections.lista;

import java.util.ArrayList;
import java.util.List;

public class TesteLista {
    public static void main(String[] args) {
        List<String> contas = new ArrayList<>();

        contas.add("Conta Poupança");
        contas.add("Conta Corrente");
        contas.add("Conta Pagamento");
        contas.add("Conta Poupança");

        System.out.println(contas.get(0));
        System.out.println(contas.get(1));
        System.out.println(contas.get(2));
        System.out.println(contas.get(3));

    }
}
