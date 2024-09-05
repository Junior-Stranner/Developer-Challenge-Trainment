package Ex50a56EstruturaRepeticaoPara;

import java.util.Scanner;

public class Q52Valor10maiorQue100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numcem = 0;;
        do{
        System.out.println("digite o Número 100");
        numcem = in.nextInt();
        
        }while(numcem != 100);
        for(int i = numcem+1; i <=numcem+10;i++){
          System.out.println("Number = "+i);
        }
    }
}
