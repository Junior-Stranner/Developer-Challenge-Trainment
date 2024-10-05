package ExRacocinio;
import java.util.ArrayList;
import java.util.List;

public class JesuitasCanibais {

    public static void main(String[] args) {
        // Inicialização dos jesuítas e canibais
        int jesuitasEsquerda = 3;
        int canibaisEsquerda = 3;
        int jesuitasDireita = 0;
        int canibaisDireita = 0;
        boolean barcoEsquerda = true; // true = esquerda, false = direita

        // Lista para armazenar os movimentos
        List<String> movimentos = new ArrayList<>();

        while (jesuitasDireita < 3 || canibaisDireita < 3) {
            if (barcoEsquerda) {
                // Atravessa dois canibais
                if (canibaisEsquerda >= 2) {
                    canibaisEsquerda -= 2;
                    canibaisDireita += 2;
                    movimentos.add("2 canibais atravessaram para a direita");
                }
                // Atravessa um canibal
                else if (canibaisEsquerda >= 1) {
                    canibaisEsquerda--;
                    canibaisDireita++;
                    movimentos.add("1 canibal atravessou para a direita");
                }
                // Atravessa dois jesuítas
                else if (jesuitasEsquerda >= 2) {
                    jesuitasEsquerda -= 2;
                    jesuitasDireita += 2;
                    movimentos.add("2 jesuítas atravessaram para a direita");
                }
                // Atravessa um jesuíta
                else if (jesuitasEsquerda >= 1) {
                    jesuitasEsquerda--;
                    jesuitasDireita++;
                    movimentos.add("1 jesuíta atravessou para a direita");
                }
                // Atravessa um jesuíta e um canibal
                else if (jesuitasEsquerda >= 1 && canibaisEsquerda >= 1) {
                    jesuitasEsquerda--;
                    canibaisEsquerda--;
                    jesuitasDireita++;
                    canibaisDireita++;
                    movimentos.add("1 jesuíta e 1 canibal atravessaram para a direita");
                }
                // Muda o barco para a direita
                barcoEsquerda = false;
            } else {
                // Atravessa dois canibais de volta
                if (canibaisDireita >= 2) {
                    canibaisDireita -= 2;
                    canibaisEsquerda += 2;
                    movimentos.add("2 canibais voltaram para a esquerda");
                }
                // Atravessa um canibal de volta
                else if (canibaisDireita >= 1) {
                    canibaisDireita--;
                    canibaisEsquerda++;
                    movimentos.add("1 canibal voltou para a esquerda");
                }
                // Atravessa dois jesuítas de volta
                else if (jesuitasDireita >= 2) {
                    jesuitasDireita -= 2;
                    jesuitasEsquerda += 2;
                    movimentos.add("2 jesuítas voltaram para a esquerda");
                }
                // Atravessa um jesuíta de volta
                else if (jesuitasDireita >= 1) {
                    jesuitasDireita--;
                    jesuitasEsquerda++;
                    movimentos.add("1 jesuíta voltou para a esquerda");
                }
                // Atravessa um jesuíta e um canibal de volta
                else if (jesuitasDireita >= 1 && canibaisDireita >= 1) {
                    jesuitasDireita--;
                    canibaisDireita--;
                    jesuitasEsquerda++;
                    canibaisEsquerda++;
                    movimentos.add("1 jesuíta e 1 canibal voltaram para a esquerda");
                }
                // Muda o barco para a esquerda
                barcoEsquerda = true;
            }
        }

        // Exibe todos os movimentos
        System.out.println("Movimentos para atravessar o rio:");
        for (String movimento : movimentos) {
            System.out.println(movimento);
        }
    }
}
