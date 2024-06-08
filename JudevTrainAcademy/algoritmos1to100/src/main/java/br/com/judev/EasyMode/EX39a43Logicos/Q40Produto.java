package br.com.judev.EasyMode.EX39a43Logicos;

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


        if(qtdProd <=5 ){
            prodDesconto = 0.02;
        }else if(qtdProd > 5 && qtdProd <10){
            prodDesconto = 0.03;
        }else{
            prodDesconto = 0.05;

        }
        precoTotal = qtdProd * precoUnitario;
        System.out.println("Preço total do produto é de "+precoTotal);
    }
}
