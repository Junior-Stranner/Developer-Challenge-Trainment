package Ex77a91Vetores;

import java.util.Scanner;

public class Q83num20OrdemInversa {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetN = new int[20];
        for(int i = 0; i < vetN.length; i++){
          System.out.println("Digite um número");
          vetN[i] = Integer.parseInt(in.nextLine());
        }
        for(int i = vetN.length -1; i >= 0; i--){
         System.out.println(vetN[i]);
      }
    }
}
