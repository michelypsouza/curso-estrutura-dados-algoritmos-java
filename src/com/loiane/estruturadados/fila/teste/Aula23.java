package com.loiane.estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {

    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();

        //enfileirar
        fila.add(1); //enqueue
        fila.add(2);

        System.out.println(fila);

        //espiar
        System.out.println(fila.peek());

        //desenfileirar
        System.out.println(fila.remove()); //dequeue

        System.out.println(fila);

    }

}
