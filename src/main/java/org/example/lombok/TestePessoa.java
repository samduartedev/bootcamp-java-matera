package org.example.lombok;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setId(1L);
        pessoa.setNome("Julia");
        pessoa.setIdade(25);

        System.out.println("Id:" + pessoa.getId());
        System.out.println("Nome:" + pessoa.getNome());
        System.out.println("Idade:" + pessoa.getIdade());
    }
}
