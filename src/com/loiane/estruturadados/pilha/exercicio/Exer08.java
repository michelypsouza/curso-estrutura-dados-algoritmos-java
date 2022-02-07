package com.loiane.estruturadados.pilha.exercicio;

import java.util.Stack;

public class Exer08 {

    public static void main(String[] args) {

        Stack<Integer> pilhaTorrePrincipal = new Stack<>();
        Stack<Integer> pilhaTorreDestino = new Stack<>();
        Stack<Integer> pilhaTorreAuxiliar = new Stack<>();

        //pilhaTorrePrincipal.push(4);
        pilhaTorrePrincipal.push(3);
        pilhaTorrePrincipal.push(2);
        pilhaTorrePrincipal.push(1);

        resolverTorreDeHanoi(pilhaTorrePrincipal.size(), pilhaTorrePrincipal, pilhaTorreDestino, pilhaTorreAuxiliar);

    }

    public static void resolverTorreDeHanoi(int quantidadeDeDiscos, Stack<Integer> pilhaTorrePrincipal,
                                            Stack<Integer> pilhaTorreDestino, Stack<Integer> pilhaTorreAuxiliar){
        if (quantidadeDeDiscos > 0){
            resolverTorreDeHanoi(quantidadeDeDiscos-1, pilhaTorrePrincipal, pilhaTorreAuxiliar, pilhaTorreDestino);
            pilhaTorreDestino.push(pilhaTorrePrincipal.pop());
            System.out.println("**********************************************************");
            System.out.println("Pilha da Torre Original (Torre 1): " + pilhaTorrePrincipal);
            System.out.println("Pilha da Torre de Destino (Torre 2): " + pilhaTorreDestino);
            System.out.println("Pilha da Torre Auxiliar (Torre 3): " + pilhaTorreAuxiliar);
            resolverTorreDeHanoi(quantidadeDeDiscos-1, pilhaTorreAuxiliar, pilhaTorreDestino, pilhaTorrePrincipal);
        }
    }

}
