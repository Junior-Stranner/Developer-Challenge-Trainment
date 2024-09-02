package br.com.judev.EX77a91Vetores;

import java.util.Scanner;

public class Q83Valores20OrdemInversa {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

         int[] vet = new int[5];

       for(int x =0; x< vet.length; x++){
        System.out.println("Digite o "+(x+1)+" valor ");
        vet[x] = Integer.parseInt(in.nextLine());
       }
       
       System.out.println("Valores em ordem inversa");
       for(int x = vet.length-1; x >=0; x--){
        System.out.println("Valor: "+ vet[x]);

       }
    }
}
