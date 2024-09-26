package Ex77a91Vetores;

import java.util.Scanner;

public class Q80VetorQ20PosiPositivos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] Q = new int[10];
        int maiorValor = 0;
        int posicao = 0;
        for(int i = 0; i < Q.length; i++){
            System.out.println("Digite o "+ (i + 1)+" valor");
            Q[i] = Integer.parseInt(in.nextLine());

            if(i < 0){
                System.out.println("Valores não podem ser negativos");
            }else{
                if(Q[i] >= maiorValor){
                    maiorValor = Q[i];
                    posicao = i;
                }
            }
        }
   
        System.out.println("O maior valor positivo é: " + maiorValor
        +" na posção "+ posicao);
    }
}
