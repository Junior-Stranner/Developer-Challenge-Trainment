import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        

        //Arraylist
        ArrayList <String>nomes = new ArrayList<>();

        //ALterar
        nomes.set(1,"Juliana");

        //Remover
        nomes.remove(2);

        //Remover todos os registros
        nomes.clear();

      //  quantidade de registros;
      System.out.println("Registros: "+nomes.size());

        //Cadastrar nomes
        nomes.add("Junior");
        nomes.add("Bubu");
        nomes.add("Deia");

        //Laço de repetição para exibir os nomes;
        for (String n : nomes) {
            System.out.println(n);
        }
    }
}
