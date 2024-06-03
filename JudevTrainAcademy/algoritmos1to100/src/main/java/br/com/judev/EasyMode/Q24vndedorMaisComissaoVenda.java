package br.com.judev.EasyMode;

import java.util.Scanner;

public class Q24vendedorMaisComissaoVenda {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("Salário fixo do funcionário ");
        double salFixo = Double.parseDouble(in.nextLine());

        System.out.println("total de vendas realizadas no mês ");
        double vendas = Double.parseDouble(in.nextLine());

        double comissao = 0;
        double percentualComissao = 0;
        if(vendas <= 1500){
            comissao = 0.03;
            percentualComissao = 3; 
        } else {
            comissao = 0.05; 
            percentualComissao = 5; 
        }
        
        double salarioTotal = salFixo + (salFixo * comissao); 

        System.out.println("Salário mais comissao de : "+percentualComissao+" é de : "+salarioTotal);
    }
}
