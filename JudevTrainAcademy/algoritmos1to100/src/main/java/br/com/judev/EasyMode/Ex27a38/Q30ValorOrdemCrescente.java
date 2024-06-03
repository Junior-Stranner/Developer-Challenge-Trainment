package br.com.judev.EasyMode.Exercicios27a38;

import java.util.Arrays;
import java.util.Scanner;

public class Q30ValorOrdemCrescente {
    public static void main(String[] args) {

     Scanner in = new Scanner(System.in);

        int[] valores = new int[3];

        for (int x = 0; x < 3; x++) {
            System.out.println("Digite o " + (x + 1) + "º valor:");
            valores[x] = Integer.parseInt(in.nextLine());
        }

        // Verificação de valores iguais (embora o enunciado diga que não serão iguais, adicionamos a verificação por segurança)
        if (valores[0] == valores[1] || valores[0] == valores[2] || valores[1] == valores[2]) {
            System.out.println("Valores não podem ser iguais.");
        } else {
            // Ordenação do array
            Arrays.sort(valores);

            // Exibição dos valores ordenados
            System.out.println("Os valores em ordem crescente são:");
            for (int valor : valores) {
                System.out.println(valor);
            }
        }
    }
}
