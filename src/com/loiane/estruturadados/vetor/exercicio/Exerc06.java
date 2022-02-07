package com.loiane.estruturadados.vetor.exercicio;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.teste.Contato;

import java.util.Scanner;

public class Exerc06 {

    public static void main(String[] args) {

        //variáveis
        Scanner entrada = new Scanner(System.in);

        //criar vetor com capacidade para 20 registros
        Lista<Contato> lista = new Lista<>(20);

        //criar e adicionar 30 contatos
        criarContatos(30, lista);

        //exibir menu para usuário
        int opcao = 1;

        while (opcao != 0) {

            opcao = obterOpcaoMenu(entrada);

            switch (opcao) {
                case 1:
                    adicionarContatoNoFimDaLista(entrada, lista);
                    break;
                case 2:
                    adicionarContatoPosicao(entrada, lista);
                    break;
                case 3:
                    obterContatoPosicao(entrada, lista);
                    break;
                case 4:
                    obterContato(entrada, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(entrada, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(entrada, lista);
                    break;
                case 7:
                    excluirContatoPorPosicao(entrada, lista);
                    break;
                case 8:
                    excluirContato(entrada, lista);
                    break;
                case 9:
                    imprimeTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimirConteudoDoVetor(lista);
                    break;
                default:
                    break;
            }

        }
        System.out.println("Usuário digitou 0 para sair do programa.");

    }

    private static void adicionarContatoNoFimDaLista(Scanner entrada, Lista<Contato> lista) {

        System.out.println("Criando um contato, entre com os dados: ");
        String nome = lerDados("Entre com o nome: ", entrada);
        String telefone = lerDados("Entre com o telefone: ", entrada);
        String email = lerDados("Entre com o email: ", entrada);

        Contato contato = new Contato(nome, telefone, email);
        lista.adiciona(contato);

        System.out.println("Contato adicionado com sucesso pela opção 1!");
        System.out.println(contato);

    }

    private static String lerDados(String msg, Scanner entrada) {
        System.out.println(msg);
        String entradaString = entrada.nextLine();
        return entradaString;
    }

    private static void adicionarContatoPosicao(Scanner entrada, Lista<Contato> lista) {

        System.out.println("Criando um contato, entre com os dados: ");
        String nome = lerDados("Entre com o nome: ", entrada);
        String telefone = lerDados("Entre com o telefone: ", entrada);
        String email = lerDados("Entre com o email: ", entrada);

        Contato contato = new Contato(nome, telefone, email);

        int posicao = lerDadosInt("Entre com a posição desejada para adicionar o contato: ", entrada);

        try {

            lista.adiciona(posicao, contato);
            System.out.println("Contato adicionado com sucesso pela opção 2!");
            System.out.println(contato);

        } catch (Exception e){
            System.out.println("Posição inválida, contato não adicionado pela opção 2.");
        }

    }

    private static int lerDadosInt(String msg, Scanner entrada) {

        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {

            try {

                System.out.println(msg);
                String entradaString = entrada.nextLine();

                num = Integer.parseInt(entradaString);

                entradaValida = true;

            } catch (Exception e) {
                System.out.println("Número inválido, digite novamente.\n\n");
            }

        }

        return num;
    }

    private static void obterContatoPosicao (Scanner entrada, Lista<Contato> lista) {

        int pos = lerDadosInt("Entre com a posição a ser pesquisada: ", entrada);

        try {
            Contato contato = lista.obtem(pos);

            System.out.println("Contato encontrado, segue os detalhes: ");
            System.out.println(contato);

        } catch (Exception e){
            System.out.println("Posição inválida!");
        }

    }

    private static void obterContato (Scanner entrada, Lista<Contato> lista) {

        int pos = lerDadosInt("Entre com a posição a ser pesquisada: ", entrada);

        try {

            Contato contato = lista.obtem(pos);

            System.out.println("Contato encontrado, segue os detalhes: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado: ");
            pos = lista.busca(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e){
            System.out.println("Posição inválida!");
        }

    }

    private static void pesquisarUltimoIndice (Scanner entrada, Lista<Contato> lista) {

        int pos = lerDadosInt("Entre com a posição a ser pesquisada: ", entrada);

        try {

            Contato contato = lista.obtem(pos);

            System.out.println("Contato encontrado, segue os detalhes: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice do contato encontrado: ");
            pos = lista.ultimoIndice(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e){
            System.out.println("Posição inválida!");
        }

    }

    private static void pesquisarContatoExiste (Scanner entrada, Lista<Contato> lista) {

        int pos = lerDadosInt("Entre com a posição a ser pesquisada: ", entrada);

        try {

            Contato contato = lista.obtem(pos);

            boolean existeContato = lista.contem(contato);

            if (existeContato) {
                System.out.println("Contato existe, segue os detalhes: ");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe.");
            }

        } catch (Exception e){
            System.out.println("Posição inválida!");
        }

    }

    private static void excluirContatoPorPosicao (Scanner entrada, Lista<Contato> lista) {

        int pos = lerDadosInt("Entre com a posição a ser excluída: ", entrada);

        try {

            Contato contato = lista.busca(pos);
            lista.remove(contato);
            System.out.println("Contato excluído com sucesso!");

        } catch (Exception e){
            System.out.println("Posição inválida!");
        }

    }

    private static void excluirContato (Scanner entrada, Lista<Contato> lista) {

        int pos = lerDadosInt("Entre com a posição a ser excluída: ", entrada);

        try {

            lista.remove(pos);
            System.out.println("Contato excluído com sucesso!");

        } catch (Exception e){
            System.out.println("Posição inválida!");
        }

    }

    private static  void imprimeTamanhoVetor(Lista<Contato> lista) {
        System.out.println("Tamanho do vetor é de: "+lista.tamanho());
    }

    private static  void limparVetor(Lista<Contato> lista) {
        lista.limpar();
        System.out.println("Todos os contatos do vetor foram excluídos.");
    }

    private static  void imprimirConteudoDoVetor(Lista<Contato> lista) {
        System.out.println(lista);
    }

    private static int obterOpcaoMenu (Scanner entrada) {

        boolean entradaValida = false;
        int opcao = 0;
        String entradaInformada;

        while (!entradaValida) {

            System.out.println("Digite a opção desejada");

            System.out.println("1 - Adicionar contato no fim do vetor");
            System.out.println("2 - Adicionar contato em uma determinada posição");
            System.out.println("3 - Pesquisar por contato em uma determinada posição");
            System.out.println("4 - Pesquisar por contato");
            System.out.println("5 - Pesquisar último índice do contato");
            System.out.println("6 - Verificar se contato existe");
            System.out.println("7 - Excluir por índice");
            System.out.println("8 - Excluir contato");
            System.out.println("9 - Verificar tamanho da vetor");
            System.out.println("10 - Excluir todos os contatos do vetor");
            System.out.println("11 - Imprimir os contatos do vetor");
            System.out.println("0 - Sair");

            try {

                entradaInformada = entrada.nextLine();
                opcao = Integer.parseInt(entradaInformada);

                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente.\n\n");
            }

        }

        return opcao;
    }

    private static void criarContatos (int qtde, Lista<Contato> lista) {
        Contato c;
        for (int i = 0; i < qtde; i++) {
            c = new Contato("Nome do Contato "+i, "9999999"+i, "contato"+i+"@email.com");
            lista.adiciona(c);
        }
    }

}
