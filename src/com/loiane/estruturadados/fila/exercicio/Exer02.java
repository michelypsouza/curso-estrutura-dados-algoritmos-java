package com.loiane.estruturadados.fila.exercicio;

import com.loiane.estruturadados.fila.Fila;

public class Exer02 {

    public static void main(String[] args) {

        //inicializando a fila de atendimento senha normal
        Fila<String> normal = new Fila<>();
        //inicializando a fila de atendimento senha prioritaria
        Fila<String> prioridade = new Fila<>();

        /*
          questao 2 define que a metrica de atendimento eh um atendimento normal e tres atendimentos prioritarios, no
          programa definimos uma variável constante com o valor 3
        */
        final int MAX_PRIORIDADE = 3;

        /*
          As pessoas comecam a emitir suas senhas conforme tipo de atendimento (normal ou prioritario), e o programa
          passa a armazenar estas informações de senhas nas suas respectivas filas
        */

        //pessoas emitindo senhas de atendimento normal
        normal.enfileira("Pessoa 1");
        normal.enfileira("Pessoa 2");
        normal.enfileira("Pessoa 3");

        //outras pessoas emitindo senhas de atendimento prioritario
        prioridade.enfileira("Pessoa 1P");
        prioridade.enfileira("Pessoa 2P");
        prioridade.enfileira("Pessoa 3P");
        prioridade.enfileira("Pessoa 4P");
        prioridade.enfileira("Pessoa 5P");

        //mais pessoas emitindo senhas de atendimento normal
        normal.enfileira("Pessoa 4");
        normal.enfileira("Pessoa 5");
        normal.enfileira("Pessoa 6");
        normal.enfileira("Pessoa 7");
        normal.enfileira("Pessoa 8");

        //enquanto filas nao estao vazias ainda tem senhas para serem atendidas
        while (!normal.estaVazia() || !prioridade.estaVazia()){

            //variavel contador
            int cont = 0;

            /*
              enquanto houver senhas prioritarias para serem atendidas e contador eh menor que 3 (contador comecou em 0,
              entao contou 3 vezes) sao atendidas 3 senhas  prioritarias em sequencia
            */
            while (!prioridade.estaVazia() && cont < MAX_PRIORIDADE){
                atenderPessoa(prioridade);
                cont++;
            }

            // depois das 3 prioridades atendidas, eh verificado se tem senhas de atendimento normal e atende uma pessoa
            if (!normal.estaVazia()) {
                atenderPessoa(normal);
            }

            /*
              atendimento normal eh realizado quando a fila de prioridade acaba e ainda tem senhas de atendimento normal,
              quando esta condicao nao for mais verdadeira volta para testar a condicao da linha 45
            */
            if (prioridade.estaVazia()){
                while (!normal.estaVazia()){
                    atenderPessoa(normal);
                }
            }

        }

    }

    //na questao 2 foi especificado que eh apenas 1 atendente, quando ele atende a pessoa sai da fila
    private static void atenderPessoa(Fila<String> fila) {
        String pessoaAtendida = fila.desenfileira();
        System.out.println(pessoaAtendida+" foi atendida.");
    }

}
