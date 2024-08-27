package br.com.judev.EX74a76RepeticaoAninhada;

import java.util.Scanner;

public class Q74Tabuada1a10ParaNum1a10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for(int x = 1; x <=10; x++){
            System.out.println("Tabuada de "+x+" ");
            for(int i =1; i <=10;i++){
                System.out.println(x +" x "+i+ " = "+(x*i));
            }
        }
    }
}
