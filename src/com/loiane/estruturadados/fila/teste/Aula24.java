package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.FilaComPrioridade;

public class Aula24 {

    public static void main(String[] args) {

        FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();

        fila.enfileira(1);
        fila.enfileira(3);
        fila.enfileira(2);

        System.out.println(fila); //1 2 3 e não 1 3 2

        FilaComPrioridade<Paciente> filaComPrioridade = new FilaComPrioridade<>();

        filaComPrioridade.enfileira(new Paciente("A",2));
        filaComPrioridade.enfileira(new Paciente("C",1));
        filaComPrioridade.enfileira(new Paciente("B",3));

        System.out.println(filaComPrioridade);

    }

}
