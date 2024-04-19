package br.com.judev;

import java.util.Scanner;

public class Q03InvertString {
    public static void main (String[]args){

        try (Scanner in = new Scanner(System.in)) {
            String str = null;

            System.out.println("Digite uma String");
            str = in.nextLine();

            for(int x = str.length() - 1; x >= 0; x--){
              System.out.println("String invertida "+str.charAt(x));
            }
        }
    }
}
