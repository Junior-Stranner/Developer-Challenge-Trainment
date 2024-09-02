package br.com.judev.Ex70a73MaiorMenor;

import java.util.Scanner;

public class Q70valores100MaiorEoMenor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maiorValor = Integer.MIN_VALUE; 
        int menorValor = Integer.MAX_VALUE; 

        for (int i = 1; i <= 100; i++) {
            System.out.print("Digite o valor " + i + ": ");
            int valor = Integer.parseInt(in.nextLine());

            if (valor > maiorValor) {
                maiorValor = valor;
            }

            if (valor < menorValor) {
                menorValor = valor;
            }
        }

        System.out.println("O maior valor lido é: " + maiorValor);
        System.out.println("O menor valor lido é: " + menorValor);

    
    }
}
