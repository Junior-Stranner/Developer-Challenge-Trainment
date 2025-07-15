public class MergeSort {
    public static void main(String[] args) {
        // Função principal para chamar o mergeSort
            int[] array = {38, 27, 43, 3, 9, 82, 10};

            System.out.println("Array original:");
            printArray(array);

            mergeSort(array, 0, array.length - 1);

            System.out.println("\nArray ordenado com Merge Sort:");
            printArray(array);
        }

        // Função recursiva do Merge Sort
        public static void mergeSort(int[] array, int left, int right) {
            if (left < right) {
                int middle = (left + right) / 2;

                // Ordena as duas metades
                mergeSort(array, left, middle);
                mergeSort(array, middle + 1, right);

                // Combina as duas metades ordenadas
                merge(array, left, middle, right);
            }
        }

        // Função que junta duas metades ordenadas
        public static void merge(int[] array, int left, int middle, int right) {
            // Tamanhos dos subarrays
            int n1 = middle - left + 1;
            int n2 = right - middle;

            // Criação de arrays temporários
            int[] L = new int[n1];
            int[] R = new int[n2];

            // Copia dados para arrays temporários
            for (int i = 0; i < n1; ++i)
                L[i] = array[left + i];
            for (int j = 0; j < n2; ++j)
                R[j] = array[middle + 1 + j];

            // Índices iniciais dos subarrays
            int i = 0, j = 0;
            int k = left;

            // Combina os arrays temporários de volta ao original
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    array[k] = L[i];
                    i++;
                } else {
                    array[k] = R[j];
                    j++;
                }
                k++;
            }

            // Copia os elementos restantes de L[], se houver
            while (i < n1) {
                array[k] = L[i];
                i++;
                k++;
            }

            // Copia os elementos restantes de R[], se houver
            while (j < n2) {
                array[k] = R[j];
                j++;
                k++;
            }
        }

        // Função utilitária para imprimir o array
        public static void printArray(int[] array){
            for (int value : array)
                System.out.print(value + " ");
            System.out.println();
    }
}
