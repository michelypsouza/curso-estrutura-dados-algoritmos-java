package com.loiane.estruturadados.vetor.exercicio;

import com.loiane.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Exerc02 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(5);

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("A");

        System.out.println(arrayList.lastIndexOf("A"));

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("A");

        System.out.println(lista.ultimoIndice("A"));

    }

}
