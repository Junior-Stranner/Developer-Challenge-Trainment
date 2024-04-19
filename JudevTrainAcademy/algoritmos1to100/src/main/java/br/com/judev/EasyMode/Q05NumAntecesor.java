package br.com.judev.EasyMode;

import java.util.Scanner;

public class Q05NumAntecesor {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite um valor ");
        int valorX = Integer.parseInt(in.nextLine());

        valorX -= 1;
        System.out.println("Número antecessor "+valorX);
    }
}
/* 5) Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor. 
*/
