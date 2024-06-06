package br.com.judev.EasyMode.Ex27a38;

import java.util.Scanner;

public class Q28Maiorvalor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] valores = new int[20];

        for (int x = 0; x < 20; x++) {
            System.out.println("Digite o " + (x + 1) + "º valor:");
            valores[x] = Integer.parseInt(in.nextLine());
        }

        boolean valoresIguais = false;
        for (int i = 0; i < valores.length; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                if (valores[i] == valores[j]) {
                    valoresIguais = true;
                    break;
                }
            }
            if (valoresIguais) {
                System.out.println("Valores não podem ser iguais.");
                break; 
            }
        }

        if (!valoresIguais) {
            int maior = valores[0];
            for (int i = 1; i < valores.length; i++) {
                if (valores[i] > maior) {
                    maior = valores[i];
                }
            }

            System.out.println("O maior valor é: " + maior);
        }
    }
}
