package ExercicosTreinoCanalRalfLima10;

import java.util.Scanner;

public class Q8Matriz10Nomes10idades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[][] pessoas = new String[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome da " + (i + 1) + "ª pessoa:");
            pessoas[i][0] = in.nextLine();

            System.out.println("Digite a idade da " + (i + 1) + "ª pessoa:");
            pessoas[i][1] = in.nextLine(); 

            System.out.println("Deseja cadastrar outra pessoa? (S/N)");
            String resposta = in.nextLine();

            if (resposta.equalsIgnoreCase("N")) {
                break; 
            }
        }

        System.out.println("\nLista de pessoas cadastradas:");
        for (int i = 0; i < 10; i++) {
            if (pessoas[i][0] != null) { 
                System.out.println("Nome: " + pessoas[i][0] + ", Idade: " + pessoas[i][1]);
            }
        }
    }
}
