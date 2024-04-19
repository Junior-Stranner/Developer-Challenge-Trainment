package br.com.judev.EasyMode;

import java.util.Scanner;

public class Q08Eleitores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
            System.out.println("Número de eleitores ");
               double eleitores = Double.parseDouble(in.nextLine());
   
               int op = 0;
               int votosBrancos = 0;
               int votosNulos = 0;
               int votosValidos =0;
   
               for(int x = 1 ; x <= eleitores ;x++){
   
                   System.out.println("escolha os votos"
                   +"\n 1 - votos Brancos"
                   +"\n 2 - nulos "
                   +"\n 3 - válidos");
                   op = Integer.parseInt(in.nextLine());

   
            if(op ==1 ){
                votosBrancos ++;
      }else if(op == 2){
                    votosNulos ++;
      }else {
             votosValidos ++;
      }
   }  
   
   if(eleitores >= 10){
            
   }
   
   double percentual_brancos = (votosBrancos / eleitores) * 100;
   double percentual_nulos = (votosNulos / eleitores) * 100;
   double percentual_validos = (votosValidos / eleitores) * 100;
   
     System.out.println("Número total de eleitores são : "+eleitores
     +"\n ========================================");
   
      System.out.println("quantidade de Votos Brancos : "+votosBrancos
      +"\n Quantidade de votos nulos : "+votosNulos
      +"\n Quantidade de votos válidos  : "+votosValidos
      +"\n=========================================");
   
      System.out.println("Percentual Votos Branco : "+percentual_brancos+"%"
      +"\n Percentual votos nulos : "+percentual_nulos+"%"
      +"\n Percentual votos Válidos : "+percentual_validos+"%");
     }
}
                  //Com Vetor 

    /*System.out.println("Número de eleitores: ");
    int numEleitores = Integer.parseInt(in.nextLine());

    // Array para armazenar os votos: índice 0 = brancos, 1 = nulos, 2 = válidos
    int[] votos = new int[3];

     for (int i = 0; i < numEleitores; i++) {
         System.out.println("Escolha os votos:"
                       + "\n1 - Votos Brancos"
                       + "\n2 - Nulos"
                       + "\n3 - Válidos");
        int op = Integer.parseInt(in.nextLine());
    
         // Incrementa o contador correspondente ao tipo de voto selecionado
        if (op == 1) {
          votos[0]++;
        } else if (op == 2) {
          votos[1]++;
       } else if (op == 3) {
          votos[2]++;
       } else {
          System.out.println("Opção inválida. Voto não registrado.");
      }
   }

    double totalVotos = votos[0] + votos[1] + votos[2];

     // Calcula os percentuais de votos
   double percentualBrancos = (votos[0] / totalVotos) * 100;
   double percentualNulos = (votos[1] / totalVotos) * 100;
   double percentualValidos = (votos[2] / totalVotos) * 100;

   // Imprime os resultados
  System.out.println("Número total de eleitores: " + numEleitores);
  System.out.println("Quantidade de Votos Brancos: " + votos[0]);
  System.out.println("Quantidade de Votos Nulos: " + votos[1]);
  System.out.println("Quantidade de Votos Válidos: " + votos[2]);
  System.out.println("Percentual Votos Brancos: " + percentualBrancos + "%");
  System.out.println("Percentual Votos Nulos: " + percentualNulos + "%");
  System.out.println("Percentual Votos Válidos: " + percentualValidos + "%");

   }
}
    ) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
    brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
    de eleitores.  

*/