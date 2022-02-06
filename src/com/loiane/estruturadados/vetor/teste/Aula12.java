package com.loiane.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        //adiciona elemento
        arrayList.add("A");
        arrayList.add("C");
        System.out.println(arrayList);

        //adiciona elemento em posicao especifica
        arrayList.add(1,"B");
        System.out.println(arrayList);

        //busca elemento
        boolean existe = arrayList.contains("A");
        if (existe) {
            System.out.println("Elemento existe no array");
        }  else {
            System.out.println("Elemento não existe no array");
        }

        //busca o indice do objeto
        int pos = arrayList.indexOf("B");
        //int pos = arrayList.indexOf("D");
        if (pos > -1) {
            System.out.println("Elemento existe no array " + pos);
        }  else {
            System.out.println("Elemento não existe no array " + pos);
        }

        //busca por posição
        System.out.println(arrayList.get(2));
        //posição inválida lança exceção java.lang.IndexOutOfBoundsException
        //System.out.println(arrayList.get(4));

        //remove elemento
        arrayList.remove(0);
        arrayList.remove("B");
        System.out.println(arrayList);

        System.out.println(arrayList.size());

    }

}
