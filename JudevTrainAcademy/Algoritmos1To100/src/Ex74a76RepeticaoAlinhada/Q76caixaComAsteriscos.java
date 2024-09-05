package Ex74a76RepeticaoAlinhada;

public class Q76caixaComAsteriscos {
    public static void main(String[] args) {

        int colunas = 60; // Número de colunas
        int linhas = 10;  // Número de linhas

        // Desenhar o retângulo
        for (int y = 1; y <= linhas; y++) {
            for (int x = 1; x <= colunas; x++) {
                // Se for a primeira ou última linha, desenha tudo com '+'
                if (y == 1 || y == linhas) {
                    System.out.print("+");
                } 
                // Se for a primeira ou última coluna, desenha '+'
                else if (x == 1 || x == colunas) {
                    System.out.print("+");
                } 
                // Espaços vazios entre as bordas
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();  // Quebra de linha após cada linha
        }
    }
}
