package Ex6;

public abstract class Pagamento {
     private double valor;
    private String formaPagamento;
   abstract void verificarDesconto(String formaPagamento, double valor);

}
