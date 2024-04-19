package br.com.judev;


public class Q08NumFalta {
    public static void main(String[] args) {
        int[] sequencia = {1, 2, 3, 4, 6, 7, 8, 9, 10}; 
        int n = 10; 

        int somaTotalEsperada = (n * (n + 1)) / 2; 
        int somaReal = 0;

        for (int num : sequencia) {
            somaReal += num;
        }

        int numeroFaltante = somaTotalEsperada - somaReal;

        System.out.println("O número que falta na sequência é: " + numeroFaltante);
    }
}
