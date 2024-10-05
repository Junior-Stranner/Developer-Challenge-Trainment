package ExRacocinio;

import java.util.ArrayList;
import java.util.List;

public class HomemCargaAtravesarRio {

    public static void main(String[] args) {
        // Itens disponíveis
        String homem = "Homem";
        String cachorro = "Cachorro";
        String galinha = "Galinha";
        String milho = "Milho";

        // Inicialização das listas para as margens
        List<String> margemEsquerda = new ArrayList<>();
        List<String> margemDireita = new ArrayList<>();

        // Adicionando todos os itens na margem esquerda
        margemEsquerda.add(homem);
        margemEsquerda.add(cachorro);
        margemEsquerda.add(galinha);
        margemEsquerda.add(milho);

        // Atravessias
        System.out.println("Início: " + margemEsquerda);
        atravessarRio(margemEsquerda, margemDireita);
    }

    public static void atravessarRio(List<String> margemEsquerda, List<String> margemDireita) {
        // Passo 1: O homem leva a galinha
        mover(margemEsquerda, margemDireita, "Homem", "Galinha");

        // Passo 2: O homem volta sozinho
        voltar(margemEsquerda, margemDireita, "Homem");

        // Passo 3: O homem leva o cachorro
        mover(margemEsquerda, margemDireita, "Homem", "Cachorro");

        // Passo 4: O homem volta com a galinha
        voltar(margemEsquerda, margemDireita, "Homem", "Galinha");

        // Passo 5: O homem leva o milho
        mover(margemEsquerda, margemDireita, "Homem", "Milho");

        // Passo 6: O homem volta sozinho
        voltar(margemEsquerda, margemDireita, "Homem");

        // Passo 7: O homem leva a galinha
        mover(margemEsquerda, margemDireita, "Homem", "Galinha");

        System.out.println("Todos atravessaram com sucesso!");
    }

    // Método para mover itens de uma margem para outra
    private static void mover(List<String> origem, List<String> destino, String... itens) {
        for (String item : itens) {
            origem.remove(item);
            destino.add(item);
        }
        System.out.println("Movendo: " + String.join(", ", itens) + " | Margem Esquerda: " + origem + " | Margem Direita: " + destino);
    }

    // Método para voltar um item de uma margem para outra
    private static void voltar(List<String> origem, List<String> destino, String... itens) {
        for (String item : itens) {
            destino.remove(item);
            origem.add(item);
        }
        System.out.println("Voltando: " + String.join(", ", itens) + " | Margem Esquerda: " + origem + " | Margem Direita: " + destino);
    }
}
