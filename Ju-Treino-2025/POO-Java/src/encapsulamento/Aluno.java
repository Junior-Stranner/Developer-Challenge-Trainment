package encapsulamento;

public class Aluno {

    // Atributos
    private double nota1;
    private double nota2;

    // Método de média
    private double media(){
        return (nota1+nota2)/2;
    }

    // Método de situação
    private String situacao(){
        return media() >= 7 ? "Aprovado" : "Reprovado";
    }
    
    // Método principal
    public void principal(double n1, double n2){
        nota1 = n1;
        nota2 = n2;

        System.out.println("A média é: " + media());
        System.out.println("Situação: " + situacao());
    }
}
