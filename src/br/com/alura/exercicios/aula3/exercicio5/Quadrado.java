package br.com.alura.exercicios.aula3.exercicio5;

public class Quadrado implements Forma{
    int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
