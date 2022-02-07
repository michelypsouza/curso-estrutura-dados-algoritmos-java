package com.loiane.estruturadados.vetor.exercicio;

import com.loiane.estruturadados.vetor.Lista;

public class Exerc01 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("F"));

    }

}
