package Ex77a91Vetores;

import java.util.Scanner;

public class Q78nomes10Mais1AchaOuNaoAcha {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] nomes =new String[3]; 

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º nome:");
            nomes[i] = in.nextLine();
        }
        
            System.out.println("Digite mais um nome para verificar se já foi inserido:");
            String nomeRepetido = in.nextLine();

            boolean achei = false;
            for (String nome : nomes) {
                if (nome.equals(nomeRepetido)) {
                    achei = true;
                    break; 
            }
        }
            if (achei) {
                System.out.println("Achei");
            } else {
                System.out.println("Não Achei");
            }
    }
}
