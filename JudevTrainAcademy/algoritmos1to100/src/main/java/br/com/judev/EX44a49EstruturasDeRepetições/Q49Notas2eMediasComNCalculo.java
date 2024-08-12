package br.com.judev.EX44a49EstruturasDeRepetições;

import java.util.Scanner;

public class Q49Notas2eMediasComNCalculo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numAlunos;

        System.out.println("Digite o número de alunos:");
        numAlunos = Integer.parseInt(in.nextLine());

        double[] medias = new double[numAlunos];
        String[] nomes = new String[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            double[] nota = new double[2];

            System.out.println("Digite o nome do Aluno " + (i + 1) + ":");
            nomes[i] = in.nextLine();

            for (int x = 0; x < 2; x++) {
                System.out.println("Digite a nota " + (x + 1) + ":");
                nota[x] = Double.parseDouble(in.nextLine());     
            }

            medias[i] = (nota[0] + nota[1]) / 2;
            System.out.println("Sua média é " + medias[i]);

            System.out.println("Deseja alterar as suas notas? S/N");
            String resposta = in.nextLine().trim().toUpperCase();

            if (resposta.equals("S")) {
                for (int x = 0; x < 2; x++) {
                 //   while (true) {
                        System.out.println("Digite a nova nota " + (x + 1) + ":");
                        try {
                            nota[x] = Double.parseDouble(in.nextLine());
                       //     break; 
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida. Por favor, digite um número válido.");
                      //  }
                    }
                }
                medias[i] = (nota[0] + nota[1]) / 2; 
                System.out.println("Novo cálculo: Sua média é " + medias[i]);
            }
        }

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("A média do aluno " + nomes[i] + " é " + medias[i]);
        }
    }
}
