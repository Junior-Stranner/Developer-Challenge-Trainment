package Ex77a91Vetores;

import java.util.Scanner;

public class Q89DOisVetCalcQtdNumsIguais {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);   

        int[] V1 = new int[5];
        int[] V2 = new int[5];
        int contador = 0;

        System.out.println("Digite os 15 números do vetor V1:");
        for (int i = 0; i < V1.length; i++) {
            System.out.print("V1[" + i + "] = ");
            V1[i] = in.nextInt();
        }

        System.out.println("Digite os 15 números do vetor V2:");
        for (int i = 0; i < V2.length; i++) {
            System.out.print("V2[" + i + "] = ");
            V2[i] = in.nextInt();
        }

        for (int i = 0; i < V1.length; i++) {
            if (V1[i] == V2[i]) {
                contador++;
            }
        }
        System.out.println("A quantidade de vezes que V1 e V2 possuem os mesmos números nas mesmas posições é: " + contador);
    }
}
