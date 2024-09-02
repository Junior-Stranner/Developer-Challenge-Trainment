package br.com.judev.EX77a91Vetores;

import java.util.Scanner;

public class Q82UmVetorParaOoutro {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

         int[] A = new int[10];
         int[] M = new int[A.length];
         int X =0;

        for(int i = 0; i< 10 ; i++){
         System.out.println("Digite o "+(i+1)+" valor ");
          A[i] = Integer.parseInt(in.nextLine());
        }

        System.out.println("Digite um novo número ");
        X = Integer.parseInt(in.nextLine());

          for (int i = 0; i < A.length; i++) {
            M[i] = A[i] * X;
        }

        System.out.println("Vetor M");
        for(int i = 0; i< 10 ; i++){
            System.out.println("M["+i+"] = "+M[i]);
        }
    }
}
