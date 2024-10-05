package Ex77a91Vetores;

import java.util.Scanner;

public class Q90Vet30NumsMais1numCalcRepetido {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);   

         int[] Vet = new int[5];
         int contador = 0;
         int novoNumero = 0;
 
         System.out.println("Digite os 15 números do vetor Vetor:");
         for (int i = 0; i < Vet.length; i++) {
             System.out.print("Vet[" + i + "] = ");
             Vet[i] = in.nextInt();
         }
         System.out.println("Digite um número adicional:");
         novoNumero = in.nextInt(); 

         for (int i = 0; i < Vet.length; i++) {
            if (Vet[i] == novoNumero) {
                contador++;
            }
        }
        System.out.println("A quantidade de vezes que o Número : "+ novoNumero+" apareçe nas mesmas posições no vetor é: " + contador);
    }
}
