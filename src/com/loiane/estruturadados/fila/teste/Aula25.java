package com.loiane.estruturadados.fila.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {

    public static void main(String[] args) {

        Queue<Integer> filaComPrioridade = new PriorityQueue<>();

        filaComPrioridade.add(2);
        filaComPrioridade.add(1);

        System.out.println(filaComPrioridade);

        /*

        System.out.println("------------------------------");

        Queue<Paciente> filaComPrioridadePac = new PriorityQueue<>();

        filaComPrioridadePac.add(new Paciente("A",2));
        filaComPrioridadePac.add(new Paciente("B",1));

        System.out.println(filaComPrioridadePac);
        */

        System.out.println("------------------------------");

        Queue<Paciente> filaComPrioridadePac = new PriorityQueue<>(new Comparator<Paciente>() {
            @Override
            public int compare(Paciente p1, Paciente p2) {
                /*
                if (p1.getPrioridade() > p2.getPrioridade()) {
                    return 1;
                } else if (p1.getPrioridade() < p2.getPrioridade()) {
                    return -1;
                }
                return 0;
                */
                return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
            }
        });

        filaComPrioridadePac.add(new Paciente("A",2));
        filaComPrioridadePac.add(new Paciente("B",1));

        System.out.println(filaComPrioridadePac);


    }

}
