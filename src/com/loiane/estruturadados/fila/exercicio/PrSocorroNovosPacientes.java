package com.loiane.estruturadados.fila.exercicio;

import java.util.Queue;
import java.util.Random;

public class PrSocorroNovosPacientes implements Runnable {

    private Queue<Pessoa> fila;
    private int cont = 7;
    private Random prioridade = new Random();

    public PrSocorroNovosPacientes(Queue<Pessoa> fila) {
        super();
        this.fila = fila;
    }

    @Override
    public void run() {

        for (int i = 0; i < 8; i++) {
            try {
                //4000 segundos é muito curto o tempo
                Thread.sleep(8000);
                Pessoa pessoaNova = new Pessoa("Paciente Novo "+cont, prioridade.nextInt(3));
                fila.add(pessoaNova);
                cont++;
                System.out.println(pessoaNova + " enfileirada.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
