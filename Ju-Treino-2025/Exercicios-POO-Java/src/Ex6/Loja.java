package Ex6;

public  class Loja extends Pagamento{
    private double valor;
    private String formaPagamento;


    @Override
    void verificarDesconto(String formaPagamento, double valor){
      
        if(formaPagamento == "À vista" && valor >= 100){
            System.out.println("R$ " + (valor * 0.90));
        }else{
            System.out.println("R$ " + valor);
        }
    }

}
