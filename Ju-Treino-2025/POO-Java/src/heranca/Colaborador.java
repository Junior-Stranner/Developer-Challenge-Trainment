package heranca;

public class Colaborador extends Pessoa{

    // Atributos
    private String cargo;
    private double salario;

    // Construtor
    public Colaborador(String nome, int idade, String cargo, double salario){
        super(nome, idade);
        this.cargo = cargo;
        this.salario = salario;

        mensagemPessoa();
        mensagemColaborador();
    }

    // Método
    private void mensagemColaborador(){
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }
    
}
