package com.loiane.estruturadados.fila.exercicio;

import java.util.Queue;
import java.util.Random;

//implementando a interface Runnable para utilizar o metodo run para usar Thread
public class PrSocorroNovosPacientes implements Runnable {

    private Queue<Pessoa> fila;

    //adicionamos 6 pessoas na fila da classe Exer03, vamos adicionar 7 pessoas com prioridade aleatoria
    private int cont = 7;

    //pessoa com prioridade aleatoria
    private Random prioridade = new Random();

    public PrSocorroNovosPacientes(Queue<Pessoa> fila) {
        super();
        this.fila = fila;
    }

    @Override
    public void run() {

        //
        for (int i = 0; i < 8; i++) {
            try {
                //4 segundos proposto no exercicio eh um tempo muito curto, vamos aumentar para 8 segundos
                Thread.sleep(8000);
                /*
                  cadastrando paciente novo com prioridade aleatoria considerando que os valores aceitos para o campo
                  prioridade são: VERMELHO = 0, AMARELO = 1 e VERDE = 2, por isso foi informado o valor 3 no metodo
                  nextInt abaixo pois este metodo precisa do valor maximo para definir o valor aleatorio dentro
                  do intervalo (range) que sera preenchido
                 */
                Pessoa pessoaNova = new Pessoa("Paciente Novo "+cont, prioridade.nextInt(3));
                //enfileirando a pessoa nova na fila de atendimento
                fila.add(pessoaNova);
                //quando chegar em 8 e vai sair do for, ficando 7 pessoas novas cadastradas
                cont++;
                //Exibindo paciente novo cadastrado com prioridade aleatoria na fila de atendimento do pronto socorro
                System.out.println(pessoaNova + " enfileirada.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
