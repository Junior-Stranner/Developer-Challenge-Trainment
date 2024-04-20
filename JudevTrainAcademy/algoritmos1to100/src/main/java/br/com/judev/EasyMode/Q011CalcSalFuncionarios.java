package br.com.judev.EasyMode;

import java.util.Scanner;

public class Q011CalcSalFuncionarios {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] func = {3200, 4000, 3000};
        double percentualVenda = 0.05;

        for(int x = 0; x < 3; x++) {
            System.out.println("Digite quantos carros o funcionário vendeu:");
            int qtdCarrosVendidos = Integer.parseInt(in.nextLine());
            double comissaoTotal = 0;

            for(int i = 0; i < qtdCarrosVendidos; i++) {
                System.out.println("Digite o valor do carro " + (i + 1) + ":");
                double valorCarro = Double.parseDouble(in.nextLine());

                comissaoTotal = valorCarro * percentualVenda;
            }

            func[x] += comissaoTotal;
        }

        for(int i = 0; i < func.length; i++) {
            System.out.println("Salário novo do vendedor é de: " + func[i]);
        }
    }
}

/* Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
vendedor.   */
