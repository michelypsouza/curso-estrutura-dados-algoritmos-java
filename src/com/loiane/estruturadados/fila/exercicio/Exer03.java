package com.loiane.estruturadados.fila.exercicio;

import java.util.PriorityQueue;
import java.util.Queue;

public class Exer03 {

    private static final int VERDE = 2;
    private static final int AMARELO = 1;
    private static final int VERMELHO = 0;

    public static void main(String[] args) {

        Queue<Pessoa> fila = new PriorityQueue<>();
        fila.add(new Pessoa("Pessoa 1", VERDE));
        fila.add(new Pessoa("Pessoa 2", AMARELO));
        fila.add(new Pessoa("Pessoa 3", VERMELHO));
        fila.add(new Pessoa("Pessoa 4", VERDE));
        fila.add(new Pessoa("Pessoa 5", VERDE));
        fila.add(new Pessoa("Pessoa 6", VERMELHO));

        PrSocorroAtendimento atendimento = new PrSocorroAtendimento(fila);
        PrSocorroNovosPacientes pacientes = new PrSocorroNovosPacientes(fila);

        Thread t1 = new Thread(atendimento);
        Thread t2 = new Thread(pacientes);

        t1.start();
        t2.start();


    }

}
