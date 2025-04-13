public class SomaValoresMatriz {
    public static void main(String[] args) {
        
/*
    Crie uma matriz 3x3.

    Essa matriz terá os seguintes números:
    4 6 8
    9 1 3
    2 7 5

    Exiba a matriz.
    Exiba a soma de todos os valores contidos na matriz.
*/
        
    // Matriz
    int[][] numeros = {
        {4, 6, 8},
        {9, 1, 3},
        {2, 7, 5}
    };

    int soma = 0;

    for(int linha = 0; linha < 3; linha++){

        for(int coluna = 0; coluna < 3; coluna++){

            System.out.print(numeros[linha][coluna] + " ");

            soma += numeros[linha][coluna];

        }
        System.out.println();
    }
    System.out.println("A soma é: " + soma);

    }
}
