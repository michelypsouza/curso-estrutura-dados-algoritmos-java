package com.loiane.estruturadados.fila.exercicio;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int prioridade;

    public Pessoa(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    //Pessoas com prioridade vermelha devem ser atendidas primeiro, VERMELHO = 0, AMARELO = 1 e VERDE = 2, seguira esta ordem
    @Override
    public int compareTo(Pessoa o) {
        return Integer.compare(this.prioridade, o.getPrioridade());
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", prioridade=" + prioridade + "]";
    }
}
