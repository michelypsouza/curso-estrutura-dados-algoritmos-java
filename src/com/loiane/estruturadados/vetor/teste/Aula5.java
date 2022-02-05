package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula5 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1"); //0
        vetor.adiciona("elemento 2"); //1
        vetor.adiciona("elemento 3"); //2

        //posicoes OK
        System.out.println(vetor.busca(0));
        System.out.println(vetor.busca(1));
        System.out.println(vetor.busca(2));

        //posicoes exception
        System.out.println(vetor.busca(-1));
        System.out.println(vetor.busca(3));
        System.out.println(vetor.busca(15));
    }
}
