package ExercicosTreinoCanalRalfLima10;

import java.util.Scanner;

public class Q6VetOrdemCrescente {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vet = new int[5];
        
        for(int x =0; x < vet.length; x++){
            System.out.println("Digite um número");
            vet[x] = Integer.parseInt(in.nextLine());

            for (int i = 0; i < vet.length - 1; i++) {
                for (int j = i + 1; j < vet.length; j++) {
                    if (vet[i] > vet[j]) {

                        int aux = vet[i];
                        vet[i] = vet[j];
                        vet[j] = aux;
                    }
                } 
            }
        }           
        System.out.println("Números em ordem crescente:");
        for (int num : vet) {
            System.out.print(num);
        }
    }
}
