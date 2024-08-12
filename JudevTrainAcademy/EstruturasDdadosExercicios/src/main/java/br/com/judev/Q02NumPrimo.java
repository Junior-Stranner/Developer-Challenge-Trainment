package br.com.judev;

import java.util.Scanner;

public class Q02NumPrimo {
   
    public static void main(String[]args){

        Scanner in = new Scanner(System.in); {
            int num =0;
            boolean numPrimo = false;

            System.out.println("digite um número");
            num = Integer.parseInt(in.nextLine());

            if(num % 2 == 0)numPrimo = true;System.out.println(numPrimo+ " número "+num+" é primo");
            System.out.println(numPrimo+" Número "+num+" não é primo");
        }
    }
}
