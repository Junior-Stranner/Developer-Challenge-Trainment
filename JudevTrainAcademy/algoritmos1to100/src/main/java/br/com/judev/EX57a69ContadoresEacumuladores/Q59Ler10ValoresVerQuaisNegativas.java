package br.com.judev.EX57a69ContadoresEacumuladores;

import java.util.Scanner;


public class Q59Ler10ValoresVerQuaisNegativas {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

      int cont= 1;
      int vNegativo =0;
        while (cont <11) {
            System.out.println("Digite um valor "+cont);
            int valor = Integer.parseInt(in.nextLine());

             if(valor <0){
                vNegativo++;
            }
         cont++;
        }
        System.out.println("Valores Negativos "+vNegativo);
    }
}
