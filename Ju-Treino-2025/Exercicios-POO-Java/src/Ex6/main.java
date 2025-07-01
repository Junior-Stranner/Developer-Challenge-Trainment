package Ex6;

/*
Crie uma classe abstrata com o método verificarDesconto.
O usuário informa a forma de pagamento (à vista ou a prazo) e o total da compra.
Caso o pagamento seja à vista e o valor mínimo de R$100,00, será fornecido 10% de desconto. */

public class main {
    public static void main(String[] args) {
        
        Loja l = new Loja();
        l.verificarDesconto("À vista", 100);
    }
}
