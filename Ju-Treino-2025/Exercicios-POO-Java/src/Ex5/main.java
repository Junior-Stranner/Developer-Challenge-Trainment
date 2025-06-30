package Ex5;
/*Haverá três classes, sendo elas:
- Produto com o método imposto() com uma aliquota de 5%;
- Vestuario com o método imposto() com uma aliquota de 10%;
- Eletronico com o método imposto() com uma aliquota de 15%;

Esses métodos deverão exibir uma mensagem com o total de imposto a ser pago. */
public class main {
    public static void main(String[] args) {
        
    
    Produto p = new Produto();
    p.imposto(1000);

    Eletronico e = new Eletronico();
    e.imposto(1000);

    Vestuario v = new Vestuario();
    v.imposto(1000);
    }
}
