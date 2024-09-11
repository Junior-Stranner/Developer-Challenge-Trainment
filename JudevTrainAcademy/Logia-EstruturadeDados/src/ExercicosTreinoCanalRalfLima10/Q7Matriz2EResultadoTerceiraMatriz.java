package ExercicosTreinoCanalRalfLima10;

import java.util.Scanner;

public class Q7Matriz2EResultadoTerceiraMatriz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Definindo as matrizes
        int[][] matriz1 = {
            {4, 5, 6},
            {3, 5, 7},
            {1, 2, 3}
        };
        int[][] matriz2 = {
            {2, 3, 1},
            {5, 1, 1},
            {5, 4, 6}
        };
        int[][] matrizResultado = new int[3][3]; // Matriz para armazenar o resultado da soma

        // Laço para somar as duas matrizes
        for (int i = 0; i < 3; i++) { // Percorre as linhas
            for (int j = 0; j < 3; j++) { // Percorre as colunas
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Exibindo a matriz resultante
        System.out.println("Matriz resultante da soma:");
        for (int i = 0; i < 3; i++) { // Percorre as linhas
            for (int j = 0; j < 3; j++) { // Percorre as colunas
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }
    }
}
