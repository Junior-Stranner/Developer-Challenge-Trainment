package Ex5;
public class Produto {
   private double valor;

   public void imposto(double valor){
        System.out.println("Desconto Produto: " + (valor * 0.05));
    }
}
