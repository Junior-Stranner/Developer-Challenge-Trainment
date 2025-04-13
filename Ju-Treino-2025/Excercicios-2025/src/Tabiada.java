import java.util.Scanner;

public class Tabiada {
    public static void main(String[] args) {
        
        /*
         * Exiba um número, em seguida exiba a tabuada
         */

         Scanner in = new Scanner(System.in);

         System.out.println("Informe um valor ");
         int valor = Integer.parseInt(in.nextLine());

         int count = 1;
         while(count <=10){
          System.out.println("tabuada de "+valor+" X "+count+" = "+ (valor*count));
          count++;
         }
    }
}
