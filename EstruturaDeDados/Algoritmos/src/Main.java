import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[8];

        for(int i = 0; i <vetor.length;i++){
            vetor[i] = (int) Math.floor(Math.random() * 100000);
            System.out.println(vetor[i]);
        }
        System.out.println("Qual número vc busca?");
        Scanner in = new Scanner(System.in);
        int buscado = in.nextInt();

        boolean achou = false;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == buscado){
                System.out.println("Achou!");
                achou = true;
                break;
        }
    }
        if(achou){
            System.out.println("Achou");
    }else{
         System.out.println("Não Achou!");
    }
  }
}
