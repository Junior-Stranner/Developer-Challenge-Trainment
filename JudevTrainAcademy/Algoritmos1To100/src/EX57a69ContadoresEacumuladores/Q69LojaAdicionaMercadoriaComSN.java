package EX57a69ContadoresEacumuladores;

import java.util.Scanner;

public class Q69LojaAdicionaMercadoriaComSN {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double valorTotal = 0.0;
        int qtdMercadoria = 0;
        char resposta;

        do {
            System.out.println("Digite S/N para adicionar uma mercadoria:");
            resposta = in.nextLine().charAt(0);

            if (resposta == 'S' || resposta == 's') {
                qtdMercadoria++;
                System.out.println("Mercadoria será adicionada.");
            } else if (resposta == 'N' || resposta == 'n') {
                System.out.println("Mercadoria não será adicionada.");
            } else {
                System.out.println("Entrada inválida.");
            }

        } while (resposta == 'S' || resposta == 's');

        for (int i = 1; i <= qtdMercadoria; i++) {
            System.out.print("Informe o valor da mercadoria " + i + ": ");
            double valorMercadoria = Double.parseDouble(in.nextLine());
            valorTotal += valorMercadoria;
        }

        double mediaValor = valorTotal / qtdMercadoria;

        System.out.println("Valor total em estoque: R$ " + valorTotal);
        System.out.println("Média de valor das mercadorias: R$ " + mediaValor);

    }
}
