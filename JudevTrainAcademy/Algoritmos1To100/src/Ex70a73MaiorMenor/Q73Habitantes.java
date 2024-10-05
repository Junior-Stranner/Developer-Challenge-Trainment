package Ex70a73MaiorMenor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q73Habitantes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         int qtdHabitantes = 3;
        double[] salarios = new double[qtdHabitantes];
        int[] filhos = new int[qtdHabitantes];

        int op;
                do{
                    System.out.println("Pesquisa Prefeitura" +
                        "\n 1 - Cadastrar Habitante" +
                        "\n 2 - Leitura da Pesquisa" +
                        "\n 3 - Sair");
                     op = Integer.parseInt(in.nextLine());
        
                    switch (op) {
                        case 1:
                            cadastrarHabitantes(in, salarios, filhos);
                            break;
                        case 2:
                            vizualizarPesquisa(qtdHabitantes,salarios, filhos);
                            break;
                        case 3:
                            System.out.println("Saindo ....");
                            in.close();
                            return;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                }while(op !=3);
    }

    public static void cadastrarHabitantes(Scanner in, double[] salarios, int[] filhos) {
        for (int i = 0; i < filhos.length; i++) {
            System.out.print("Digite o salário do habitante " + (i + 1) + ": ");
            double salario = Double.parseDouble(in.nextLine());

            if (salario < 0) {
                System.out.println("Cadastro interrompido por salário negativo.");
                break;
            }

            System.out.print("Digite o número de filhos do habitante " + (i + 1) + ": ");
            int numeroFilhos = Integer.parseInt(in.nextLine());

            salarios[i] = salario;
            filhos[i] = numeroFilhos;
        }
    }

    public static void vizualizarPesquisa(int qtdHabitantes , double[] salarios, int[] filhos) {
            if (qtdHabitantes == 0) {
            System.out.println("Nenhum dado cadastrado.");
            return;
        }

        int totalHabitantes = salarios.length;
        double totalSalario = 0;
        int totalFilhos = 0;
        double maiorSalario = 0;
        int contSalarioMenor150 = 0;

        for (int i = 0; i < totalHabitantes; i++) {
            totalSalario += salarios[i];
            if (salarios[i] > maiorSalario) {
                maiorSalario = salarios[i];
            }
            if (salarios[i] < 150) {  
                contSalarioMenor150++;
            }

            totalFilhos += filhos[i];
        }

        double mediaSalario = totalSalario / totalHabitantes;
        double mediaFilhos =  totalFilhos / totalHabitantes;
        double percentualSalarioMenor150 =  (contSalarioMenor150 / totalHabitantes )* 100;

        System.out.printf("Média de salário da população: R$ %.2f%n", mediaSalario);
        System.out.printf("Média do número de filhos: %.2f%n", mediaFilhos);
        System.out.printf("Maior salário dos habitantes: R$ %.2f%n", maiorSalario);
        System.out.printf("Percentual de pessoas com salário menor que R$ 150,00: %.2f%%%n", percentualSalarioMenor150);
    }
}
