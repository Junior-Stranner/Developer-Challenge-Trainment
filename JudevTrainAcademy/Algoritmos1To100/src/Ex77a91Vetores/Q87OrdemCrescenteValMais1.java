package Ex77a91Vetores;

import java.util.Arrays;
import java.util.Scanner;

import javax.xml.transform.stream.StreamSource;

public class Q87OrdemCrescenteValMais1 {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);   


        int[] numeros = new int[5];
        int aux = 0;
        for (int i = 0; i < numeros.length; i++) {
           System.out.println("Digite o "+(i + 1)+" Número");
           numeros[i] = Integer.parseInt(in.nextLine());
        }
        for(int j = 0; j< numeros.length; j++){
          for (int i = 0; i < numeros.length -1; i++) {
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

     System.out.println( "\n Digite mais um valor ");
     int novoNumero = Integer.parseInt(in.nextLine());

     int[] novoVetor = new int[6];
     boolean inserido = false;
     int j = 0;

     for (int i = 0; i <5; i++) {
        if (!inserido && novoNumero <= numeros[i]) {
            novoVetor[j++] = novoNumero;
            inserido = true;
        }
        novoVetor[j++] = numeros[i];
    }
     System.out.println("Números em ordem crescente com o número adicional :" + Arrays.toString(novoVetor));
   /*  for (int vet : novoVetor) {
         System.out.print(vet + " ");
     }*/ 
    }
}
