package br.com.judev.EasyMode.Ex27a38;

import java.util.Scanner;

public class Q30ValorOrdemCrescente {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] valores = new int[3];

        for (int x = 0; x < 3; x++) {
            System.out.println("Digite o " + (x + 1) + "º valor:");
            int valor = Integer.parseInt(in.nextLine());
            
            if (x > 0 && valor < valores[x - 1]) {
                System.out.println("Os valores devem ser digitados em ordem crescente.");
                return; 
            }
            
            valores[x] = valor;
        }

        System.out.println("Os valores em ordem crescente são:");
        for (int valor : valores) {
            System.out.println(valor);
        }
    }
}
