import java.util.Scanner;

public class DoisNumIgauisSomaDiferenteMulti {
    public static void main(String[] args) {
        /*
         * Peça dois numeros inteiros.
         * se forem iguis, faça a soma, caso contrário faça a multiplicação
         */
         Scanner in = new Scanner(System.in);

         System.out.print("Informe o primeiro valor: ");
         int num1 = in.nextInt();
 
         System.out.print("Informe o segundo valor: ");
         int num2 = in.nextInt();
 
         int resultado;
         String operacao;
 
         if (num1 == num2) {
             resultado = num1 + num2;
             operacao = "soma";
         } else {
             resultado = num1 * num2;
             operacao = "multiplicação";
         }
 
         System.out.println("Resultado da " + operacao + " é: " + resultado);
     }
 }
