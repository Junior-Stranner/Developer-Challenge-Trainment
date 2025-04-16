import java.util.LinkedList;

public class ExemploLinkedList {
    public static void main(String[] args) {

        //Arraylist: Leitura
        //LinkedList: Cadastros e remoções (First e Last)
        
        //
        LinkedList<String> cores = new LinkedList();

        //cadastros
        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Amarelo");

       //Alterar
       cores.set(1, "Amarelo");

       //remover
       cores.remove(1);
       cores.removeFirst();
       cores.removeLast();
    }
}
