package br.com.judev.EX57a69ContadoresEacumuladores;
import java.util.Scanner;

public class Q65ler2ValoresCalcularSomaInteiroslidos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        int valor1 = in.nextInt();
        
        System.out.print("Digite o segundo valor (maior que o primeiro): ");
        int valor2 = in.nextInt();
        
        int soma = 0;

        for (int i = valor1; i <= valor2; i++) {
            soma += i;
        }

        System.out.println("A soma dos inteiros entre " + valor1 + " e " + valor2 + " é: " + soma);
    }
}
