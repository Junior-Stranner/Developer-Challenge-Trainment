package EX57a69ContadoresEacumuladores;

import java.util.Scanner;

public class Q63Ler10numsCalculaAsome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

                int soma = 0;
                int numero;
        
                for (int i = 1; i <= 10; i++) {
                    System.out.print("Digite o número " + i + ": ");
                    numero = Integer.parseInt(in.nextLine());
                    soma += numero;
                }
                System.out.println("A soma total dos números é: " + soma);
        }
        
}
