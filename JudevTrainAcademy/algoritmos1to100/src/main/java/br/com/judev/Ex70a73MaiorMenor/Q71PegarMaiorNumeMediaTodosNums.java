package br.com.judev.Ex70a73MaiorMenor;

import java.util.Scanner;


public class QPegarMaiorNumeMediaTodosNums {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
       

        System.out.println("Digite a quantidade de Números desejados");
        int qtdNum = Integer.parseInt(in.nextLine());

        int maiorNumero = 0;
        int soma = 0;

        for(int i = 0; i <qtdNum;i++){
            System.out.println("Digite o "+i+1+" número");
            int valor = Integer.parseInt(in.nextLine());

            if (valor > maiorNumero ) {
                maiorNumero = valor;
            }

                soma += valor;
        }

        double media = soma / qtdNum;
        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("A média dos números é: " + media);
    }
}
