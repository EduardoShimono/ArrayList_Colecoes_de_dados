package br.com.alura.exercicios.aula4.exercicio2_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Titulo titulo = new Titulo("Jorge");

        Titulo titulo1 = new Titulo("Marcos");

        Titulo titulo2 = new Titulo("Ariane");

        List<Titulo> nome = new ArrayList<>();
        nome.add(titulo1);
        nome.add(titulo2);
        nome.add(titulo);
        Collections.sort(nome);
        System.out.println(nome);
    }
}
