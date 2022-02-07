package com.loiane.estruturadados.pilha.exercicio;

import com.loiane.estruturadados.pilha.Pilha;

import java.util.Stack;

public class Exer04 {

    public static void main(String[] args) {

        Stack<Livro> pilhaLivro = new Stack<>();

        Livro livro = null;
        //cadastrando 6 livros na pilha
        for (int i = 1; i <= 6; i++) {
            livro = criarLivro("Nome do livro "+i, String.valueOf(i*100000),"Autor "+i, String.valueOf(2000+i));

            System.out.println("Pilha de livros criada, pilha está vazia? "+pilhaLivro.isEmpty());

            System.out.println("Empilhando livros na pilha: ");
            pilhaLivro.push(livro);

        }

        System.out.println(pilhaLivro.size() + " livros foram empilhados:");
        System.out.println(pilhaLivro);

        System.out.println("Topo da pilha de livros no momento: "+pilhaLivro.peek());

        System.out.println("Desempilhando livros da pilha: ");

        while (!pilhaLivro.isEmpty()) {
            System.out.println("Observando o topo da pilha de livros antes de desempilhar: "+pilhaLivro.peek());
            System.out.println("Desempilhando livro: " + pilhaLivro.pop());
        }
        System.out.println("Todos os livros foram desempilhados, pilha vazia: "+pilhaLivro.isEmpty());

    }

    private static Livro criarLivro(String nome, String isbn, String autor, String anoLancamento) {
        return new Livro(nome,isbn,autor,anoLancamento);
    }

}
