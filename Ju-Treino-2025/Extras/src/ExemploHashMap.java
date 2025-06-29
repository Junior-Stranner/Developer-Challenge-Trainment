import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        
        //HashMap
        HashMap<String,String> lingugagens = new HashMap<>();

        lingugagens.put("Java", "Multiplataforma");
        lingugagens.put("HTML", "Linguagens de Marcação");
        lingugagens.put("CSS", "Linguegm de estilos");

        //Remoção
        lingugagens.remove("Java");

        //Exibir Informações referente a linguagem Java
        System.out.println(lingugagens.get("Java"));
    }
}
