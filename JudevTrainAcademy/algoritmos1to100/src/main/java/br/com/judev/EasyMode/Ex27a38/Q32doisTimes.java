package br.com.judev.EasyMode.Ex27a38;

import java.util.Scanner;

public class Q32doisTimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int bayern;
        int dortmund;
        char quem;
        int contador;

        for (int i = 0; i <3; i++) {
            System.out.println(i + 1 + "º Jogo oficial");

            bayern = 0;
            dortmund = 0;
            contador = 0;

            do {
                System.out.println("Quem irá fazer o próximo gol?");
                System.out.println("A - Bayern");
                System.out.println("B - Dortmund");

                System.out.print("Escolha a opção (A/B): ");
                quem = in.nextLine().toUpperCase().charAt(0);

                switch (quem) {
                    case 'A':
                        System.out.println("Próximo gol será do Bayern!");
                        bayern++;
                        break;
                    case 'B':
                        System.out.println("Próximo gol será do Dortmund!");
                        dortmund++;
                        break;
                    default:
                        System.out.println("Opção inválida! Por favor, escolha A ou B.");
                }
                contador++;
            } while (contador < 5);

            // Exibir o placar final de cada jogo
            System.out.println("Placar Final do " + i + 1 + "º Jogo:");
            System.out.println("Bayern: " + bayern);
            System.out.println("Dortmund: " + dortmund);
        }
    }
}
