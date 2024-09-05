package EX3a11;

import java.util.Scanner;

public class Q06BaseAltura {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
            System.out.println("Digite o tamanho da base ");
            double base = Double.parseDouble(in.nextLine());

            System.out.println("Digite o tamanho da altura ");
            double altura = Double.parseDouble(in.nextLine());

            double retangulo = (altura * base)/2 ;
   
      System.out.println("tamanho do Retángulo é de : "+retangulo+"cm");
    }
}
/* Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a
área do retângulo. */
