package br.com.judev;

import java.util.Scanner;

public class Q04FatorialNum {
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = Integer.parseInt(in.nextLine());

        int fatorial = calcularFatorial(num);

        System.out.println("O fatorial de " + num + " é: " + fatorial);

        in.close();
    }

    private static int calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }
}
