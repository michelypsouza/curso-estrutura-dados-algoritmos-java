package com.loiane.estruturadados.pilha.exercicio;

import com.loiane.estruturadados.pilha.Pilha;

public class Exer03 {

    public static void main(String[] args) {

        Pilha<Livro> pilhaLivro = new Pilha<>(20);

        Livro livro = null;
        //cadastrando 6 livros na pilha
        for (int i = 1; i <= 6; i++) {
            livro = criarLivro("Nome do livro "+i, String.valueOf(i*100000),"Autor "+i, String.valueOf(2000+i));

            System.out.println("Pilha de livros criada, pilha está vazia? "+pilhaLivro.estaVazia());

            System.out.println("Empilhando livros na pilha: ");
            pilhaLivro.empilha(livro);

        }

        System.out.println(pilhaLivro.tamanho() + " livros foram empilhados:");
        System.out.println(pilhaLivro);

        System.out.println("Topo da pilha de livros no momento: "+pilhaLivro.topo());

        System.out.println("Desempilhando livros da pilha: ");

        while (!pilhaLivro.estaVazia()) {
            System.out.println("Observando o topo da pilha de livros antes de desempilhar: "+pilhaLivro.topo());
            System.out.println("Desempilhando livro: " + pilhaLivro.desempilha());
        }
        System.out.println("Todos os livros foram desempilhados, pilha vazia: "+pilhaLivro.estaVazia());

    }

    private static Livro criarLivro(String nome, String isbn, String autor, String anoLancamento) {
        return new Livro(nome,isbn,autor,anoLancamento);
    }

}
