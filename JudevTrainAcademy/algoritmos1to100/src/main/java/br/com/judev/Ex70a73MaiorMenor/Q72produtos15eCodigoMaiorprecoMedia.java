package br.com.judev.Ex70a73MaiorMenor;

import java.util.Scanner;


public class Q72produtos15eCodigoMaiorprecoMedia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int quantidadeProdutos = 15;
        double maiorPreco = Double.MIN_VALUE;
        double somaPrecos = 0;

        for (int i = 1; i <= quantidadeProdutos; i++) {
            System.out.print("Digite o código do produto " + i + ": ");
            int codigoProduto = Integer.parseInt(in.nextLine());

            System.out.print("Digite o preço do produto " + i + ": ");
            double precoProduto = Integer.parseInt(in.nextLine());

            if (precoProduto > maiorPreco) {
                maiorPreco = precoProduto;
            }

            somaPrecos += precoProduto;
        }

        double mediaPrecos = somaPrecos / quantidadeProdutos;

        System.out.println("O maior preço lido é: R$ " + maiorPreco);
        System.out.println("A média dos preços dos produtos é: R$ " + mediaPrecos);

    }
}
