package com.loiane.estruturadados.pilha.teste;

import com.loiane.estruturadados.pilha.Pilha;

import java.util.Stack;

public class Aula18 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        Stack<Integer> stack = new Stack<>();

        //verifica se esta vazio
        System.out.println(stack.isEmpty());

        //para empilhar
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //verifica se esta vazio
        System.out.println(stack.isEmpty());

        //devolve o tamanho da pilha
        System.out.println(stack.size());

        //exibe os dados do objeto - toString
        System.out.println(stack);

        //para espiar, ver o topo da pilha
        System.out.println(stack.peek());

        //para remover, desempilhar
        System.out.println(stack.pop());

        //exibe os dados do objeto - toString
        System.out.println(stack);

        //para espiar, ver o topo da pilha
        System.out.println(stack.peek());


    }

}
