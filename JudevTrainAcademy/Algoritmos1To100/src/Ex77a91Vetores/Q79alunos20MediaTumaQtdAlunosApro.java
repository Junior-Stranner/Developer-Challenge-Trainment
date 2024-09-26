package Ex77a91Vetores;

import java.util.Scanner;

public class Q79alunos20MediaTumaQtdAlunosApro {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int qtdAlunos = 3;
        
        String[] alunos = new String[qtdAlunos]; 
        double[] notas = new double[qtdAlunos]; 
        
        double soma = 0;
        int qtdAprovados = 0;

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite o nome do " + (i + 1) + "º aluno:");
            alunos[i] = in.nextLine();
            System.out.println("Digite a nota do " + (i + 1) + "º aluno:");
            notas[i] = Double.parseDouble(in.nextLine());

            soma += notas[i];
        }

        double media = soma / qtdAlunos;

        for (int i = 0; i < alunos.length; i++) {
            if (notas[i] >= 7) {
                qtdAprovados++;
            }
        }

        System.out.println("A média da turma é: " + media);
        System.out.println("Quantidade de alunos aprovados: " + qtdAprovados);

    }
}
