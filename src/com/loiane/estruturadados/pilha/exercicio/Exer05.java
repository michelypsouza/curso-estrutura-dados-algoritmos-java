package com.loiane.estruturadados.pilha.exercicio;

import java.util.Scanner;
import java.util.Stack;

public class Exer05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a palavra: ");

        String palavra = scanner.nextLine();

        System.out.println(palavra+" é palíndromo? "+verificaSeEhPalindromo(palavra));

    }

    public static boolean verificaSeEhPalindromo(String palavra){
        //OVO
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < palavra.length(); i++) {
            stack.push(palavra.charAt(i));
        }

        String palavraInvertida = "";
        while (!stack.isEmpty()){
            palavraInvertida += stack.pop();
        }

        return palavra.equalsIgnoreCase(palavraInvertida);
    }

}
