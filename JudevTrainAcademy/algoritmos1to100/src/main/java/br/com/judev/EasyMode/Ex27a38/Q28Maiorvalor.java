package br.com.judev.EasyMode.Ex27a38;

import java.util.Scanner;

public class Q28Maiorvalor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] valores = new int[5];

        // Lendo os valores
        for (int x = 0; x < 5; x++) {
            System.out.println("Digite o " + (x + 1) + "º valor:");
            valores[x] = Integer.parseInt(in.nextLine());
        }

        // Verificação de valores iguais
        boolean valoresIguais = false;
     //  outerLoop:
        for (int i = 0; i < valores.length; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                if (valores[i] == valores[j]) {
                    valoresIguais = true;
                    break;
                }
            }
        }

        // Se houver valores iguais, exiba a mensagem e saia do programa
        if (valoresIguais) {
            System.out.println("Valores não podem ser iguais");
            return; // Encerre o programa aqui
        }

        // Encontrar o maior valor
        int maior = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
        }

        System.out.println("O maior valor é: " + maior);
    }
}
