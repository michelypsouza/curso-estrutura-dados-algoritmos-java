package com.loiane.estruturadados.lista;

public class ListaEncadeada<T> {

    private No<T> inicio;

    public void adiciona(T elemento){
        No<T> celula = new No<T>(elemento);
        this.inicio  = celula;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListaEncadeada{");
        sb.append("inicio=").append(inicio);
        sb.append('}');
        return sb.toString();
    }
}
