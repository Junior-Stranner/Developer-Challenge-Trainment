package br.com.judev.Ex50a56EstruturaRepeticaoPara;

import java.util.Scanner;

public class Q53LerValorNMaiorque0ENtre1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int valor1 = 1;
        do {
            System.out.println("Digite um valor N (maior que 0):");
            n = in.nextInt();

            if (n <= 0) {
                System.out.println("O valor deve ser maior que 0. Tente novamente.");
            }
        } while (n <= 0);

        int entre = n -1;
        System.out.println("Valores entre 1 e N são ( "+entre+" )");

    }
}
