package br.com.judev.desafiosPreparTecnicos;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class FilaFIFO {
    public static void main(String[] args) {
        //Uma fila é uma estrutura de dados que segue o princípio FIFO (First In, First Out).
        //Exemplo em Java (usando LinkedList como fila):
        Queue<Integer> queue = new LinkedList<>();

        // Remove elementos da fila
        System.out.println(queue.poll());  // Output: 1
        System.out.println(queue.poll());  // Output: 2
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Remove elementos da fila
        System.out.println(queue.poll());  // Output: 1
        System.out.println(queue.poll());  // Output: 2
    }
}
