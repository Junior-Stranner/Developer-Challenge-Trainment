package Ex5;
public class Produto {
   private double valor;

   public void imposto(double valor){
        System.out.println("Desconto padrão: " + (valor * 0.05));
    }
}
