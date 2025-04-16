import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        
        //Queue
        //First in First Out (Fila)
        Queue<String> nomes = new LinkedList<>();

        //cadastros
        nomes.offer("Ana");
        nomes.offer("Beatiz");
        nomes.offer("Carla");

        //remover
        nomes.poll();

        //Exibir
        System.out.println(nomes);

    }
}
