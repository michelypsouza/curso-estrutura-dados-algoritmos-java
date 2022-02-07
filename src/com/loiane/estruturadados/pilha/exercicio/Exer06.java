package com.loiane.estruturadados.pilha.exercicio;

import java.util.Stack;

public class Exer06 {

    final static String SIMBOLO_ABERTURA = "([{";
    final static String SIMBOLO_FECHAMENTO = ")]}";

    public static void main(String[] args) {

        // exemplos informados por Loiane Groner no exercicio 06 do módulo de Pilhas
        imprime("A+B");
        imprime("A + B + (C - D)");
        imprime("{[()]}[](){()}");
        imprime("{[(]}[](){()}");
        imprime("A + B + C - D)");
        System.out.println();

        // exemplos informados no texto do exercicio 06 do módulo de Pilhas
        //imprime("((A+B)"); //nao funciona neste exemplo
        //imprime("A+B("); //nao funciona neste exemplo
        imprime(")A+B( – C");
        imprime("(A+B)) – (C + D");
        //a unica que esta ok
        imprime("((A+B)+D)");

    }

    public static void imprime(String expressao) {
        System.out.println("A expressão matemática "+expressao+" está balanceada? "+verificaSeEstaBalanceado(expressao));
    }

    public static boolean verificaSeEstaBalanceado(String expressaoMatematica){

        Stack<Character> stack = new Stack<>();
        char simbolo, topo;

        for (int i = 0; i < expressaoMatematica.length(); i++) {
            simbolo = expressaoMatematica.charAt(i);

            if (SIMBOLO_ABERTURA.indexOf(simbolo) > -1){
                stack.push(simbolo);
            } else if (SIMBOLO_FECHAMENTO.indexOf(simbolo) > -1) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    topo = stack.pop();
                    if (SIMBOLO_ABERTURA.indexOf(topo) != SIMBOLO_FECHAMENTO.indexOf(simbolo)) {
                        return false;

                    }
                }
            }

        }

        return true;
    }

}
