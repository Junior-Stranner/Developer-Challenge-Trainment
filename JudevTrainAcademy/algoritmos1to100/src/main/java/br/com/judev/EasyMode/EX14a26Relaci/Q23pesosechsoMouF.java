package br.com.judev.EasyMode.EX14a26Relaci;

import java.util.Scanner;

public class Q23pesosechsoMouF {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
      System.out.println("Calculadora de Peso Ideal");
        System.out.print("Informe sua altura em metros: ");
        double altura = Double.parseDouble(in.nextLine());

        System.out.print("Informe seu sexo (M para masculino, F para feminino): ");
        char sexo = in.next().charAt(0);

        double pesoIdeal = 0.0;
        if(sexo == 'm' || sexo == 'M'){
            pesoIdeal = (72.7 * altura) - 58;
        } else if(sexo == 'f' || sexo == 'F'){
            pesoIdeal = (62.1 * altura) - 44.7;
        }else{
            System.out.println("Sexo inválido !!");
        }

        System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");  
    
    }
}
