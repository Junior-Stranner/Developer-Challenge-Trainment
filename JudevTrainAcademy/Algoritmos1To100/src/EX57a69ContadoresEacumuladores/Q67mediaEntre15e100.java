package EX57a69ContadoresEacumuladores;

import java.util.Scanner;

public class Q67mediaEntre15e100 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
       
       int soma = 0;
       int contador = 0;

       for (int i = 15; i <= 100; i++) {
        soma += i;
        contador++;
    }

    double media = (double) soma / contador;

    System.out.println("A média aritmética é: " + media);

    }
}
