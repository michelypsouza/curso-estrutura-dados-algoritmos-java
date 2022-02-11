package com.loiane.estruturadados.fila.exercicio;

import java.util.Queue;

//implementando a interface Runnable para utilizar o metodo run para usar Thread
public class PrSocorroAtendimento implements Runnable {

    private Queue<Pessoa> fila;

    public PrSocorroAtendimento(Queue<Pessoa> fila) {
        super();
        this.fila = fila;
    }

    @Override
    public void run() {

        /*
          enquanto existir pessoas na fila vao aguardar atendimento, estas pessoas serao ordenadas de acordo com a
          classificacao de prioridade (atributo contido na classe Pessoa contendo um metodo compare que fara isso).
          Quanto as prioridades vermelhas devem ser atendidas primeiro, VERMELHO = 0, AMARELO = 1 e VERDE = 2,
          seguira esta ordem.
        */
        while (!fila.isEmpty()) {
            try {
                //cada consulta dura 5 segundos (5000 milisegundos) e depois o proximo da fila eh chamado
                // (retirando da fila pessoa atendida)
                System.out.println(fila.poll() + " foi atendida.");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Atendimento concluído com sucesso.");
    }

}
