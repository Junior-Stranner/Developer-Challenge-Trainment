package br.com.judev;

import java.util.Scanner;

public class Q06Palindromo {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String[] palavras = new String[10];

            for (int x = 0; x < 10; x++) {
                System.out.println("Digite uma palavra aleatória:");
                palavras[x] = in.nextLine();

                String str = palavras[x]; 
                int inicio = 0;
                int fim = str.length() - 1;
                boolean palindromo = true; 

                while (fim > inicio) {
                    if (str.charAt(inicio) != str.charAt(fim)) {
                        palindromo = false; 
                        break; 
                    }
                    inicio++;
                    fim--;
                }

                if (palindromo) {
                    System.out.println("A palavra \"" + palavras[x] + "\" é um palíndromo.");
                } else {
                    System.out.println("A palavra \"" + palavras[x] + "\" não é um palíndromo.");
                }
            }
        }
    }
}

   /*     Scanner in = new Scanner(System.in);

        String[] palavras = new String[10];

        for (int x = 0; x < 10; x++) {
            System.out.println("Digite uma palavra aleatória:");
            palavras[x] = in.nextLine();

            if (isPalindromo(palavras[x])) {
                System.out.println("A palavra \"" + palavras[x] + "\" é um palíndromo.");
            }
        }
        
    public static boolean isPalindromo(String str) {
        int inicio = 0;
        int fim = str.length() - 1;

        while (fim > inicio) {
            if (str.charAt(inicio) != str.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }
}
*/ 
