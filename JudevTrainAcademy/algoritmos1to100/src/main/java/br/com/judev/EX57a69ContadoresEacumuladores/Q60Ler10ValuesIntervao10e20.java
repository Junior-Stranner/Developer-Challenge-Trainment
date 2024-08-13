package br.com.judev.EX57a69ContadoresEacumuladores;

import java.util.Scanner;

public class Q60Ler10ValuesIntervao10e20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cont= 1;
        int entre10e20 = 0;;
        do{
            System.out.println("Digite um valor "+cont);
            int valor = Integer.parseInt(in.nextLine());

            if(valor >=10 && valor <=20){
                 entre10e20++;
            }
            cont++;
       }while(cont <=10);
       
        System.out.println("Valore entre 10 e 20 (incluindo 10 e 20) são = "+entre10e20);
    }
}
