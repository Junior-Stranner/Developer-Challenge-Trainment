import java.util.Scanner;

public class MatrizValores {
    public static void main(String[] args) {
        
        /*
         * Crie uma matriz 3x2 vazia.
         * 
         *Em um laço de repetição, peça três estados e três cidades.
          Armazene cada informação em uma posição de matriz.

          Exiba os valores contidos na matriz
         */

              
        Scanner  in = new Scanner(System.in);
        
        String[][] dados = new String[3][2];

        for(int indice = 0; indice < 3; indice++){
            System.out.println("Informe o " +(indice+1)+ "º estado.");
            dados[indice][0] = in.nextLine();

            System.out.println("Informe a " +(indice+1)+"ª cidade.");
            dados[indice][1] = in.nextLine();
        }


        for(int indice = 0; indice < 3; indice++){
            System.out.println(dados[indice][0] + " - " + dados[indice][1]);
        }

    }
}
