package com.loiane.estruturadados.fila.exercicio;

import com.loiane.estruturadados.fila.Fila;

public class Exer01 {

    public static void main(String[] args) {

        //criando fila com documento composto de um nome e quantidade de folhas a serem impressas
        Fila<Documento> fila = new Fila<>();

        //enfileirando documentos para a impressao
        fila.enfileira(new Documento("A",1));
        fila.enfileira(new Documento("B",3));
        fila.enfileira(new Documento("C",5));
        fila.enfileira(new Documento("D",7));
        fila.enfileira(new Documento("E",10));

        //enquanto fila nao esta vazia tem documentos para serem impressos
        while (!fila.estaVazia()) {

            /*
             o documento deve ser desenfileirado para ser impresso (conforme solicitado na questao), e em seguida
             a posicao na fila é desocupada e simulamos que o documento foi impresso (na vida real provavelmente teria
             um metodo com a ação de imprimir, neste exercicio usamos apenas o print para simular esta acao)
            */
            Documento d = fila.desenfileira();
            System.out.println("Imprimindo documento "+d.getNome());

            //parte opcional Threads
            /*
              de acordo com o enunciado da questao se desejar pode usar Threads para esperar a impressao de acordo com
              a quantidade de folhas a serem impressas. Para cada impressao de documento, o programa faz um calcula para
              aguarda 200 segundos vezes a quantidade de folhas a serem impressas para cada documento.
            */
            try {
                Thread.sleep(200*d.getNumeroDePaginas());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        //ao acabar a fila de docuemntos, podemos concluir que todos os documentos foram impressos
        System.out.println("Todos os documentos foram impressos");

    }

}
