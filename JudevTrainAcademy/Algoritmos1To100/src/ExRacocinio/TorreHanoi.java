package ExRacocinio;

public class TorreHanoi {
    public static void main(String[] args) {
        int numeroDeDiscos = 3; // Pode ser ajustado para o número desejado de discos
        resolverTorreDeHanoi(numeroDeDiscos, 'A', 'C', 'B'); // 'A' é a origem, 'C' é o destino, 'B' é a auxiliar
            }
        
            private static void resolverTorreDeHanoi(int n, char origem, char destino, char auxiliar) {
                if (n == 1) {
                    System.out.println("Mover disco 1 de " + origem + " para " + destino);
                    return;
                }

                // Passo 1: Mover n-1 discos da origem para a auxiliar
                resolverTorreDeHanoi(n - 1, origem, auxiliar, destino);

                 // Passo 2: Mover o disco restante da origem para o destino
                  System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
        
                 // Passo 3: Mover os n-1 discos da auxiliar para o destino
                 resolverTorreDeHanoi(n - 1, auxiliar, destino, origem);
            }
}
