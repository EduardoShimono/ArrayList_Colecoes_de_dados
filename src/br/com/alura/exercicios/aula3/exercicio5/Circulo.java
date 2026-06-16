package br.com.alura.exercicios.aula3.exercicio5;

public class Circulo implements Forma {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
