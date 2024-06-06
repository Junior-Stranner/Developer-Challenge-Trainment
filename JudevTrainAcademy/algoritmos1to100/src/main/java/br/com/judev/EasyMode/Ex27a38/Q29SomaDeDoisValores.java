package br.com.judev.EasyMode.Ex27a38;

import java.util.Arrays;
import java.util.Scanner;

public class Q29SomaDeDoisValores {
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
                return; 
            }
        }

        Arrays.sort(valores);
        int somaDosDoisMaiores = valores[valores.length - 1] + valores[valores.length - 2];
        System.out.println("A soma dos dois maiores valores é: " + somaDosDoisMaiores);
    }
}
