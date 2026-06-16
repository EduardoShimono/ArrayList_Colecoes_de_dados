package br.com.alura.exercicios.aula3.exercicio6;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1234, 3000.99);

        ContaBancaria conta1 = new ContaBancaria(1235, 30000.99);

        ArrayList<ContaBancaria> lista = new ArrayList<>();
        lista.add(conta1);
        lista.add(conta);

        ContaBancaria contaMaiorSaldo = lista.get(0);
        for (ContaBancaria contaBancaria : lista) {
            if (contaBancaria.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = contaBancaria;
            }
        }

        System.out.println("Conta com o maior saldo - numero " + contaMaiorSaldo.getCod() + ", Saldo " + contaMaiorSaldo.getSaldo());
    }
}
