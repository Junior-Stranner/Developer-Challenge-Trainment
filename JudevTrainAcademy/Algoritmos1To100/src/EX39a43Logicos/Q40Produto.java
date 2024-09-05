package EX39a43Logicos;

import java.util.Scanner;

public class Q40Produto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double prodDesconto = 0;
        double precoTotal = 0;
        System.out.println("Digite a descrição(nome) do Produto");
        String nome = in.nextLine();

        System.out.println("Digite a quantidade desejada ");
        int qtdProd = Integer.parseInt(in.nextLine());

        System.out.println("Preço do "+nome);
        double precoUnitario = Double.parseDouble(in.nextLine());

        prodDesconto = (qtdProd <= 5) ? 0.02 : (qtdProd < 10) ? 0.03 : 0.05;

        precoTotal = qtdProd * precoUnitario * (1 - prodDesconto);
        System.out.println("Preço total do produto é de "+precoTotal);
    }
}
