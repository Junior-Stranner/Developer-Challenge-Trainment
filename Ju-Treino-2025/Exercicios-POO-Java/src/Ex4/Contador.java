package Ex4;
/* Crie um sistema para trabalhar com um contador
Haverá um atributo público e estático incializando com zero.
Também haverá dois métodos, um para incrementar e outro para decrementar.

Exemplo:
Contador.incrementar(); // +1
Contador.incrementar(); // +1
Contador.decrementar(); // -2
System.out.println(Contador.contador); // Retorna 1*/

public class Contador {
     public static int contador = 0;



    public static void incrementar(){
        contador += 1;
    }

    public static void decrementar(){
        contador -= 1;
    }
}
