package EX3a11;

import java.util.Scanner;

public class Q010CustoFabricaCarroImpos {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.println("Qual o custo de Fábrica do Carro");
        double custoFabrica = Double.parseDouble(in.nextLine());

        double percentualDistribuidor = 1.28;
        double percentualImpostos  = 1.45;

        System.out.println("Custo do Carro é de "+custoFabrica);
        double custoDstribuidor = custoFabrica * percentualDistribuidor;
        double custoTotal = custoDstribuidor * percentualImpostos;

        /*                       OU  
         *  double custoToal = custoFabrica * percentualDistribuidor *percentualImpostos;
         */
        System.out.println("Custo total do Veúculo é de "+custoTotal);
    }
}

/* O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
calcular e escrever o custo final ao consumidor. */
