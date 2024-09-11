package ExercicosTreinoCanalRalfLima10;

import java.util.Scanner;

public class Q4FahrenheitCelciusViseVersa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double fahrenheit = 0.0,  celcius =0.0;

        System.out.println("Conversor "
        +"\n 1 - Celcius -> Fahrenheit"
        +"\n 2 - Fahrenheit -> Celcius");
        int op = Integer.parseInt(in.nextLine());

                if (op == 1) {
                    System.out.print("Digite a temperatura em Celsius: ");
                    celcius = Double.parseDouble(in.nextLine());
                    fahrenheit = (celcius * 1.8) + 32;
                    System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
                } else if (op == 2) {
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    fahrenheit = Double.parseDouble(in.nextLine());
                    celcius = (fahrenheit - 32) / 1.8;
                    System.out.println("Temperatura em Celsius: " + celcius);
                } else {
                    System.out.println("Opção inválida. Escolha 1 ou 2.");
             }
         }      
    }
