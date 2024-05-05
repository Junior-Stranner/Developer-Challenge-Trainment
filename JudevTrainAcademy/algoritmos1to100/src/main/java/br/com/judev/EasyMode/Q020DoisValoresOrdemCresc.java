package br.com.judev.EasyMode;

import java.util.Scanner;

public class Q020DoisValoresOrdemCresc {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite  valor A");
        int valorA = Integer.parseInt(in.nextLine());
        System.out.println("Digite  Valor  B");
        int valorB = Integer.parseInt(in.nextLine());
        
        if(valorA > valorB){
            System.out.println("Ordem Crescente "+valorA+" , "+valorB);
        }else if(valorB > valorA){
            System.out.println("Ordem Crescente "+valorB+" , "+valorA);
        }else{
            System.out.println("Erro !! valores não podem ser iguais!");
        }
    }
}

/* 20) Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente. 
*/
