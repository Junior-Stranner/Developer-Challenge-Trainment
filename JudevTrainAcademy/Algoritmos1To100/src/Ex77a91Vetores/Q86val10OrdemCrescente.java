package Ex77a91Vetores;
import java.util.Scanner;


public class Q86val10OrdemCrescente {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);   


        int[] numeros = new int[10];
        int num = 0;
        int aux = 0;
        for (int i = 0; i < numeros.length; i++) {
           System.out.println("Digite o "+(i + 1)+" Número");
           numeros[i] = Integer.parseInt(in.nextLine());
        }
        for(int j = 0; j< numeros.length - 1; j++){
          for (int i = j + 1; i < numeros.length ; i++) {
            if(numeros[j] < numeros[i]){
                aux = numeros[j];
                numeros[j] = numeros[i];
                numeros[i] = aux;
            }
         }
       }
       System.out.println("Números em ordem crescente:");
       for (int numero : numeros) {
           System.out.print(numero + " ");
       }
    }
}
