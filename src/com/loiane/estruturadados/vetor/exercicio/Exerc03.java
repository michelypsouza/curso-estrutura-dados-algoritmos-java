package com.loiane.estruturadados.vetor.exercicio;

import com.loiane.estruturadados.vetor.Lista;

public class Exerc03 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista);

        lista.remove("A");

        System.out.println(lista);

    }

}
