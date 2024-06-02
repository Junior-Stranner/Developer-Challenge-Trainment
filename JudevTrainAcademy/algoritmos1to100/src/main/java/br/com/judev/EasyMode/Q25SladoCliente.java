package br.com.judev.EasyMode;

import java.util.Scanner;

public class Q25SladoCliente {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

       System.out.println("Numero da conta do cliente ");
       int numConta = Integer.parseInt(in.nextLine());

       System.out.println("Saldo da conta do cliente ");
       double saldo = Double.parseDouble(in.nextLine());

       System.out.println("debito da conta do cliente ");
       double debito = Double.parseDouble(in.nextLine());

       System.out.println("credito da conta do cliente ");
       double credito = Double.parseDouble(in.nextLine());

       double saldoAtual = saldo - (debito + credito);

       if(saldoAtual < 0 ){
        System.out.println("Saldo Atual Negativo !! "+saldoAtual);
       }else{
       System.out.println("Saldo Atual Positivo !! "+saldoAtual);
       }
    }
}
