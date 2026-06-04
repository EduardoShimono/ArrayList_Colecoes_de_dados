package br.com.alura.exercicios.aula2;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "[nome: " + nome + " preço: " + preco + " quantidade: " + quantidade + "]";
    }
}
