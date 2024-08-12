package br.com.judev;

import java.util.Scanner;

public class Q05OrdemLista {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
            int[] vet = new int[10];

            for (int z = 0; z < vet.length; z++) {
                System.out.println("Digite um valor para vet[" + z + "]: ");
                vet[z] = in.nextInt();
            }

            // Ordenando o vetor em ordem crescente
            for (int x = 0; x < vet.length - 1; x++) {
                for (int i = x + 1; i < vet.length; i++) {
                    if (vet[x] > vet[i]) {
                        int aux = vet[x];
                        vet[x] = vet[i];
                        vet[i] = aux;
                    }
                }
            }

            System.out.println("A ordem correta dos elementos é: ");
            for (int valor : vet) {
                System.out.print(valor + " ");
        }
    }
}
