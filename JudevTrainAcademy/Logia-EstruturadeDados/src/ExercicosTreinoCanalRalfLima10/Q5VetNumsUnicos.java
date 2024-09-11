package ExercicosTreinoCanalRalfLima10;

import java.util.Scanner;

public class Q5VetNumsUnicos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vet = new int[5];
        int novoNum;

        for (int i = 0; i < vet.length; i++) {

            do {
                boolean numValido = true;
                System.out.print("Digite o " + (i + 1) + "º número: ");
                novoNum = Integer.parseInt(in.nextLine());
                
                for (int j = 0; j < i; j++) {
                    if (vet[j] == novoNum) {
                        System.out.println("Número já cadastrado. Por favor, escolha um novo número.");
                        numValido = false;
                        break; 
                    }
                }
               
                    vet[i] = novoNum;

            } while (!numValido);
        }

        // Exibe a sequência de números inseridos
        System.out.println("Sequência de números inseridos:");
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }
}
