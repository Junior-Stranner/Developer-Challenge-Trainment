package br.com.judev.Ex70a73MaiorMenor;

import java.util.Scanner;

public class Q73Prefeitura {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int NUM_HABITANTES = 3; 
        int[] salarios = new int[NUM_HABITANTES];
        int[] filhos = new int[NUM_HABITANTES];
        int numHabitantes = 0;

        int op = 0;
        do {
            System.out.println("----------- MENU ----------");
            System.out.println("1 - Cadastrar Habitantes");
            System.out.println("2 - Calcular Estatísticas");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            op = Integer.parseInt(in.nextLine());

            switch (op) {
                case 1:
                    cadastrarHabitantes(in, salarios, filhos);
                    break;
                case 2:
                    calcularEstatisticas(salarios, filhos, NUM_HABITANTES);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (op != 3);

    }

    public static void cadastrarHabitantes(Scanner in, int[] salarios, int[] filhos) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o salário do " + (i + 1) + "º habitante (ou um valor negativo para terminar): ");
            salarios[i] = Integer.parseInt(in.nextLine());

            if(salarios[i] < 0){
                break;
            }

            System.out.print("Digite a quantidade de filhos do " + (i + 1) + "º habitante: ");
            filhos[i] = Integer.parseInt(in.nextLine());
        }
    }
    public static void calcularEstatisticas(int[] salarios, int[] filhos, int NUM_HABITANTES) {
        if (NUM_HABITANTES == 0) {
            System.out.println("Nenhum dado cadastrado.");
            return;
        }

        double somaSalarios = 0;
        double somaFilhos = 0;
        int maiorSalario = salarios[0];
        int pessoasMenor150 = 0;

        for (int i = 0; i < NUM_HABITANTES; i++) {
            somaSalarios += salarios[i];
            somaFilhos += filhos[i];

            if (salarios[i] > maiorSalario) {
                maiorSalario = salarios[i];
            }

            if (salarios[i] < 150) {
                pessoasMenor150++;
            }
        }

        double mediaSalario = somaSalarios / NUM_HABITANTES;
        double mediaFilhos = somaFilhos / NUM_HABITANTES;
        double percentualMenor150 = (pessoasMenor150 * 100.0) / NUM_HABITANTES;

        System.out.println("Média de salário da população: R$ " + mediaSalario);
        System.out.println("Média do número de filhos: " + mediaFilhos);
        System.out.println("Maior salário dos habitantes: R$ " + maiorSalario);
        System.out.println("Percentual de pessoas com salário menor que R$ 150,00: " + percentualMenor150 + "%");
    }
}
