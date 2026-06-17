package br.com.alura.exercicios.aula4.exercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class principal {
    public static void main(String[] args) {
        ArrayList<Integer> numero = new ArrayList<>();
        numero.add(6);
        numero.add(10);
        numero.add(5);

        Collections.sort(numero);
        System.out.println(numero);
    }
}
