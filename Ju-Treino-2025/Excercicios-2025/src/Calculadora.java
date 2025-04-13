import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        

        Scanner in = new Scanner(System.in);

        System.out.println("Informe o primeiro valor ");
        int val1 = Integer.parseInt(in.nextLine()); 

        System.out.println("Informe o segundo valor ");
        int val2= Integer.parseInt(in.nextLine()); 

        System.out.println("Selecione o calculo \n"
        +"1 - Somar \n"
        +"2 - Subtrair \n"
        +"3 - Multiplicar \n"
        +"4 - Dividir");
        int calculo = Integer.parseInt(in.nextLine());

        double retorno = switch(calculo){
            case 1 -> val1+val2;
            case 2 -> val1-val2;
            case 3 -> val1*val2;
            case 4 -> val1/val2;
            default -> 0;
        };
        System.out.println(retorno);
    
       }
}
