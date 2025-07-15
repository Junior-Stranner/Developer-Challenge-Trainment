
/**
 * Representa uma pessoa com nome e idade, permitindo verificar se é maior de idade.
 * 
 * @author Ralf Lima
 * @version 1.0
 */
public class PessoaExemplo {

    private String nome;
    private int idade;

    /**
     * Construtor da classe Pessoa.
     * 
     * @param nome O nome da pessoa.
     * @param idade A idade da pessoa.
     */
    public PessoaExemplo(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    /**
     * Exibe uma mensagem de apresentação da pessoa no console.
     */
    public void apresentacao() {
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
    }

    /**
     * Verifica se a pessoa é maior de idade.
     * 
     * @return "Maior de idade" se a idade for maior ou igual a 18 anos, caso contrário, "Menor de idade".
     */
    public String verificarIdade() {
        return idade >= 18 ? "Maior de idade" : "Menor de idade";
    }
}