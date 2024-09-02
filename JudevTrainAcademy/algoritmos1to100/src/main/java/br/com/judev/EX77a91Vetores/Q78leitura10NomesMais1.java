package br.com.judev.EX77a91Vetores;

import java.util.Scanner;

public class Q78leitura10NomesMais1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] nomes = new String[10];
        String nome = "";

        for(int i =0; i< nomes.length-1;i++){
            System.out.println("Digite o "+(i+1)+" nome");
            nomes[i] = in.nextLine();
        }
        int quantidadeNomesMais1 =0;
        System.out.println("(Todos os");
        for(int i =0; i< nomes.length-1;i++){
            System.out.print(nomes[i]+" \n");
            quantidadeNomesMais1++;
        }
        System.out.println(")");
        System.out.println("Quantidade de nomes : "+quantidadeNomesMais1);

        if(quantidadeNomesMais1 == nomes.length-1){
          System.out.println("Adicionar mais um nome ");
          System.out.println("Digite um nome ");
          nome = in.nextLine();
        }else{
            System.out.println("quantidade minima não atingida ");
        }
        nomes[nomes.length-1] += nome;
        for(int i =0; i< nomes.length;i++){
        System.out.print("\n nomes "+nomes[i]);
       }
       quantidadeNomesMais1++;
       System.out.println("Quantidade de nomes : "+quantidadeNomesMais1);
    }
}
