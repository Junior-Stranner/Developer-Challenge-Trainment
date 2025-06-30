package Ex5;

public class Eletronico extends Produto{
    private double valor;

    @Override
    public void imposto(double valor){
        System.out.println("Desconto eletrônico: " + (valor * 0.15));
    }

}
