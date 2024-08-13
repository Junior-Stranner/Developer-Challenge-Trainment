package br.com.judev.EX57a69ContadoresEacumuladores;

import java.util.Scanner;

public class Q62LerNumerosDeAlunosExistentesEasNotas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número de alunos:");
        int numAlunos = Integer.parseInt(in.nextLine());

        double[] medias = new double[numAlunos];
        String[] nomes = new String[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            double[] nota = new double[3];

            System.out.println("Digite o nome do Aluno " + (i + 1) + ":");
            nomes[i] = in.nextLine();

            for (int x = 0; x < 2; x++) {
                System.out.println("Digite a nota " + (x + 1) + ":");
                nota[x] = Double.parseDouble(in.nextLine());
            }

            medias[i] = (nota[0] + nota[1] + nota[3]) / 3;
        }

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("A média do aluno " + nomes[i] + " é " + medias[i]);
        }
    }
}
