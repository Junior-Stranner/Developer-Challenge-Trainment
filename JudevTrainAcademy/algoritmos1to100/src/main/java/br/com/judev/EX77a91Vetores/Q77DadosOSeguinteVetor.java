package br.com.judev.EX77a91Vetores;

import java.util.Scanner;

public class Q77DadosOSeguinteVetor {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int[] V = {5, 1, 4, 2, 7, 8, 3, 6};


        // Executando o loop Para i de 8 até 5 passo -1
        for (int i = 8; i >= 5; i--) {
            int aux = V[i - 1];
            V[i - 1] = V[8 - i];
            V[8 - i] = aux;
        }

        // v[3] = v[1]
        V[2] = V[0];

        // v[v[3]] = v[v[2]]
        V[V[2] - 1] = V[V[1] - 1];

        // Exibindo o vetor final
        for (int i = 0; i < V.length; i++) {
            System.out.print(V[i] + " ");
        }
    }
}