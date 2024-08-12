package br.com.judev.Ex27a38;

import java.util.Scanner;

public class Q33doisValoresImprima {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Alterado para armazenar apenas dois valores, já que só precisamos de dois valores
        int[] valores = new int[2];

        // Leitura dos dois valores
        for (int x = 0; x < 2; x++) {
            System.out.println("Digite o " + (x + 1) + "º valor:");
            valores[x] = Integer.parseInt(in.nextLine());
        }

        // Comparação dos dois valores
        if (valores[0] == valores[1]) {
            System.out.println("Números iguais");
        } else if (valores[0] > valores[1]) {
            System.out.println("Primeiro é maior");
        } else {
            System.out.println("Segundo maior");
        }
    }
}
