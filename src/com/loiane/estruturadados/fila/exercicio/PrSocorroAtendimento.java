package com.loiane.estruturadados.fila.exercicio;

import java.util.Queue;

public class PrSocorroAtendimento implements Runnable {

    private Queue<Pessoa> fila;

    public PrSocorroAtendimento(Queue<Pessoa> fila) {
        super();
        this.fila = fila;
    }

    @Override
    public void run() {

        while (!fila.isEmpty()) {
            try {
                System.out.println(fila.poll() + " foi atendida.");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Atendimento concluído com sucesso.");
    }

}
