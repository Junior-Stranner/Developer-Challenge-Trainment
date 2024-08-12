package br.com.judev;

import java.util.Scanner;

public class Q01MaiorNum {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
            int[] num = new int[10];
            int maiorNum = 0;

            for (int x = 0; x < num.length; x++) {
                System.out.println("Digite um número: ");
                num[x] = in.nextInt();
                if (num[x] > maiorNum) {
                    maiorNum = num[x];
                }
            }

            System.out.println("Maior número é " + maiorNum);
    }
}

