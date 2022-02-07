package com.loiane.estruturadados.pilha.exercicio;

public class Livro {

    private String nome;
    private String isbn;
    private String autor;
    private String anoLancamento;

    public Livro() {
        super();
    }

    public Livro(String nome, String isbn, String autor, String anoLancamento) {
        this.nome = nome;
        this.isbn = isbn;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Livro[nome=" + nome + ", isbn=" + isbn + ", autor=" + autor + ", anoLancamento=" + anoLancamento + "]";
    }
}
