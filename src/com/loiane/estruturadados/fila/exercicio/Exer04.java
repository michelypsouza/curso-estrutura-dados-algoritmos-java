package com.loiane.estruturadados.fila.exercicio;

import com.loiane.estruturadados.fila.Fila;

import java.util.Random;

public class Exer04 {

    public static void main(String[] args) {

        //criando fila para controlar a brincadeira da batata-quente
        Fila<Integer> fila = new Fila<>();

        //definindo a quantidade de criancas participantes da brincadeira
        for (int qtdeCriancas = 0; qtdeCriancas < 10; qtdeCriancas++) {
            //enfileirando as 10 criancas
            fila.enfileira(qtdeCriancas);
        }

        //escolhendo a crianca que sai da brincadeira com numero aleatorio de acordo com janela de 10 criancas
        Random aleatorio = new Random();
        int numero = 0;
        while (numero == 0) {
            numero = aleatorio.nextInt(10); //numero = 2 valor mostrado no exercicio na aula por video
        }

        //a crianca eliminada aleatoriamente sai da rodada
        System.out.println("Número aleatório =  " + numero);

        //emular uma fila circular
        while(fila.tamanho() > 1) { // deixa uma pessoa sobrando no final da brincadeira batata quente
            for (int i = 0; i < numero; i++) {
                /*
                  O Número aleatorio define o intervalo de eliminacao, ao remover determinado elemento (desenfileirar
                  o elemento da fila, é necessário enfileira os elementos antecessores ao Eliminado, sendo assim os
                  elementos vao para o final da fila a cada iteracao)
                 */
                fila.enfileira(fila.desenfileira());
            }
            //desenfileirando todos os elementos, exceto o ultimo
            System.out.println("Eliminado = "+fila.desenfileira());
        }

        //o ultimo eh o vencedor
        System.out.println("Ganhador: " + fila.desenfileira());

    }

}
