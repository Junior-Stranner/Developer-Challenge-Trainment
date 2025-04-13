import java.util.Scanner;

public class VariosNumsAteZero {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

        /*
         * Peça diversos números, até que seja informado zero.
         * 
         * após informar o número zero, exiba a soma de todos os números 
         */

         int soma = 0;
         int num = 0;
         do{

            System.out.println("Informe um número");
            num = Integer.parseInt(in.nextLine());
            soma += num;

         }while(num != 0);

        System.out.println("A soma é " + soma);
    }
    
}
