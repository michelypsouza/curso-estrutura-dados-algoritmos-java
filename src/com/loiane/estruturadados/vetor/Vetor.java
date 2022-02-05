package com.loiane.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /*
    public void adiciona(String elemento){
        for (int i=0; i<this.elementos.length; i++) {
            if (this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }
     */

    /*
    public void adiciona(String elemento) throws Exception {

        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível acionar mais elementos.");
        }

    }
     */

    public boolean adiciona(String elemento) {

        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public int tamanho(){
        return this.tamanho;
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
