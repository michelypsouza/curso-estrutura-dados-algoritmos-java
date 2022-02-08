package com.loiane.estruturadados.fila.exercicio;

import com.loiane.estruturadados.fila.Fila;

public class Exer02 {

    public static void main(String[] args) {

        Fila<String> normal = new Fila<>();
        Fila<String> prioridade = new Fila<>();

        final int MAX_PRIORIDADE = 3;

        normal.enfileira("Pessoa 1");
        normal.enfileira("Pessoa 2");
        normal.enfileira("Pessoa 3");

        prioridade.enfileira("Pessoa 1P");
        prioridade.enfileira("Pessoa 2P");
        prioridade.enfileira("Pessoa 3P");
        prioridade.enfileira("Pessoa 4P");
        prioridade.enfileira("Pessoa 5P");

        normal.enfileira("Pessoa 4");
        normal.enfileira("Pessoa 5");
        normal.enfileira("Pessoa 6");
        normal.enfileira("Pessoa 7");
        normal.enfileira("Pessoa 8");

        while (!normal.estaVazia() || !prioridade.estaVazia()){

            int cont = 0;

            while (!prioridade.estaVazia() && cont < MAX_PRIORIDADE){
                atenderPessoa(prioridade);
                cont++;
            }

            if (!normal.estaVazia()) {
                atenderPessoa(normal);
            }

            if (prioridade.estaVazia()){
                while (!normal.estaVazia()){
                    atenderPessoa(normal);
                }
            }

        }

    }

    private static void atenderPessoa(Fila<String> fila) {
        String pessoaAtendida = fila.desenfileira();
        System.out.println(pessoaAtendida+" foi atendida.");
    }

}
