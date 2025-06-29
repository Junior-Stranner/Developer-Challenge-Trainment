package conceitos;

public class Pessoa {

    // Atributos
    String nome;
    int idade;

    // Método de apresentação
    void apresentacao(){
        System.out.println("Olá " + nome + " você tem " + idade + " anos.");
    }

    // Método para retornar a situação
    String situacaoIdade(){
        return idade >= 18 ? "Maior de idade" : "Menor de idade";
    }
}
