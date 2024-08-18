package br.com.judev.EX57a69ContadoresEacumuladores;
import java.util.Scanner;

public class Q66MesmoQue65 {

    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
        
    System.out.print("Digite o primeiro valor: ");
    int valor1 = in.nextInt();
    
    System.out.print("Digite o segundo valor : ");
    int valor2 = in.nextInt();
    
    int soma = 0;
    int menor = Math.min(valor1, valor2);
    int maior = Math.max(valor1, valor2);

    for (int i = menor; i <= maior; i++) {
        soma += i;
    }
    System.out.println("A soma dos inteiros entre " + valor1 + " e " + valor2 + " é: " + soma);
   }
}
