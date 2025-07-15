import java.util.ArrayList;

public class Comparacao {
    public static void main(String[] args) {
        ListaLigada<Integer> lista = new ListaLigada<>();
        ArrayList<Integer> vetor = new ArrayList<>();

        int limite = 1000000;

        // Adiciona no ArrayList
        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < limite; i++) {
            vetor.add(i);
        }
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Adicionou " + limite + " elementos no vetor");
        System.out.println((tempoFinal - tempoInicial) + " ms");

        // Adiciona na Lista Ligada
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < limite; i++) {
            lista.adicionar(i); 
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\nAdicionou " + limite + " elementos na Lista");
        System.out.println((tempoFinal - tempoInicial) + " ms");

        // Leitura do ArrayList
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < vetor.size(); i++) {
            vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\nTempo de leitura do vetor:");
        System.out.println((tempoFinal - tempoInicial) + " ms");

        // Leitura da Lista Ligada
        tempoInicial = System.currentTimeMillis();
        IteratorListaLigada<Integer> iterator = lista.getIterator();
        while(iterator.temProximo()){
            iterator.getProximo();
        }
        for (int i = 0; i < lista.getTamanho(); i++) {
            lista.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\nTempo de leitura da Lista:");
        System.out.println((tempoFinal - tempoInicial) + " ms");
    }
}
