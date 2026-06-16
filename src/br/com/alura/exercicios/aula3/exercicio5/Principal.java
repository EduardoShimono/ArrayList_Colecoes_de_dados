package br.com.alura.exercicios.aula3.exercicio5;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(4);

        Quadrado quadrado = new Quadrado(4);

        ArrayList<Forma> lista = new ArrayList<>();
        lista.add(circulo);
        lista.add(quadrado);

        for (Forma forma : lista) {
            System.out.println("a área da sua forma é de " + forma.calcularArea());
        }

    }
}
