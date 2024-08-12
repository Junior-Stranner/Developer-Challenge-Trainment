package br.com.judev.EX14a26Relacionais;

import java.util.Scanner;

public class Q014ValorMaiorMenor {
        public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       int x = 1;
       while (x <= 10) {
           System.out.println("Digite um valor " + x);
           int valor = Integer.parseInt(in.nextLine());

           if (valor > 10) {
               System.out.println("É maior que 10!");
               System.out.println("Valor é maior que 10 então o programa parou");
               break;  
           } else {
               System.out.println("Não é maior que 10!");
           }

           x = x + 1;  
       }

       System.out.println("Fim do programa.");
    }
      
} /* Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
contrário escrever NÃO É MAIOR QUE 10! */
