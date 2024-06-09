package br.com.judev.EasyMode.EX39a43Logicos;

import java.util.Scanner;

public class Q41NotasExcPesoDif {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {

            System.out.println("Digite a nota da 1ª verificação:");
            double n1 = Double.parseDouble(in.nextLine());

            System.out.println("Digite a nota da 2ª verificação:");
            double n2 = Double.parseDouble(in.nextLine());

            System.out.println("Digite a nota da 3ª verificação:");
            double n3 = Double.parseDouble(in.nextLine());

            System.out.println("Digite a média dos exercícios:");
            double mediaExercicios = Double.parseDouble(in.nextLine());

            double mediaFinal = ((n1 + n2 * 2 + n3 * 3) + mediaExercicios) / 7;

            String conceito = (mediaFinal >= 9) ? "Aprovado com conceito (A)" :
                              (mediaFinal >= 7.5) ? "Aprovado com conceito (B)" :
                              (mediaFinal >= 6) ? "Na média com conceito (C)" :
                              "Reprovado com conceito (D)";

            System.out.println(conceito + " , com média " + mediaFinal);

            if (mediaFinal < 7 && mediaFinal >= 6) {
                System.out.println("Em Recuperação!! Com a média " + mediaFinal
                        + "\nVocê tem o direito da segunda chance, você quer aproveitar?"
                        + "\n s - Sim"
                        + "\n n - Não");
                 char op = in.nextLine().charAt(0);

                if (op == 's' || op == 'S') {
                    System.out.println("Você escolheu aproveitar a segunda chance.");
                    continue;  // Volta ao início do loop para uma nova tentativa
                } else if (op == 'n' || op == 'N') {
                    System.out.println("Você escolheu não aproveitar a segunda chance.");
                    break;  // Sai do loop e termina o programa
                } else {
                    System.out.println("Opção inválida.");
                    break;  // Sai do loop em caso de opção inválida
                }
            } else {
                break;  // Sai do loop se a médiaFinal não for de recuperação
            }
        } while (true);  // Loop infinito até que uma condição de parada seja atendida
    }
}
