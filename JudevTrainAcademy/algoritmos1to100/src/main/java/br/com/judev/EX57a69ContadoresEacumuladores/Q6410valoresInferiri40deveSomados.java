package br.com.judev.EX57a69ContadoresEacumuladores;

import java.util.Scanner;

public class Q6410valoresInferiri40deveSomados {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int soma =0;
        int cont = 0;

        for(int x = 1; x <= 10;x++){
            System.out.println("Informe o "+x+" número");
            int num = Integer.parseInt(in.nextLine());
            if(num < 40){
               cont++;
               soma+=num;
            }
        }

        System.out.println(cont+" Valores que forma inferiores a 40 e a soma deles é = "+soma);
    }
}
