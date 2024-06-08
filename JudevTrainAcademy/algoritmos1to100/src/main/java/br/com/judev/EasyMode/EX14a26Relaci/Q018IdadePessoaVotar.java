package br.com.judev.EasyMode.EX14a26Relaci;

import java.util.Scanner;

public class Q018IdadePessoaVotar {
     public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       int anoAtual = 2024;
       int dataNascimento = 0;

       System.out.println("Digite o ano que vc nasceu ? ");
       dataNascimento = Integer.parseInt(in.nextLine());

      int idade = anoAtual - dataNascimento;

       if(dataNascimento <=2006){
       System.out.println("ele tem "+idade+ " anos de idade , ele pode votar em "+anoAtual);
     }else{
        System.out.println("ele tem "+idade+ "anos de idade ,ele não pode votar em "+anoAtual);
        } 
    }
}

/* ) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu). */