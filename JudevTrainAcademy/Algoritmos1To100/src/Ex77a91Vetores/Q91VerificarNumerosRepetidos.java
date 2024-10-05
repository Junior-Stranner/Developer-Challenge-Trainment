import java.util.Scanner;

public class Q91VerificarNumerosRepetidos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);   
        
        int[] VET = new int[5];

        System.out.println("Digite 50 números:");
        for (int i = 0; i < VET.length; i++) {
            System.out.print("VET[" + i + "] = ");
            VET[i] = in.nextInt();
        }

        boolean repetido = false;

        System.out.println("\nVerificando números repetidos...");
        for (int i = 0; i < VET.length -1; i++) {
            for (int j = i + 1; j < VET.length; j++) {
                if (VET[i] == VET[j]) {
                    repetido = true;
                    System.out.println("Número " + VET[i] + " repetido nas posições: " + i + " e " + j);
                }
            }
        }
        if (!repetido) {
            System.out.println("Não foram encontrados números repetidos.");
        }
    }
}
