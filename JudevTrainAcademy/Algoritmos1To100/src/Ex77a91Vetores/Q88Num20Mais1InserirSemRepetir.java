package Ex77a91Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Q88Num20Mais1InserirSemRepetir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);   

        int[] numeros = new int[5];
        int novoNumero;

        for (int j = 0; j < numeros.length; j++) {
            System.out.println("Digite o " + (j + 1) + "º Número:");
            numeros[j] = Integer.parseInt(in.nextLine());
        }

        System.out.println("Digite mais um Número:");
        novoNumero = Integer.parseInt(in.nextLine());

        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] == novoNumero) {
                System.out.println("Esse Número já existe, não pode ser adicionado.");
                return;
            }
        }

        int[] novoVetor = new int[numeros.length + 1];

        for (int j = 0; j < numeros.length; j++) {
            novoVetor[j] = numeros[j];
        }

        novoVetor[numeros.length] = novoNumero;

        System.out.println("Vetor com todos os números: " + Arrays.toString(novoVetor));

    }
}
