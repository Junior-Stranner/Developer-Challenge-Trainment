package br.com.judev.EasyMode.EX14a26Relacionais;

import java.util.Scanner;

public class Q022FuncHorExtrasAumento {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] nomeFunc = new String[2];
        double[] salTotalFunc = new double[2];

        for (int x = 0; x < nomeFunc.length; x++) {
            System.out.println("Digite o nome do Funcionário:");
            nomeFunc[x] = in.nextLine();

            System.out.println("Digite o número total de horas trabalhadas no mês:");
            int horasTrabalhadas = Integer.parseInt(in.nextLine());

            System.out.println("Digite o salário por hora:");
            double salarioPorHora = Double.parseDouble(in.nextLine());

            int limiteHorasMensais = 160;
            int horasExtras = 0;
            salTotalFunc[x] = salarioPorHora * horasTrabalhadas;

            if (horasTrabalhadas > limiteHorasMensais) {
                horasExtras = horasTrabalhadas - limiteHorasMensais;
                double pagamentoHorasExtras = salarioPorHora * horasExtras * 1.5;
                salTotalFunc[x] = (limiteHorasMensais * salarioPorHora) + pagamentoHorasExtras;

                System.out.println("-------------------------------------------"
                    + "\nSalário do funcionário " + nomeFunc[x] + " que trabalhou " + horasTrabalhadas + " horas no mês"
                    + "\nreceberá 50% a mais das horas extras que foram: " + horasExtras + " hora(s).");
            } else {
                System.out.println("Você trabalhou " + horasTrabalhadas + " horas. Não há horas extras."
                    + "\nSalário normal de: " + salTotalFunc[x]);
            }

            System.out.println("O salário total do funcionário " + nomeFunc[x] + ", com as horas trabalhadas de " + horasTrabalhadas + " no mês, é de: " + salTotalFunc[x]);
        }

        for (int i = 0; i < nomeFunc.length; i++) {
            System.out.println("-----------------------------------");
            System.out.println("O salário total do funcionário " + nomeFunc[i] + " é de: " + salTotalFunc[i]);
        }
    }
}
