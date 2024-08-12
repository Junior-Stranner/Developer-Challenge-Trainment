package br.com.judev.EasyMode.EX44a49EstruturasDeRepetições;

import java.util.Scanner;

public class Q47SegValorZeroMensagemValorInvEnquanto {
    
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int v1 , v2;

        System.out.println("Digite um valor ");
        v1 = Integer.parseInt(in.nextLine());

        System.out.println("Digite outro valor ");
        v2 = Integer.parseInt(in.nextLine());

     while (v2 == 0){
             
                System.out.println("VAVLOR INVÀLIDO !");break;
             //   v2 = Integer.parseInt(in.nextLine()); 
        }
       
        double resultado = v1 / v2;
        System.out.println("O resultado da divisão é: " + resultado);

       
    }
}
