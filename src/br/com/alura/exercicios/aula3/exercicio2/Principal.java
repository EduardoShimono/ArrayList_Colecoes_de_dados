package br.com.alura.exercicios.aula3.exercicio2;

public class Principal {
    public static void main(String[] args) {
        Animal animal = new Cachorro();
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
        }else {
            System.out.println("o seu objeto não é um cachorro");
        }
    }
}
