public class InsertionSort {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        
        System.out.println("Vetor desordenado:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.print(vetor[i] + " ");
        }

        // Algoritmo de Insertion Sort
        int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;

            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j]; // Desloca para frente
                j--;
            }
            vetor[j + 1] = aux; // Insere na posição correta
        }

        System.out.println("\nVetor ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
