package br.com.alura.exercicios.aula3.exercicio4;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("camiseta", 9.99);
        Produto produto1 = new Produto("calça", 10);
        ArrayList<Produto> lista = new ArrayList<>();
        lista.add(produto1);
        lista.add(produto);

        double somaPreco = 0;

        for (Produto produto2 : lista) {
            somaPreco += produto2.getPreco();
        }

        double precoMedio = somaPreco / lista.size();
        System.out.println("Preço médio dos produtos " + precoMedio);
    }
}
