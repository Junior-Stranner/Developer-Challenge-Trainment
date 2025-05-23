public class HeapSort {
    public static void main(String[] args) {
         int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.floor(Math.random()) * vetor.length);
        }

           System.out.println("\n \n Desordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        //Heap Sort
        int n = vetor.length;

        for(int i = n / 2 - 1;i >= 0; i--){
            aplicarHep(vetor,n,i);
        }

          System.out.println("\n \n Quase ordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

         for(int j = n-1; j > 0; j--){
            int aux = vetor[0];
            vetor[0] = vetor[j];
            vetor[j] = aux;
        }
    
        
        System.out.println("\n \n Ordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    private static void aplicarHep(int[] vetor, int n, int i) {
       int raiz = i;
       int esquerda = 2*i + i;
       int direita = 2*i +2;

       if(esquerda < n && vetor[esquerda] > vetor[raiz]){
        raiz = esquerda;
       }
      if(direita < n && vetor[direita] > vetor[raiz]){
        raiz = direita;
       }

       if(raiz != i){
        int aux = vetor[i];
        vetor[i] = vetor[raiz];
        vetor[raiz] = aux;

        aplicarHep(vetor, n, raiz);
       }
    }
}
