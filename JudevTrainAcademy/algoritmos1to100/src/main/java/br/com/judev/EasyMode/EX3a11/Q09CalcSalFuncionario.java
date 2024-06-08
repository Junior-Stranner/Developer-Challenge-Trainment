package br.com.judev.EasyMode.EX3a11;

import java.util.Scanner;

public class Q09CalcSalFuncionario {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o Salário do Funcionário");
        double salario = Double.parseDouble(in.nextLine());

        System.out.println("Digite o seu novo Salário");
        double novoSalario = Double.parseDouble(in.nextLine());


    double percentualSalario =((novoSalario - salario) /salario) *100;
    /* ==================   OU   =======================
     * 
     *  double diferencaSalario = novoSalario - salarioAnterior;

        double percentualAumento = (diferencaSalario / salarioAnterior) * 100;
    */

    System.out.println("Seu novo Slário é de : "+novoSalario
    +"\n com aumento de : "+percentualSalario+"%");
    }
}
/* Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
Calcular e escrever o valor do novo salário.   */
