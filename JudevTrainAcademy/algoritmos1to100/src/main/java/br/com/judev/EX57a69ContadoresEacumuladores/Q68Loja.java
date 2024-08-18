package br.com.judev.EX57a69ContadoresEacumuladores;

import java.util.Scanner;

public class Q68Loja {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double valorTotal = 0.0;

       System.out.println("Digite a quantidade de mercadorias ");
       int qtdMercadiria = Integer.parseInt(in.nextLine());


       for(int i = 1; i <= qtdMercadiria; i++){
        System.out.print("Informe o valor da mercadoria " + i + ": ");
        double valorMercadoria =  Integer.parseInt(in.nextLine());
        valorTotal += valorMercadoria;
       }

       double mediaValor = valorTotal / qtdMercadiria;
       
       System.out.println("Valor total em estoque: R$ " + valorTotal);
       System.out.println("Média de valor das mercadorias: R$ " + mediaValor);

    }
}
