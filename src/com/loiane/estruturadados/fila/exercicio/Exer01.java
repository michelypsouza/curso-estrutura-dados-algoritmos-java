package com.loiane.estruturadados.fila.exercicio;

import com.loiane.estruturadados.fila.Fila;

public class Exer01 {

    public static void main(String[] args) {

        Fila<Documento> fila = new Fila<>();

        fila.enfileira(new Documento("A",1));
        fila.enfileira(new Documento("B",3));
        fila.enfileira(new Documento("C",5));
        fila.enfileira(new Documento("D",7));
        fila.enfileira(new Documento("E",10));

        while (!fila.estaVazia()) {
            Documento d = fila.desenfileira();
            System.out.println("Imprimindo documento "+d.getNome());

            //parte opcional Threads
            try {
                Thread.sleep(200*d.getNumeroDePaginas());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Todos os documentos foram impressos");

    }

}
