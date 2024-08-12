package br.com.judev.Ex27a38;

import java.util.Scanner;

public class Q31valoresTriangulos {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       System.out.println("Digite o valor do lado A:");
        double ladoA = in.nextDouble();

        System.out.println("Digite o valor do lado B:");
        double ladoB = in.nextDouble();

        System.out.println("Digite o valor do lado C:");
        double ladoC = in.nextDouble();

        boolean formaTriangulo = (ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB);

         if (formaTriangulo) {
            System.out.println("Os valores fornecidos formam um triângulo.");
        } else {
            System.out.println("Os valores fornecidos NÃO formam um triângulo.");
        }
    }
}
