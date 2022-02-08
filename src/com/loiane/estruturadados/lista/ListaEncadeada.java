package com.loiane.estruturadados.lista;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private int tamanho = 0;

    public void adiciona(T elemento){
        No<T> celula = new No<T>(elemento);
        this.inicio  = celula;
        this.tamanho++;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListaEncadeada{");
        sb.append("inicio=").append(inicio);
        sb.append('}');
        return sb.toString();
    }
}
