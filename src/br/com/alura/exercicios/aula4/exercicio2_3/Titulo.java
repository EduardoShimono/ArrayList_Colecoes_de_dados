package br.com.alura.exercicios.aula4.exercicio2_3;

public class Titulo implements Comparable<Titulo>{
    private String nome;

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
