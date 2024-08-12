package br.com.judev.EX14a26Relacionais;

import java.util.Scanner;

public class Q015PositivoOuNegativo {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int x= 1;
        int qtdNumPositivo = 0;
        int qtdNumNegativo = 0;
        while(x <=3){
        System.out.println("Digite um Número "+x);
        num = Integer.parseInt(in.nextLine());
    
        if(num >=0){
            System.out.println("Número é Positivo ! "+num);
            qtdNumPositivo++;
        }else{
            System.out.println("Número é Negativo ! "+num);
            qtdNumNegativo++;

          }

          x = x+1;
       }
       System.out.println("Total de números positivos: " + qtdNumPositivo);
       System.out.println("Total de números negativos: " + qtdNumNegativo);

    }

     /*Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo) */
}
