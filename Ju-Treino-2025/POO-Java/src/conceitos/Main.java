package conceitos;

public class Main {

    void main() {

        // Criar objeto
        Pessoa p = new Pessoa();
        p.nome = "Ralf";
        p.idade = 35;

        p.apresentacao();

        String situacao = p.situacaoIdade();
        System.out.println("A situação da idade é: " + situacao);

    }
    
}
