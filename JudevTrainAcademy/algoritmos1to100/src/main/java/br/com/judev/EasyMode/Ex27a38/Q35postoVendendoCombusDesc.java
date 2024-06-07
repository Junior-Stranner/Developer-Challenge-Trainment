package br.com.judev.EasyMode.Ex27a38;

import java.util.Scanner;

public class Q35postoVendendoCombusDesc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gasolina = 3.30;
        double alcool = 2.90;

        System.out.println("Digite a quantidade de litros vendidos: ");
        double qtdlitro = Double.parseDouble(in.nextLine());

        System.out.println("Qual tipo de combustível?");
        System.out.println("1 - Gasolina");
        System.out.println("2 - Álcool");
        int opcao = Integer.parseInt(in.nextLine());

        double precoTotal = 0;
        double precoLitro = 0;
        double descontoPorLitro = 0;

        switch (opcao) {
            case 1:
                precoLitro = gasolina;
                if (qtdlitro <= 20) {
                    descontoPorLitro = 0.03;
                    System.out.println("Desconto por litro de 3%");
                } else {
                    descontoPorLitro = 0.05;
                    System.out.println("Desconto por litro de 5%");
                }
                precoTotal = qtdlitro * precoLitro * (1 - descontoPorLitro);
                System.out.println("Gasolina comprada com preço total de R$ " + precoTotal);
                break;

            case 2:
                precoLitro = alcool;
                if (qtdlitro <= 20) {
                    descontoPorLitro = 0.04;
                    System.out.println("Desconto por litro de 4%");
                } else {
                    descontoPorLitro = 0.06;
                    System.out.println("Desconto por litro de 6%");
                }
                precoTotal = qtdlitro * precoLitro * (1 - descontoPorLitro);
                System.out.println("Álcool comprado com preço total de R$ " +  precoTotal);
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
