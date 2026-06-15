package br.com.alura.exercicios.aula3.exercicio1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> lista =new ArrayList<>();
        lista.add("fofo");
        lista.add("isa");
        lista.add("Eduardo");
        for (String palavras : lista) {
            System.out.println("palavra: " + palavras);
        }
    }
}
