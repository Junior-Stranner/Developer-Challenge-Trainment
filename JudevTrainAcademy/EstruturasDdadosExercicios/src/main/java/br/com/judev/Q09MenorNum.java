package br.com.judev;

public class Q09MenorNum {
    public static void main(String[]args){

        int[] lista = {10, 5, 8, 3, 12, 7, 2 ,1 ,4 ,9};
        int menor = lista[0]; 

        for (int i = 1; i < lista.length; i++) {
            if (lista[i] < menor) {
                menor = lista[i]; 
            }
        }

        System.out.println("O menor número na lista é: " + menor);
    
    }
}
