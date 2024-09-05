package Ex27a38;

import java.util.Scanner;

public class Q27valorPosOuNegativo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor[] = new int[5];

     for(int x = 0; x < valor.length; x++){
       System.out.println("Digite um valor");
       valor[x] = Integer.parseInt(in.nextLine());

        }

        int aux;
        for(int x = 0; x < valor.length -1; x++){
            for(int i = x +1; i < valor.length ; i++){
            if(valor[x] > valor[i]){
                aux = valor[x];
                valor[x] = valor[i];
                valor[i] = aux;
            }
          }
        }

        System.out.println("A ordem correta dos elementos é: ");
        for (int v : valor) {
            System.out.println(v + " ");

            if(v>0){
            System.out.println("Valores Positivos "+v);
        }else{
            System.out.println("Valores Negativos "+v);

            }
        }
    }
}
