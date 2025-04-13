import java.util.Scanner;

public class Vetor3Nomes {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

        /*
         * Crie um vetor contendo três posições vazias.
         * 
         * em seguida crie um laço de repetição para pedir três nomes e armazenar no vetor.
         * 
         * Após executar o laço, exiba os nomes contidos no vetor.
         */
         
         String[] nomes = new String[3];

         for(int x = 0; x < nomes.length; x++){

            System.out.println("Informe o "+(x +1)+" nome");
            nomes[x] = in.nextLine();
         }
          for (int i = 0; i < nomes.length; i++) {
            System.out.println("Posição " + (i+1) + " - Nome: " + nomes[i]);
        }
    }
}
