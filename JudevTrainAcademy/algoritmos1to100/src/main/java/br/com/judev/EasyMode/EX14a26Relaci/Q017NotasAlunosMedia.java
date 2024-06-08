package br.com.judev.EasyMode.EX14a26Relaci;

import java.util.Scanner;

public class Q017NotasAlunosMedia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] alunos = {"Junior", "Bubu", "Alberto"};

        double[] medias = new double[alunos.length];  

        double n1, n2;

        for (int x = 0; x < alunos.length; x++) {  
            System.out.println("Insira as notas para o aluno " + alunos[x] + ":");

            System.out.println("Digite a primeira nota:");
            n1 = Double.parseDouble(in.nextLine()); 

            System.out.println("Digite a segunda nota:");
            n2 = Double.parseDouble(in.nextLine()); 

            double media = (n1 + n2) / 2;  
            medias[x] = media;  

            if (media >= 6) {  
                System.out.println("O aluno " + alunos[x] + " foi aprovado com média: " + media);
            } else {
                System.out.println("O aluno " + alunos[x] + " foi reprovado com média: " + media);
            }
        }

        for (int i = 0; i < alunos.length; i++) {  
            System.out.println("O aluno " + alunos[i] + " teve uma média de: " + medias[i]);
        }
    }
}

/* Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
aluno é aprovado). Escrever também a média calculada. */
