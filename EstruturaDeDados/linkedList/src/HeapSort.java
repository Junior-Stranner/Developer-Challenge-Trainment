public class HeapSort {
    public static void main(String[] args) {
         int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.floor(Math.random()) * vetor.length);
        }

        //Heap Sort
        int n = vetor.length;

        for(int i = n / 2 - 1;i >= 0; i--){
            aplicarHep();
        }
           System.out.println("Vetor desordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

    }

    private static void aplicarHep() {
       
    }
}
