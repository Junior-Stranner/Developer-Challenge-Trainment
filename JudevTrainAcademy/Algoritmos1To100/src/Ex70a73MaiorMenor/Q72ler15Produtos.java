package Ex70a73MaiorMenor;

import java.util.Scanner;

public class Q72ler15Produtos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeProdutos = 15;
        double maiorPreco = 0;
        double somaPrecos = 0;

        for (int i = 1; i <= quantidadeProdutos; i++) {
            System.out.print("Digite o código do produto " + i + ": ");
            int codigo = scanner.nextInt();  

            System.out.print("Digite o preço do produto " + i + ": ");
            double preco = scanner.nextDouble();  

            if (preco > maiorPreco) {
                maiorPreco = preco;
            }
            somaPrecos += preco;
        }

        double mediaPrecos = somaPrecos / quantidadeProdutos;

        System.out.println("\nO maior preço lido é: " + maiorPreco);
        System.out.println("A média aritmética dos preços é: " + mediaPrecos);
    }
}
