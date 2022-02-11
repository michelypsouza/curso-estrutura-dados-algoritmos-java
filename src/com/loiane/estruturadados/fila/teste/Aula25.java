package com.loiane.estruturadados.fila.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {

    public static void main(String[] args) {

        Queue<Integer> filaComPrioridade = new PriorityQueue<>();

        filaComPrioridade.add(2);
        filaComPrioridade.add(1);
        filaComPrioridade.add(4);
        filaComPrioridade.add(3);

        //System.out.println(filaComPrioridade);

        System.out.println(filaComPrioridade.poll());
        System.out.println(filaComPrioridade.poll());
        System.out.println(filaComPrioridade.poll());
        System.out.println(filaComPrioridade.poll());

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
                return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
            }
        });

        filaComPrioridadePac.add(new Paciente("A",2));
        filaComPrioridadePac.add(new Paciente("B",1));
        filaComPrioridadePac.add(new Paciente("D",4));
        filaComPrioridadePac.add(new Paciente("C",3));

        System.out.println(filaComPrioridadePac.poll());
        System.out.println(filaComPrioridadePac.poll());
        System.out.println(filaComPrioridadePac.poll());
        System.out.println(filaComPrioridadePac.poll());

    }

}
