import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {

        /*
         * Crie um conversor de moedas.
         * o cliente informa o tipo de conversão e o valor.
         * 
         * Opções para conversão:
         * 1 - Dólar para Real.
         * 2 - Real para Dólar.
         * 3 - Euro para Real.
         * 4 - Real para Euro.
         */

        Scanner in = new Scanner(System.in);

        float cotacaoDolar = 5.50f;
        float cotacaoEuro = 6.50f;

        System.out.println("Digite o valor que deseja converter:");
        float valor = Float.parseFloat(in.nextLine());

        System.out.println("Escolha o tipo de conversão:");
        System.out.println("1 - Dólar para Real");
        System.out.println("2 - Real para Dólar");
        System.out.println("3 - Euro para Real");
        System.out.println("4 - Real para Euro");
        int opcao = Integer.parseInt(in.nextLine());

        float resultado = 0;

        switch (opcao) {
            case 1:
                resultado = valor * cotacaoDolar;
                System.out.println("Valor em Reais: R$ " + resultado);
                break;
            case 2:
                resultado = valor / cotacaoDolar;
                System.out.println("Valor em Dólares: US$ " + resultado);
                break;
            case 3:
                resultado = valor * cotacaoEuro;
                System.out.println("Valor em Reais: R$ " + resultado);
                break;
            case 4:
                resultado = valor / cotacaoEuro;
                System.out.println("Valor em Euros: € " + resultado);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        in.close();
    }
}
