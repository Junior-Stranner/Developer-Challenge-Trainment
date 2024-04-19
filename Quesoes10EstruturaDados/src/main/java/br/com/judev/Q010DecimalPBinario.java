package br.com.judev;

public class Q010DecimalPBinario {
    public static void main(String[]args){
        
         int decimal = 19;
         String binario = decimalParaBinario(decimal);
        System.out.println("O número binário equivalente a " + decimal + " é: " + binario);
            
    }

    public static String decimalParaBinario(int decimal) {
        if (decimal == 0) {
            return "0"; 
        }

        StringBuilder binario = new StringBuilder();

        while (decimal > 0) {
            int resto = decimal % 2;
            binario.insert(0, resto); 
            decimal /= 2; 
        }

        return binario.toString();
    }

}
