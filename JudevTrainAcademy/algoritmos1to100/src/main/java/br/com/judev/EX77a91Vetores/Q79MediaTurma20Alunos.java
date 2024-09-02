package br.com.judev.EX77a91Vetores;

import java.util.Scanner;

public class Q79MediaTurma20Alunos {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       int numAlunos = 3; 
       double[] mediaTurma = new double[numAlunos];
       int alunoAcimaMedia = 0;
       double mediaTotal = 0;

       for(int x = 0; x <numAlunos; x++){
        double somaNotas = 0;
         
        System.out.println("Digite a 1ª nota do aluno " + (x + 1) + ":");
        somaNotas += Double.parseDouble(in.nextLine());

        System.out.println("Digite a 2ª nota do aluno " + (x + 1) + ":");
        somaNotas += Double.parseDouble(in.nextLine()); 

        System.out.println("Digite a 3ª nota do aluno " + (x + 1) + ":");
        somaNotas += Double.parseDouble(in.nextLine());
         
        mediaTurma[x] = somaNotas / 3; 
    }

    for (int i = 0; i < numAlunos; i++) {
        if (mediaTurma[i] > 7) {
          alunoAcimaMedia++;
          mediaTotal += mediaTurma[i];
        }
      }
       System.out.println("Quantidade de ALunos Aprovados " +alunoAcimaMedia);
       System.out.println("Media de todas as notas dos alunos "+mediaTotal);

    }
}
