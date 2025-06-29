package abstracao;

public abstract class Crud {
    
    // Métodos obrigatórios
    public abstract void cadastrar();
    public abstract void selecionar();
    public abstract void alterar();
    public abstract void remover();

    // Métodos opcionais
    public void mensagem(){
        System.out.println("Método opcional...");
    }

}
