package br.com.judev.desafiosPreparTecnicos;

import java.util.HashMap;

public class HashTables {
    public static void main(String[] args) {
//Uma hash table é uma estrutura de dados que mapeia chaves para valores usando uma função hash.
        //Exemplo em Java (usando HashMap):
        HashMap<String, Integer> map = new HashMap<>();

        // Adiciona elementos na hash table
        map.put("one", 1);
        map.put("two",2);
        map.put("tree",3);

        // Acesso a elementos
        System.out.println(map.get("two")); // Output: 2

        // Iteração sobre elementos
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

    }
}
