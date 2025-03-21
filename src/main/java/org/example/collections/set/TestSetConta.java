package org.example.collections.set;

import java.util.HashSet;
import java.util.Set;

public class TestSetConta {
    public static void main(String[] args) {
        Set<Conta> contas = new HashSet<>();

        contas.add(new Conta(100L, 252.00));
        contas.add(new Conta(100L,150.00));

        //builder
        contas.add(
                Conta.builder()
                        .saldo(258.90)
                        .numeroConta(250L)
                        .build()
        );
        contas.forEach(conta -> System.out.println(conta));
    }
}
