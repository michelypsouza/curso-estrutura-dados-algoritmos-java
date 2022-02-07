package com.loiane.estruturadados.vetor.exercicio;

import com.loiane.estruturadados.vetor.teste.Contato;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc07 extends Exerc06 {

    public static void main(String[] args) {

        //variáveis
        Scanner entrada = new Scanner(System.in);

        //criar vetor com capacidade para 20 registros
        ArrayList<Contato> lista = new ArrayList<>(20);

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

    private static void adicionarContatoNoFimDaLista(Scanner entrada, ArrayList<Contato> lista) {

        System.out.println("Criando um contato, entre com os dados: ");
        String nome = lerDados("Entre com o nome: ", entrada);
        String telefone = lerDados("Entre com o telefone: ", entrada);
        String email = lerDados("Entre com o email: ", entrada);

        Contato contato = new Contato(nome, telefone, email);
        lista.add(contato);

        System.out.println("Contato adicionado com sucesso pela opção 1!");
        System.out.println(contato);

    }

    private static void adicionarContatoPosicao(Scanner entrada, ArrayList<Contato> lista) {

        System.out.println("Criando um contato, entre com os dados: ");
        String nome = lerDados("Entre com o nome: ", entrada);
        String telefone = lerDados("Entre com o telefone: ", entrada);
        String email = lerDados("Entre com o email: ", entrada);

        Contato contato = new Contato(nome, telefone, email);

        int posicao = lerDadosInt("Entre com a posição desejada para adicionar o contato: ", entrada);

        try {

            lista.add(posicao, contato);
            System.out.println("Contato adicionado com sucesso pela opção 2!");
            System.out.println(contato);

        } catch (Exception e){
            System.out.println("Posição inválida, contato não adicionado pela opção 2.");
        }

    }

    private static void obterContatoPosicao (Scanner entrada, ArrayList<Contato> lista) {

        int pos = lerDadosInt("Entre com a posição a ser pesquisada: ", entrada);

        try {
            Contato contato = lista.get(pos);

            System.out.println("Contato encontrado, segue os detalhes: ");
            System.out.println(contato);

        } catch (Exception e){
            System.out.println("Posição inválida!");
        }

    }

    private static void obterContato (Scanner entrada, ArrayList<Contato> lista) {

        int pos = lerDadosInt("Entre com a posição a ser pesquisada: ", entrada);

        try {

            Contato contato = lista.get(pos);

            System.out.println("Contato encontrado, segue os detalhes: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado: ");
            pos = lista.indexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e){
            System.out.println("Posição inválida!");
        }

    }

    private static void pesquisarUltimoIndice (Scanner entrada, ArrayList<Contato> lista) {

        int pos = lerDadosInt("Entre com a posição a ser pesquisada: ", entrada);

        try {

            Contato contato = lista.get(pos);

            System.out.println("Contato encontrado, segue os detalhes: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice do contato encontrado: ");
            pos = lista.lastIndexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e){
            System.out.println("Posição inválida!");
        }

    }

    private static void pesquisarContatoExiste (Scanner entrada, ArrayList<Contato> lista) {

        int pos = lerDadosInt("Entre com a posição a ser pesquisada: ", entrada);

        try {

            Contato contato = lista.get(pos);

            boolean existeContato = lista.contains(contato);

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

    private static void excluirContatoPorPosicao (Scanner entrada, ArrayList<Contato> lista) {

        int pos = lerDadosInt("Entre com a posição a ser excluída: ", entrada);

        try {

            Contato contato = lista.get(pos);
            lista.remove(contato);
            System.out.println("Contato excluído com sucesso!");

        } catch (Exception e){
            System.out.println("Posição inválida!");
        }

    }

    private static void excluirContato (Scanner entrada, ArrayList<Contato> lista) {

        int pos = lerDadosInt("Entre com a posição a ser excluída: ", entrada);

        try {

            lista.remove(pos);
            System.out.println("Contato excluído com sucesso!");

        } catch (Exception e){
            System.out.println("Posição inválida!");
        }

    }

    private static  void imprimeTamanhoVetor(ArrayList<Contato> lista) {
        System.out.println("Tamanho do vetor é de: "+lista.size());
    }

    private static  void limparVetor(ArrayList<Contato> lista) {
        lista.clear();
        System.out.println("Todos os contatos do vetor foram excluídos.");
    }

    private static  void imprimirConteudoDoVetor(ArrayList<Contato> lista) {
        System.out.println(lista);
    }

    private static void criarContatos (int qtde, ArrayList<Contato> lista) {
        Contato c;
        for (int i = 0; i < qtde; i++) {
            c = new Contato("Nome do Contato "+i, "9999999"+i, "contato"+i+"@email.com");
            lista.add(i,c);
        }
    }

}
