package br.com.judev.EasyMode.EX12a13;

import java.util.Scanner;

public class Q012FarenheitToCelcius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        double celsius = (fahrenheit - 32) / 1.8;
        
        System.out.println("A temperatura em Celsius é: " + celsius + "°C");
        
        scanner.close();
    }
}
/*   ) Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
correspondente em graus Celsius (baseado na fórmula abaixo):  */