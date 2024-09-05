package Ex74a76RepeticaoAlinhada;

public class Q75SequenciaDeNumsTabuada {
    public static void main(String[] args) {
        
    for (int i = 1; i <= 10; i++) {
        System.out.print("("+i + ", ");
        for (int j = 1; j <= 10; j++) {
            System.out.print(","+j);
        }
        System.out.println(")"); 
      }
   }
}
