package com.loiane.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade){
        this.elementos = (T[]) new Object[capacidade]; // solução do livro java efetivo informado por Loiane Groner
        this.tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    //0 1 2 3 4 5 6 = tamanho é 5
    //B C E F G + +
    public boolean adiciona(int posicao, T elemento){

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        //mover todos os elementos
        for (int i=this.tamanho-1; i>=posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i=0; i<this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public Object busca(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(T elemento){
        for (int i=0; i < this.tamanho; i++){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    //B G D E F -> posição a ser removida é 1 (G)
    //B D E F F -> após a posição 1 (G) ser removida.
    //0 1 2 3 4 -> tamanho é 5
    //vetor[1] = vetor[2]
    //vetor[2] = vetor[3]
    //vetor[3] = vetor[4]
    public void remove(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i=posicao; i<this.tamanho-1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    public int tamanho(){
        return this.tamanho;
    }

    //metodo do exercicio 01 do modulo 1 do curso
    public boolean contem(T elemento){
        return busca(elemento) >= 0; // > -1
    }

    //metodo do exercicio 02 do modulo 1 do curso
    public int ultimoIndice(T elemento){
        for (int i=this.tamanho-1; i >= 0; i--){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    //metodo do exercicio 03 do modulo 1 do curso
    public void remove(T elemento){
        int indice = busca(elemento);
        if (indice >= 0) {
            remove(indice);
        }
    }

    public String toString() {

        StringBuilder s = new StringBuilder();

        //String s = "[";
        s.append("[");

        for (int i = 0; i < this.tamanho-1; i++) {
            s.append(this.elementos[i]);
            //s += this.elementos[i];
            s.append(", ");
            //s += ", ";
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho-1]);
            //s += this.elementos[this.tamanho-1];
        }

        s.append("]");
        //s += "]";

        //return Arrays.toString(elementos);
        return s.toString();
    }

}
