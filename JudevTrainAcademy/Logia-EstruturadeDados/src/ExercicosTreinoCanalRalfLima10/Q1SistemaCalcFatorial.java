import java.util.Scanner;

public class Q1SistemaCalcFatorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         // Solicitar ao usuário para informar um número
        System.out.print("Informe um número inteiro para calcular o fatorial: ");
        int numero = Integer.parseInt(in.nextLine());

         // Variável para armazenar o resultado do fator
         int fatorial = 1;

         if (numero <0) {
            System.out.println("O fatorial não é definido para números negativos.");return;
         }

         for (int i = 1; i <= numero; i++) {
            fatorial *= i; 
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

    }
}
