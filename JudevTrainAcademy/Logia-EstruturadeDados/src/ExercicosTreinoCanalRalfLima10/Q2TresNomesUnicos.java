package ExercicosTreinoCanalRalfLima10;

import java.util.Scanner;

public class Q2TresNomesUnicos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] dados = {
            {"1", ""},
            {"2", ""},
            {"3", ""}
        };
        
        for (int i = 0; i < dados.length; i++) {
            String novoNome;
            boolean nomeValido;

            do {
                nomeValido = true;
                System.out.println("Digite o " + dados[i][0] + "º nome:");
                novoNome = in.nextLine();

                // Verifica se o nome já existe
                for (int j = 0; j < i; j++) {
                    if (dados[j][1].equals(novoNome)) {
                        System.out.println("Nome já cadastrado. Por favor, escolha um novo nome.");
                        nomeValido = false;
                        break;
                    }
                }
                
              //  if (nomeValido) {
                    dados[i][1] = novoNome;
              //  }
                
            } while (!nomeValido);
        }

        // Exibe os dados
        for (int i = 0; i < dados.length; i++) {
            System.out.println("Código: " + dados[i][0] + ", Nome: " + dados[i][1]);
        }
    }
}
