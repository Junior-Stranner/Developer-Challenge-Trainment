package br.com.judev.EX74a76RepeticaoAninhada;

import java.util.Scanner;

public class Q75AlgoritmoQueImprimaSequenciaNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("(" + i + ", ");
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " ");
            }
            System.out.println(")"); // Fecha a sequência e pula para a próxima linha
        }
    }
}
