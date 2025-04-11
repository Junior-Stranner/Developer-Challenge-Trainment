import java.util.Scanner;

public class CalcularMediaNotas {
    public static void main(String[] args) {

        /* Peça três notas, exiba a média e a situação.
         * 
         * Média 7 ou superior = Aprovao.
         * Média 5 e inferior a 7 = em Recuperação.
         * Média inferior a 5 = Reprovado
         * 
         * obs: Caso esteja em Recuperação, 
         * uma nova Prova será aplicada somando com as anteriores;
         */

         Scanner in = new Scanner(System.in);
         
         System.out.println("Digite a primeira nota");
         float nota1 = Float.parseFloat(in.nextLine());

         System.out.println("Digite a Segunda nota");
         float nota2 = Float.parseFloat(in.nextLine());

         System.out.println("Digite a Terceira nota");
         float nota3 = Float.parseFloat(in.nextLine());


         float soma = nota1 + nota2 + nota3;
         float media = soma /3;

         if(media >= 7){
            System.out.println("Aluno Apovado com a média : "+media);

         }else if(media >= 5 && media < 7){
            System.out.println("Aluno em Recuperação: "+media);

            System.out.println("Segunda Chamada para os alunos que ficaram de Recuperação ");

            System.out.println("Digite a nota de recuperação do aluno");
            float notaRecuperacao = Float.parseFloat(in.nextLine());

            float resultadoFinal = notaRecuperacao + (media/ 2);

            if(media > 6){
                System.out.println("Aluno Apovado com a média : "+resultadoFinal);

            }else{
                System.out.println("Aluno Reptovado com a média : "+resultadoFinal);
            }

         }else{
            System.out.println("Aluno Reprovado , irá ter que repetir de ano :( : "+media);

         }
         in.close();
    }

}
