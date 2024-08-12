package br.com.judev.Ex50a56EstruturaRepeticaoPara;

import java.util.Scanner;

public class Q54ImprimirValoresDe1AN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        do {
            System.out.println("Digite um valor de N (maior que 0):");
            n = in.nextInt();

            if (n <= 0) {
                System.out.println("Valor inválido! O valor deve ser maior que 0.");
            }
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}

