package com.loiane.estruturadados.fila.exercicio;

import com.loiane.estruturadados.fila.Fila;

import java.util.Random;

public class Exer04 {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        for (int qtdeCriancas = 0; qtdeCriancas < 10; qtdeCriancas++) {
            fila.enfileira(qtdeCriancas);
        }

        Random aleatorio = new Random();
        int numero = 0;
        while (numero == 0) {
            numero = aleatorio.nextInt(10); //numero = 2 valor mostrado no exercicio na aula
        }

        System.out.println("Número aleatório =  " + numero);

        //emular uma fila circular
        while(fila.tamanho() > 1) { // deixa uma pessoa sobrando no final da brincadeira batata quente
            for (int i = 0; i < numero; i++) {
                fila.enfileira(fila.desenfileira());
            }
            System.out.println("Eliminado = "+fila.desenfileira());
        }

        System.out.println("Ganhador: " + fila.desenfileira());

    }

}
