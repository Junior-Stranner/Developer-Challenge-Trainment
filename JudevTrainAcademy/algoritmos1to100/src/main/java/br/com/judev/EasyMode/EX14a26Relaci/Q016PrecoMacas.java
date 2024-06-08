package br.com.judev.EasyMode.EX14a26Relaci;

import java.util.Scanner;

public class Q016PrecoMacas {
     public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       int qtdMaca = 0;
       double precoMaca = 0;

       System.out.println("Digite a quantidade de maçãs que vc queira !");
       qtdMaca = Integer.parseInt(in.nextLine());

       if(qtdMaca <12){
         precoMaca = 1.30;
         precoMaca = precoMaca * qtdMaca;
       }else{
        precoMaca = 1.00;
        precoMaca = precoMaca * qtdMaca;
    }

       System.out.println("O preço tital das "+qtdMaca+ " é de "+precoMaca);
     }
}
/*  As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
escreva o custo total da compra. */
