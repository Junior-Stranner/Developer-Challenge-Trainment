package Ex50a56EstruturaRepeticaoPara;

import java.util.Scanner;

public class Q56TabuadaDoValorLido1a10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite um valor aleátorio :");
        int valor = Integer.parseInt(in.nextLine()); 
        for(int x =1; x <11 ; x++){
            //    System.out.println( 8 * x);
            int resultado = valor * x;
            System.out.println(valor +" x "+x+" = "+resultado);
            }
    }
}
