package Ex5;

public class Vestuario extends Produto {
    private double valor;
    @Override
    public void imposto(double valor){
        System.out.println("Desconto vestuário: " + (valor * 0.10));
    }

    
}
