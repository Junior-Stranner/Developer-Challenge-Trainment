package br.com.judev.EasyMode;

import java.util.Scanner;


public class Q021HoraInicioJogoZadrez {
    
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o horário que o jogo de xadrez se inicia ");
        int inicio = Integer.parseInt(in.nextLine());

        System.out.println("Digite o horário que o jogo de xadrez se inicia ");
        int fim = Integer.parseInt(in.nextLine());

       int duraçãoJogo = fim - inicio;

       System.out.println("A duração da Partida foi de "+duraçãoJogo);

      }
}
/*
21) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.  */
