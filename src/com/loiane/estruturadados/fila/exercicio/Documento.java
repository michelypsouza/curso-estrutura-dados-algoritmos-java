package com.loiane.estruturadados.fila.exercicio;

public class Documento {

    private String nome;
    private int numeroDePaginas;

    public Documento(String nome, int numeroDePaginas) {
        this.nome = nome;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
}
