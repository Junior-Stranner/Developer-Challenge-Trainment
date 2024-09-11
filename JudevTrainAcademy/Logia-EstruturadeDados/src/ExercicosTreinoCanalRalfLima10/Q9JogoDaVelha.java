package ExercicosTreinoCanalRalfLima10;

import java.util.Scanner;

public class Q9JogoDaVelha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[][] jogo = {
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
        };

        String jogadorAtual = "X";
        boolean jogoFinalizado = false;
        int jogadas = 0; 
        int linha, coluna;

        while (!jogoFinalizado && jogadas < 9) {
            imprimirJogo(jogo);
            System.out.println("Jogador " + jogadorAtual + ", escolha uma linha (1-3) e uma coluna (1-3):");

           
            do {
                System.out.print("Linha: ");
                linha = in.nextInt() - 1;
                System.out.print("Coluna: ");
                coluna = in.nextInt() - 1;
            } while (!validarJogada(jogo, linha, coluna));

            jogo[linha][coluna] = jogadorAtual; 
            jogadas++; 

            if (verificarVencedor(jogo, jogadorAtual)) {
                imprimirJogo(jogo);
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                jogoFinalizado = true;
            } else if (jogadas == 9) {
                imprimirJogo(jogo);
                System.out.println("O jogo terminou em empate!");
                jogoFinalizado = true;
            } else {
                jogadorAtual = jogadorAtual.equals("X") ? "O" : "X"; 
            }
        }
    }

    public static int validarEntradaNumerica(Scanner in) {
        int numero = -1;
        boolean entradaValida = false;
    
        while (!entradaValida) {
            if (in.hasNextInt()) {
                numero = in.nextInt();
                if (numero >= 1 && numero <= 3) {
                    entradaValida = true;
                } else {
                    System.out.println("Número fora do intervalo permitido! Digite um número entre 1 e 3.");
                }
            } else {
                System.out.println("Entrada inválida! Digite um número entre 1 e 3.");
                in.next(); 
            }
        }
        return numero;
    }

    public static void imprimirJogo(String[][] jogo) {
        System.out.println("  1   2   3 ");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + " " + jogo[i][0] + " | " + jogo[i][1] + " | " + jogo[i][2]);
            if (i < 2) {
                System.out.println(" ---+---+---");
            }
        }
    }

    public static boolean validarJogada(String[][] jogo, int linha, int coluna) {
        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || !jogo[linha][coluna].equals(" ")) {
            System.out.println("Jogada inválida! Tente novamente.");
            return false;
        }
        return true;
    }

    public static boolean verificarVencedor(String[][] jogo, String jogador) {
        for (int i = 0; i < 3; i++) {
            if ((jogo[i][0].equals(jogador) && jogo[i][1].equals(jogador) && jogo[i][2].equals(jogador)) ||
                (jogo[0][i].equals(jogador) && jogo[1][i].equals(jogador) && jogo[2][i].equals(jogador))) {
                return true;
            }
        }
        // Verificar diagonais
        if ((jogo[0][0].equals(jogador) && jogo[1][1].equals(jogador) && jogo[2][2].equals(jogador)) ||
            (jogo[0][2].equals(jogador) && jogo[1][1].equals(jogador) && jogo[2][0].equals(jogador))) {
            return true;
        }

        return false;
    }
}
