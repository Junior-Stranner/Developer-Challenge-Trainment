package br.com.judev.EasyMode.EX39a43Logicos;

import java.util.Scanner;

public class Q41NotasExcPesoDif {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        
        System.out.println("Digite a nota da 1ª verificação:");
        double N1 = Double.parseDouble(in.nextLine());

        System.out.println("Digite a nota da 2ª verificação:");
        double N2 = Double.parseDouble(in.nextLine());

        System.out.println("Digite a nota da 3ª verificação:");
        double N3 = Double.parseDouble(in.nextLine());

        System.out.println("Digite a média dos exercícios:");
        double mediaExercicios = Double.parseDouble(in.nextLine());
    }
}
