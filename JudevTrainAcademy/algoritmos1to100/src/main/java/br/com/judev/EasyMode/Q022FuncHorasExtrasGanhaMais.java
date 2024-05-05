package br.com.judev.EasyMode;

import java.util.Scanner;

public class Q022FuncHorasExtrasGanhaMais {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Digite o número total de horas trabalhadas no mês:");
        int horasTrabalhadas = Integer.parseInt(in.nextLine());

        System.out.println("Digite o salário por hora:");
        double salarioPorHora = Double.parseDouble(in.nextLine());

         // Definição do limite de horas mensais (4 semanas de 40 horas cada)
         int limiteHorasMensais = 160;

        double salarioFunc = limiteHorasMensais * salarioPorHora;
        System.out.println("Salário do funcionario que trabalhou "+limiteHorasMensais+ "no mês recebe "+salarioFunc);

        double salarioTotal = salarioFunc * 1.5;

        System.out.println("O salário total do funcionário é com as horas de trabalhadas de "+horasTrabalhadas+" no mês  " + salarioTotal);

     }
}
