package br.com.alura.exercicios.aula1;

import java.util.ArrayList;

public class Teste {
    public static <pessoas> void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Eduardo");
        pessoa.setIdade(17);
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Julia");
        pessoa1.setIdade(22);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa);
        pessoas.add(pessoa1);
        System.out.print("tamanho da lista: ");
        System.out.println(pessoas.size());
        System.out.println(pessoas.get(0).toString());
        System.out.println("Lista de Pessoas");
        for (Pessoa pessoas1 : pessoas){
            System.out.println(pessoas);
        }
    }
}
