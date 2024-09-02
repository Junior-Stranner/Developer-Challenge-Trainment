package br.com.judev.EX77a91Vetores;

import java.util.Scanner;

public class Q81MesmoQueEX80MenorELe {
    public static void main(String[] args) {
        
    
       Scanner in = new Scanner(System.in);

        int[] Q = new int[20];
        int menorNum = 1000000000;
        int posicaoMenorNum = -1;      

        
        for(int i =0; i < Q.length; i++){
            System.out.println("Digite o "+(i+1)+" Número");
            int valor = Integer.parseInt(in.nextLine());  

            if(valor >=0){
                Q[i] = valor;  

                if(valor< menorNum){
                    menorNum = valor;
                    posicaoMenorNum = i;
                }
            }else{
                System.out.println("valor não pode ser negativo"); i--;
         
               }
         }
         System.out.println("O menor valor inserido foi: " + menorNum + " na posição " + (posicaoMenorNum + 1));
    }
}
