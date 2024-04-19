package br.com.judev.EasyMode;

public class Q01ArmazenaValorABviceVerca {
    public static void main(String[]args){

    int vA = 10;
    int vB = 20;
    int aux =0;

    aux = vA;
    vA = vB;
    vB = aux;
   
    System.out.println(vA);
    System.out.println(vB);

    }

}


/*Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B.
A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o
valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados
nas variáveis.  */