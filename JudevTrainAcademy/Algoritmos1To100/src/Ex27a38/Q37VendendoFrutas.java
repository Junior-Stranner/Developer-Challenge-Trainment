package  Ex27a38;

import java.util.Scanner;

public class Q37VendendoFrutas {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite quantos quilos ? ");
        double quilo = Double.parseDouble(in.nextLine());

        System.out.println("Qual tipo de combustível?");
        System.out.println("1 - morango");
        System.out.println("2 - maça");
        int opcao = Integer.parseInt(in.nextLine());


        double morango = 0;
        double maca = 0;
        double precoTotal = 0;
     //   double  precoLitro= 0;
        double descontoQuilo = 0;

        switch (opcao) {
            case 1:
                if (quilo <= 5) {
                    morango = 2.50;
                    precoTotal = quilo * morango ;
                    System.out.println("Preço dos morangos é de R$ "+precoTotal);
                } else {
                    morango = 2.20;
                    precoTotal = quilo * morango ;
                    System.out.println("Preço dos morangos é de R$ "+precoTotal);
                }
                break;

            case 2:
            if (quilo <= 5) {
                maca = 1.80;
                precoTotal = quilo * maca ;
                System.out.println("Preço dos macas é de R$ "+precoTotal);
            } else {
                maca = 1.50;
                precoTotal = quilo * maca ;
                System.out.println("Preço dos macas é de R$ "+precoTotal);
            }
            break;
            
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
