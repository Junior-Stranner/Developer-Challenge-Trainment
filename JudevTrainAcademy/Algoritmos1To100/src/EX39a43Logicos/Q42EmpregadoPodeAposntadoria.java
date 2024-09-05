package EX39a43Logicos;

import java.util.Scanner;

public class Q42EmpregadoPodeAposntadoria {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String empregado[] = new String[2];
        int anoAtual = 2024;

        for(int x = 0; x < empregado.length; x++){
            System.out.println("Nome do(a) " + (x+1) + " empregado(a)");
            empregado[x] = in.nextLine();

            System.out.println("Ano de nascimento do(a) " + (x+1) + " empregado(a)");
            int nascimento = Integer.parseInt(in.nextLine());

            System.out.println("Ano de ingresso na empresa ");
            int ingresso = Integer.parseInt(in.nextLine());

            int idade = anoAtual - nascimento;
            int anosTrab = anoAtual - ingresso;

            if(idade >= 65 || (anosTrab >= 30 && idade >= 60) || anosTrab >= 25){
                System.out.println("Empregado(a) " + empregado[x] + " está qualificado(a) para aposentadoria");
            } else {
                System.out.println(empregado[x] + " não está qualificado(a) para aposentadoria");
            }

            System.out.println("Empregado " + empregado[x] + " com idade de " + idade +
                    " anos e " + anosTrab + " anos trabalhados(as)");
        }
    }
}
