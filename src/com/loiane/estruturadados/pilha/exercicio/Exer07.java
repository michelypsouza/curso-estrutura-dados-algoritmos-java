package com.loiane.estruturadados.pilha.exercicio;

import java.util.Stack;

public class Exer07 {

    public static void main(String[] args) {

        imprime(2);
        imprime(4);
        imprime(10);
        imprime(25);
        imprime(10035);

    }

    public static void imprime(int numero){
        System.out.println(numero + " em binário é: " + decimalBinario(numero));
    }

    public static String decimalBinario(int numero){

        Stack<Integer> stack = new Stack<>();
        String numeroBinario = "";
        int restoDivisaoBinario;

        while (numero > 0){
            restoDivisaoBinario = numero % 2;
            stack.push(restoDivisaoBinario);
            numero = numero /2;
        }

        do {
            numeroBinario += stack.pop();
        } while (!stack.isEmpty());
        return numeroBinario;
    }

}
