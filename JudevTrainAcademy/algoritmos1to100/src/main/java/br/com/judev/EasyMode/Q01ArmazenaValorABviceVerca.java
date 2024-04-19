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
