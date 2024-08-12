package br.com.judev.desafiosPreparTecnicos;

import java.util.Stack;

public class PilhasLIFO {
    public static void main(String[] args) {
        //Uma pilha é uma estrutura de dados que segue o princípio LIFO (Last In, First Out).

        Stack<Integer> stack = new Stack<>();

        // Adiciona elementos na pilha
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Remove elementos da pilha
        System.out.println(stack.pop());// Output: 3
        System.out.println(stack.pop());// Output: 2

    }
}
