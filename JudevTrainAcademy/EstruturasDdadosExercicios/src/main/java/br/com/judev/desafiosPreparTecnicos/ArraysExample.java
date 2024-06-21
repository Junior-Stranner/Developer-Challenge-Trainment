package br.com.judev.desafiosPreparTecnicos;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // Criação de um array
        int[] arr = {1, 2, 3, 4, 5};

        // Acesso a elementos
        System.out.println(arr[0]);  // Output: 1

        // Modificação de elementos
        arr[1] = 10;
        System.out.println(Arrays.toString(arr));  // Output: [1, 10, 3, 4, 5]
    }
}
