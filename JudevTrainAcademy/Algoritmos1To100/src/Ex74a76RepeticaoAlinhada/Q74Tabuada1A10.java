package Ex74a76RepeticaoAlinhada;

import java.util.Scanner;

public class Q74Tabuada1A10 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

            for (int i = 1; i <= 10; i++) {
                System.out.println("Tabuada do " + i + ":");
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i+" x "+j+" = "+ i * j);
                }
                System.out.println(); 
            }
    }
}
