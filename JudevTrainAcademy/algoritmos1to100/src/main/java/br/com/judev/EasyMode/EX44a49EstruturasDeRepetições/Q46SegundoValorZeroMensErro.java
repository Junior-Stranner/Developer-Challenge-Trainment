package br.com.judev.EasyMode.EX44a49EstruturasDeRepetições;

import java.util.Scanner;

public class Q46SegundoValorZeroMensErro {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int v1 , v2;

        System.out.println("Digite um valor ");
        v1 = Integer.parseInt(in.nextLine());

        do {
           
            System.out.println("Digite outro valor ");
             v2 = Integer.parseInt(in.nextLine());
           
             if(v2==0){
                System.out.println("VALOR INVÀLIDO !");break;
             }
        } while (v2 == 0);

        double resultado = v1 / v2;
        System.out.println("O resultado da divisão é: " + resultado);

       
    }
}
