package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.VetorObjetos;

public class Aula11 {

    public static void main(String[] args) {

        /*
        VetorObjetos vetor = new VetorObjetos(2);

        vetor.adiciona(1);
        vetor.adiciona("Elemento do tipo String");

        System.out.println(vetor);
         */

        Lista<String> vetor = new Lista<>(1);
        vetor.adiciona("Elemento");
        //vetor.adiciona(1);
        //vetor.adiciona(new Contato());

        Lista<Contato> vetor2 = new Lista<>(1);

        Contato c1 = new Contato("Contato 1", "1234-4567","contato1@email.com");
        Contato c2 = new Contato("Contato 2", "2345-6789","contato2@email.com");
        Contato c3 = new Contato("Contato 3", "3456-7890","contato3@email.com");

        vetor2.adiciona(c1);

    }

}
