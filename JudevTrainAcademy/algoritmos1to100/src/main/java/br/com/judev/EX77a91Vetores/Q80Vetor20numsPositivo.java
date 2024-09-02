package br.com.judev.EX77a91Vetores;

import java.util.Scanner;

public class Q80Vetor20numsPositivo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] Q = new int[20];
        int maiorNum = 0;
        int posicaoMaiorNum = -1;      

        
        for(int i =0; i < Q.length; i++){
            System.out.println("Digite o "+(i+1)+" Número");
            int valor = Integer.parseInt(in.nextLine());  

            if(valor >=0){
                Q[i] = valor;  

                if(valor> maiorNum){
                    maiorNum = valor;
                    posicaoMaiorNum = i;
                }
            }else{
                System.out.println("valor não pode ser negativo"); i--;
         
               }
         }
         System.out.println("O maior valor inserido foi: " + maiorNum + " na posição " + (posicaoMaiorNum + 1));

    }
}
