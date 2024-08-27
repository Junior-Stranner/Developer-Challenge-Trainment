package br.com.judev.EX74a76RepeticaoAninhada;

import java.util.Scanner;


public class Q76posisionXY {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int linhas = 10;
        int colunas = 60;

        for (int y = 1; y <= linhas; y++) {
            for (int x = 1; x <= colunas; x++) {
                if (y == 1 || y == linhas) {
                    System.out.print("+");
                }
                else if (x == 1 || x == colunas) {
                    System.out.print("+");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
