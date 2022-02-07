package com.loiane.estruturadados.vetor.exercicio;

import com.loiane.estruturadados.vetor.Lista;

public class Exerc05 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");

        System.out.println(lista);

        lista.limpar();

        System.out.println(lista);
    }

}
