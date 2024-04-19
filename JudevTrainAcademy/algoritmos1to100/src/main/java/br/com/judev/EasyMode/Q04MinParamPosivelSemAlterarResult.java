package br.com.judev.EasyMode;

public class Q04MinParamPosivelSemAlterarResult {
    
    public static void main(String[] args) {
        // Expressão A
        int a = 6 * (3 + 2);
        System.out.println("A: " + a);
        int a1 = (6 * (2 * 3)) - 6;
        System.out.println("Result A "+a1);

        // Expressão B
        int b = 2 + 6 * (3 + 2);
        System.out.println("B: " + b);
        int b1 = (6 * (2 * 3)) - 6;
        System.out.println("Result A "+b1);

        // Expressão C
        int c = 2 + 3 * 6 / (2 + 4);
        System.out.println("C: " + c);

        // Expressão D
        int d = 2 * (8 / (3 + 1));
        System.out.println("D: " + d);

        // Expressão E
        int e = 3 + (16 - 2) / (2 * (9 - 2));
        System.out.println("E: " + e); 

        // Expressão F
        int f = 6 / 3 + 8 / 2;
        System.out.println("F: " + f);

        // Expressão G
        int g = (3 + 8 / 2) * 4 + 3 * 2;
        System.out.println("G: " + g);

        // Expressão H
        int h = 6 * (3 * 3) + 6 - 10;
        System.out.println("H: " + h);

        // Expressão I
        int i = ((10 * 8) + 3) * 9;
        System.out.println("I: " + i);

        // Expressão J
        int j = (-12) * (-4) + 3 * (-4);
        System.out.println("J: " + j);
    }
}
/* ) Reescreva as instruções abaixo com o mínimo de parênteses possível, mas sem alterar o
resultado: */
