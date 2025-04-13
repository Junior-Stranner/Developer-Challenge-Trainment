public class QntParesImparesVetor {
    public static void main(String[] args) {
        
        /*
         * Crie um vetor contendo os números: 5, 8, 3, 1, 9.
         * 
         * Implementando um laço de repetição para percirrer cada posição e contableizar 
         * a quantidade de pares e impares.
         * 
         * Em segida exiba suas respectivas quantidades.
         */

         int[] valor = {5, 8, 3, 1, 9};
         int par =0;
         int impar=0;
         for(int x = 0;x < valor.length; x++){
           
            if(valor[x] % 2 == 0){
              par++;
            }else{
              impar++;
            }
         }

        System.out.println("Par: " + par);
        System.out.println("Ímpar: " + impar);
    }
}
