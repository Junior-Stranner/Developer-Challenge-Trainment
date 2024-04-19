package br.com.judev.EasyMode;

import java.util.Scanner;

public class Q07IdadePessoaDiasMes {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
            System.out.println("Digite a idade da Pessoa ");
            int idade = Integer.parseInt(in.nextLine());
    
            int ano  = idade;
            int mes = 12 * ano;
            int dias =  365 * ano;
           
    
            System.out.println("idade : "+idade
            +"\n anos : "+ano
            +"\n mes : "+mes
            +"\n dias : "+dias);
       
        }
}

/*  Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.  */
