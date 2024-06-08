package br.com.judev.EasyMode.EX14a26Relaci;

import java.util.Scanner;

public class Q26EstoqueProduto {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int[] produto = new int[2];
        int[] qtdProduto = new int[produto.length];
        int[] qtdMediaProd = new int[produto.length];

        for(int x = 0; x < produto.length; x++) {
            System.out.println("Digite o ID do Produto");
            produto[x] = Integer.parseInt(in.nextLine());

            System.out.println("Digite a quantidade de produtos em estoque");
            qtdProduto[x] = Integer.parseInt(in.nextLine());

            System.out.println("Quantidade Máxima no estoque");
            int qtdMaProduto = Integer.parseInt(in.nextLine());

            System.out.println("Quantidade Mínima no estoque");
            int qtdMinProduto = Integer.parseInt(in.nextLine());

            qtdMediaProd[x] = (qtdMaProduto + qtdMinProduto) / 2;

            if(qtdProduto[x] >= qtdMediaProd[x]) {
                System.out.println("Não efetuar a compra");
            } else {
                System.out.println("Efetuar a compra");
                System.out.println("Compra efetuada com sucesso! Quantidade em estoque: " + (qtdProduto[x]--));
            }
    
            System.out.println("Média de Produto é de: " + qtdMediaProd[x]);
        }

        for(int x = 0; x < produto.length; x++) {
            System.out.println("-----------------------------------");
            System.out.println("Produto com ID: " + produto[x] + ", Média de Produto: " + qtdMediaProd[x]);
        }
    }
}
