public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = new int[100];

        for(int i =0; i<vetor.length;i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }

        Long inicio = System.currentTimeMillis();
        //bubble SORT (ON^2)
   //     int aux;
       for (int i = 0; i < vetor.length; i++) {
         for (int j = i + 1; j < vetor.length; j++) {
           if (vetor[i] > vetor[j]) {
             int aux = vetor[i];
             vetor[i] = vetor[j];
             vetor[j] = aux;
        }
    }
}
     long fim = System.currentTimeMillis();
     System.out.println("Tempo: "+(fim - inicio));
      System.out.println("\nVetor ordenado:");
        for (int i : vetor) {
            System.out.print(i + " ");
        }
   }
}
