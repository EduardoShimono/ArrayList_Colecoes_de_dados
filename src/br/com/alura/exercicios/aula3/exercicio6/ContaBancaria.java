package br.com.alura.exercicios.aula3.exercicio6;

public class ContaBancaria {
    private int cod;
    private double saldo;

    public ContaBancaria(int cod, double saldo) {
        this.cod = cod;
        this.saldo = saldo;
    }

    public int getCod() {
        return cod;
    }
    public double getSaldo() {
        return saldo;
    }
}
