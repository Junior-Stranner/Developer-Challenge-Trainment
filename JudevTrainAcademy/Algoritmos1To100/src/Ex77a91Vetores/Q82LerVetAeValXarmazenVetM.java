package Ex77a91Vetores;

import java.util.Scanner;

public class Q82LerVetAeValXarmazenVetM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] A = new int[5];
        int[] M = new int[5];
        int x = 0;

        for(int i = 0; i < A.length; i++){
            System.out.println("Digite o "+(i +1) +" Valor");
            A[i] = Integer.parseInt(in.nextLine());
        }
        System.out.println("Digite um valor adicional ");
        x  = Integer.parseInt(in.nextLine());

        for(int i = 0; i < A.length; i++){
        
            M[i] = A[i] * x;
            System.out.println(A[i] +" * " + x+ " = "+ M[i]);
        }
    }
}
