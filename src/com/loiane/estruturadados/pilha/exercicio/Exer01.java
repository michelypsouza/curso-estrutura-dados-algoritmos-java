package com.loiane.estruturadados.pilha.exercicio;

import com.loiane.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

            System.out.println("Informe o número: ");

            int numero = scanner.nextInt();

            // se o numero for par vamos empilhar
            if (numero % 2 == 0) {

                System.out.println("Número par, empilhando o número: " + numero);
                pilha.empilha(numero);
            } else {

                Integer desempilhado = pilha.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha está vazia");
                } else {
                    System.out.println("Número ímpar, desempilhando um elemento da pilha: "
                            + desempilhado);
                }

            }

        }

        System.out.println("Todos os números foram informados, desempilhando números da pilha");

        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando um elemento da pilha: "
                    + pilha.desempilha());
        }
        System.out.println("Todos os elementos foram desempilhados.");

    }

}
