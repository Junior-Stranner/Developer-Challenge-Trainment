package br.com.judev.EasyMode.EX14a26Relaci;

import java.util.Scanner;

public class Q25SladoCliente {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int numConta[] = new int[2];
        double saldoAtual[] = new double[numConta.length];

        for(int x = 0; x < numConta.length; x++){
       System.out.println("Numero da conta do cliente ");
       numConta[x] = Integer.parseInt(in.nextLine());

       System.out.println("Saldo da conta do cliente ");
       double saldo = Double.parseDouble(in.nextLine());

       System.out.println("debito da conta do cliente ");
       double debito = Double.parseDouble(in.nextLine());

       System.out.println("credito da conta do cliente ");
       double credito = Double.parseDouble(in.nextLine());

      saldoAtual[x] = saldo - (debito + credito);

       if(saldoAtual[x] < 0 ){
        System.out.println("Saldo Atual Negativo !! "+saldoAtual[x]);
       }else{
       System.out.println("Saldo Atual Positivo !! "+saldoAtual[x]);
       }
     }
     for(int x = 0; x < numConta.length; x++){
        System.out.println("Conta número "+numConta[x]+ " com Saldo Atual de : "+saldoAtual[x]);
     }
    }
}
