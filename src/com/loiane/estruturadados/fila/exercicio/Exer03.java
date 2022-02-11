package com.loiane.estruturadados.fila.exercicio;

import java.util.PriorityQueue;
import java.util.Queue;

public class Exer03 {

    //quando a situacao nao eh grave e a pessoa pode esperar mais tempo
    private static final int VERDE = 2;
    //prioridade media
    private static final int AMARELO = 1;
    //prioridade maior
    private static final int VERMELHO = 0;

    public static void main(String[] args) {

        //criando fila de pessoas com classificacao de prioridade
        Queue<Pessoa> fila = new PriorityQueue<>();

        //enfileirando pessoas de acordo com classificacao de prioridade (provavelmente um setor de triagem na vida real)
        fila.add(new Pessoa("Pessoa 1", VERDE));
        fila.add(new Pessoa("Pessoa 2", AMARELO));
        fila.add(new Pessoa("Pessoa 3", VERMELHO));
        fila.add(new Pessoa("Pessoa 4", VERDE));
        fila.add(new Pessoa("Pessoa 5", VERDE));
        fila.add(new Pessoa("Pessoa 6", VERMELHO));

        //passando a fila como parametro e dentro da classe eh feito os controles necessarios, ver comentarios na classe
        PrSocorroAtendimento atendimento = new PrSocorroAtendimento(fila);

        //passando a fila como parametro e dentro da classe eh feito os controles necessarios, ver comentarios na classe
        PrSocorroNovosPacientes pacientes = new PrSocorroNovosPacientes(fila);

        //Instanciando a Thread do atendimento do pronto socorro
        Thread t1 = new Thread(atendimento);
        //Instanciando a Thread do cadastro de novos pacientes com prioridade aleatoria
        Thread t2 = new Thread(pacientes);

        //iniciando execucao da funcionalidade de pronto socorro
        t1.start();
        //iniciando execucao do cadastro de novos pacientes com prioridade aleatoria
        t2.start();


    }

}
