package br.com.judev;

import java.util.HashSet;
import java.util.Set;

public class Q07ConjuntosIguais {
    public static void main(String[] args) {
        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();

        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);

        conjunto2.add(3);
        conjunto2.add(1);
        conjunto2.add(2);

        if (conjunto1.equals(conjunto2)) {
            System.out.println("Os conjuntos são iguais");
        } else {
            System.out.println("Os conjuntos são diferentes");
        }
    }
}
