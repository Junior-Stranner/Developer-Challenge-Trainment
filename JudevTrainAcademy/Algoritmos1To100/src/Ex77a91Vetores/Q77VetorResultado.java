package Ex77a91Vetores;


public class Q77VetorResultado {
    public static void main(String[] args) {
        
        int[] v = {0, 5, 1, 4, 2, 7, 8, 3, 6}; // vetor V com índice de 1 a 8

        // Laço para trocar valores do vetor
        for (int i = 8; i >= 5; i--) {
            int aux = v[i];
            v[i] = v[8 - i + 1];
            v[8 - i + 1] = aux;
        }

        // Trocas específicas
        v[3] = v[1];
        v[v[3]] = v[v[2]];

        // Exibir o vetor resultante
        for (int i = 1; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
