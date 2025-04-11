import java.util.Scanner;

public class MenorNumEntre3 {
    public static void main(String[] args) {
        /* Grau 1
         * Peça três numeros inteiros, em seguida retorne o menor informado.
         */

         Scanner in = new Scanner(System.in);
     int num1,num2,num3;
     int menorNum;

       System.out.println("Digite o Primeiro Numero 1");
       num1 = Integer.parseInt(in.nextLine());
       
       System.out.println("Digite o Segundo Numero 1");
       num2 = Integer.parseInt(in.nextLine());
       
       System.out.println("Digite o Terceiro Numero 1");
       num3 = Integer.parseInt(in.nextLine());

       if(num1< num2 && num1< num3){
        menorNum = num1;
       }else if(num2 < num1 && num2 < num3){
        menorNum = num2;
       }else{
        menorNum = num3;
       }
       System.out.println("O menor número dos três é : "+menorNum);



          /* Grau 2
         * Peça três numeros inteiros, em seguida retorne o menor informado.
         */

        num1 = 5;
        num2 = 8;
        num3 = 6;
        float soma = (num1 + num2 + num3) / 3;
        menorNum = 100000;
        int menor = Math.min(num1, Math.min(num2, num3));
        System.out.println("O menor número é: " + menor);

            
        
    }
}
