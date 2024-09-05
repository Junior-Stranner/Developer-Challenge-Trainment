package Ex27a38;

import java.util.Scanner;

public class Q36doisHduasM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] idadeH = new int[2];
        int[] idadeM = new int[2];
        int resultado = 0;
        int homemMaisVelho = 0;
        int mulherMaisNova = 0;

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite a idade do " + (i + 1) + "º homem:");
            idadeH[i] = Integer.parseInt(in.nextLine());

            System.out.println("Digite a idade da " + (i + 1) + "ª mulher:");
            idadeM[i] = Integer.parseInt(in.nextLine());
        }   

        if (idadeH[0] == idadeH[1]) {
            System.out.println("Homens não podem ter a mesma idade!");
        } else {
             homemMaisVelho = Math.max(idadeH[0], idadeH[1]);
            System.out.println("Idade do homem mais velho: " + homemMaisVelho);
        }

        if (idadeM[0] == idadeM[1]) {
            System.out.println("Mulheres não podem ter a mesma idade!");
        } else {
             mulherMaisNova = Math.min(idadeM[0], idadeM[1]);
            System.out.println("Idade da mulher mais nova: " + mulherMaisNova);
        }
        resultado = homemMaisVelho + mulherMaisNova;
        System.out.println("a soma do homem mais velho e da Mulher mais nova é de "+resultado);
    }
}
