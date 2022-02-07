package com.loiane.estruturadados.pilha.exercicio;

import com.loiane.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Pilha<Integer> pilhaPar = new Pilha<>();
        Pilha<Integer> pilhaImpar = new Pilha<>();

        Scanner scanner = new Scanner(System.in);


        for (int i = 1; i <= 10; i++) {

            System.out.println("Informe o número: ");

            int numero = scanner.nextInt();

            if (numero == 0) {

                //pilha par
                Integer desempilhado = pilhaPar.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha par vazia");
                } else {
                    System.out.println("Número par, desempilhando um elemento da pilha par: "
                            + desempilhado);
                }

                //pilha impar
                desempilhado = pilhaImpar.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha ímpar vazia");
                } else {
                    System.out.println("Número ímpar, desempilhando um elemento da pilha ímpar: " + desempilhado);
                }

            } else if (numero % 2 == 0) {
                System.out.println("Número par: "+numero);
                pilhaPar.empilha(numero);
            } else {
                System.out.println("Número ímpar: "+numero);
                pilhaImpar.empilha(numero);
            }

        }

        System.out.println("Desempilhando números da pilha par");
        while (!pilhaPar.estaVazia()) {
            System.out.println("Desempilhando da pilha par: " + pilhaPar.desempilha());
        }
        System.out.println("Todos os elementos da pilha par foram desempilhados.");
        System.out.println(pilhaPar);


        System.out.println("Desempilhando números da pilha ímpar");
        while (!pilhaImpar.estaVazia()) {
            System.out.println("Desempilhando da pilha ímpar: " + pilhaImpar.desempilha());
        }
        System.out.println("Todos os elementos da pilha ímpar foram desempilhados.");
        System.out.println(pilhaImpar);

    }

}
