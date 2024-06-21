package br.com.judev.desafiosPreparTecnicos;

import java.util.LinkedList;

public class Grafos {
    public static void main(String[] args) {

        /*Um grafo é uma estrutura de dados que consiste em nós (vértices) conectados por arestas (arestas).
         Exemplo em Java (grafo não ponderado usando lista de adjacência):*/
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.printGraph();
    }
    static class Graph {
        private int vertices;
        private LinkedList<Integer> adjList[];

        Graph(int vertices) {
            this.vertices = vertices;
            adjList = new LinkedList[vertices];
            for (int i = 0; i < vertices; ++i) {
                adjList[i] = new LinkedList();
            }
        }

        void addEdge(int v, int w) {
            adjList[v].add(w);
        }

        void printGraph() {
            for (int i = 0; i < vertices; i++) {
                System.out.print("Vertex " + i + ":");
                for (Integer node : adjList[i]) {
                    System.out.print(" -> " + node);
                }
                System.out.println();
            }
        }
    }
}
