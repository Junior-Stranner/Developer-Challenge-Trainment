package EX12a13;

import java.util.Scanner;

public class Q013NotasAlunosPesoDif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        
        System.out.println("Digite a primeira nota do Aluno ");
        double nota1 = Double.parseDouble(in.nextLine());

        System.out.println("Digite a segunda nota do Aluno ");
        double nota2 = Double.parseDouble(in.nextLine());

        System.out.println("Digite a terceira nota do Aluno ");
        double nota3 = Double.parseDouble(in.nextLine());

        double media = (nota1 * 2 + nota2 * 3 + nota3 * 5 )/10;

        System.out.println("A média final do aluno é "+media);
    }

    /* Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
final é:
 n1 * 2 + n2 * 3 + n3 * 5
 mediafinal = -----------------------------------
 10 */
}
