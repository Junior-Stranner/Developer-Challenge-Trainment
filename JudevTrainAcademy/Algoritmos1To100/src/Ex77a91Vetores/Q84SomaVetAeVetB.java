package Ex77a91Vetores;
import java.util.Scanner;

public class Q84SomaVetAeVetB {
    public static void main(String[] args) {

       Scanner in = new Scanner(System.in);   
        System.out.println("Digite um número ");
        int N = Integer.parseInt(in.nextLine());
        int[] A = new int[N];
        int[] B = new int[N];
        int[] Soma = new int[N];

        for(int i = 0; i < N ; i++){
            System.out.print("A[" + i + "]: ");
            A[i] = Integer.parseInt(in.nextLine());
        }

        for(int i = 0; i < N ; i++){
            System.out.print("B[" + i + "]: ");
            B[i] = Integer.parseInt(in.nextLine());
        }

        for(int i = 0; i < N ; i++){
            Soma[i] += A[i] + B[i];
        }

         // Exibe o vetor Soma
         System.out.println("Vetor Soma:");
         for (int i = 0; i < N; i++) {
          //   System.out.println("A " +A[i] + " + B "+ B[i]  +" = " + Soma[i]);
             System.out.println("Soma[" + i + "] = " + Soma[i]);
         }
    }
}
