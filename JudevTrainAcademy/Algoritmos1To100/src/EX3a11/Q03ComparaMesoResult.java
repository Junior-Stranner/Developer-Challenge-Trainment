package EX3a11;

public class Q03ComparaMesoResult {
    public static void main(String[]args){

   System.out.println("A)");

   double resultadoA1 = (4.0/2)+(2.0/4);
   double resultadoA2 = 4.0/2+2.0/4;

   if(resultadoA1 != resultadoA2){
    System.out.println("Valores Diferentes !");
   }else{
   System.out.println("Valores Iguais !");
   }

   System.out.println("Resultado A1: " + resultadoA1); // Resultado A1: 2.5
   System.out.println("Resultado A2: " + resultadoA2); // Resultado A2: 2.5

   System.out.println("---------------------------------------------------------");

   System.out.println("B)");


   double resultadoB1 = 4.0/(2+2)/4;
   double resultadoB2 = 4.0/2+2.0/4;

   if(resultadoB1 != resultadoB2){
    System.out.println("Valores Diferentes !");
   }else{
   System.out.println("Valores Iguais !");
   }

   System.out.println("Resultado B1: " + resultadoB1); // Resultado B1: 0.25
   System.out.println("Resultado B2: " + resultadoB2); // Resultado B2: 2.5


   System.out.println("---------------------------------------------------------");

   System.out.println("C)");

   double resultadoC1 = (4+2)*2-4;
   double resultadoC2 = 4+2*2-4;

   if(resultadoC1 != resultadoC2){
    System.out.println("Valores Diferentes !");
   }else{
   System.out.println("Valores Iguais !");
   }

   System.out.println("Resultado C1: " + resultadoC1); // Resultado C1: 8.0
   System.out.println("Resultado C2: " + resultadoC2); // Resultado C2: 4.0


   System.out.println("---------------------------------------------------------");

    }
}
/*3) Os pares de instruções abaixo produzem o mesmo resultado? 
 */