package br.com.judev.EX14a26Relacionais;

import java.util.Scanner;

public class Q019DoisValoresMaior {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite  valor A");
        int valorA = Integer.parseInt(in.nextLine());
        System.out.println("Digite  Valor  B");
        int valorB = Integer.parseInt(in.nextLine());
        if(valorA > valorB){
            System.out.println("valorA "+valorA+" é maior que valorB "+valorB);
        }else if(valorB > valorA){
            System.out.println("valorB "+valorB+" é maior que valorA "+valorA);
        }else{
            System.out.println("Erro !! valores não podem ser iguais!");
        }
    }
}

/*19) Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. 
 */
