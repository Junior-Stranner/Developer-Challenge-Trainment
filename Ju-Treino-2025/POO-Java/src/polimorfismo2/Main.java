package polimorfismo2;

public class Main {

    public static void main(String[] args) throws Exception {
        
        // Criar um objeto
        DescontoPadrao obj = new DescontoDesenvolvedor();
        System.out.println("Imposto de Renda: " + obj.impostoRenda(1000));
        System.out.println("Vale transporte: " + obj.valeTransporte(1000));

    }
    
}
