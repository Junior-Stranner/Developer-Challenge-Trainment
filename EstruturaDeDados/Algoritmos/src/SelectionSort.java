public class SelectionSort {
    public static void main(String[] args) {
          int[] vetor = new int[10];


          System.out.println("Vetor desordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("Vetor Ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        //Selection Sort
        int posicao_menor, aux;
        for (int i = 0; i < vetor.length; i++) {
           posicao_menor = i;
            for (int j = i+1; j < vetor.length; j++) {
             if(vetor[j] < vetor[posicao_menor]){
                posicao_menor = j;
             }
        }
        aux = vetor[posicao_menor];
        vetor[posicao_menor] = vetor[i];
        vetor[i] = aux;
      }
    }
}
