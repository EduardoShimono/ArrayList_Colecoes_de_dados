package br.com.alura.exercicios.aula2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("5060", 3000, 29);

        Produto meuProduto = new Produto("brinco", 99, 10);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("carne", 49.99, 200, "31/03/2027");

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto);
        produtos.add(meuProduto);
        produtos.add(produtoPerecivel);
        System.out.println(produtos.size());
        System.out.println(produtos.get(2).toString());
    }
}
