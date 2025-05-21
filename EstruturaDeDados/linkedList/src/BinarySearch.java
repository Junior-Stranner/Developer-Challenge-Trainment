import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] vetor = new int[8];

        for(int i = 0; i< vetor.length;i++){
            vetor[i] = i * 2;
            System.out.println(vetor[i]);
        }

        System.out.println("Qual numero vc busca?");
        Scanner in = new Scanner(System.in);
        int buscado = in.nextInt();

        boolean achou = false;
        int inicio =0;
        int fim = vetor.length - 1;
        int meio;
        while (inicio <= fim) {
          meio = (int)((inicio + fim)/2);
            if(vetor[meio] == buscado){
            achou = true;
            break;
            }else if(vetor[meio] < buscado){
               inicio = meio + 1;
            }else{//só pode ser maior
               fim = meio - 1;
            }
        }
        if(achou == true){
           System.out.println("Achoou");
        }else{
         System.out.println("Não achou!");
        }
    }
}
