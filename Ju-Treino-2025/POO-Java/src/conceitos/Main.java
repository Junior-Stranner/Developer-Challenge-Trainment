package conceitos;

public class Main {

    public static void main(String[] args) throws Exception {

        // Criar objeto
        Pessoa p = new Pessoa();
        p.nome = "Ralf";
        p.idade = 35;

        p.apresentacao();

        String situacao = p.situacaoIdade();
        System.out.println("A situação da idade é: " + situacao);

    }
    
}
