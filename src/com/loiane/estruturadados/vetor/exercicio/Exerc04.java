package com.loiane.estruturadados.vetor.exercicio;

import com.loiane.estruturadados.vetor.Lista;

public class Exerc04 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");

        System.out.println(lista.obtem(2));
        System.out.println(lista.obtem(5));
    }

}
