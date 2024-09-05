package EX57a69ContadoresEacumuladores;

import java.util.Scanner;


public class Q61Ler10ValoresEmediaAritmetica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double media =0;
        int valorTotal =0;
        for(int x =1; x <=10; x++){
            System.out.println("Digite o "+x+" valor ");
            int valor = Integer.parseInt(in.nextLine());
           
            valorTotal += valor;
        }
        media += valorTotal / 10;
        System.out.println("A média de "+valorTotal+ " é de "+media);
    }
}
