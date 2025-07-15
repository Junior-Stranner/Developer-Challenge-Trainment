import java.time.LocalDate;

public class Tarefa {
    private String nomeAtividade;
    private String descricao;
    private LocalDate dataRealizacao;
    private Status statusTarefa;
    
  
    public Tarefa(String nomeAtividade, String descricao, LocalDate dataRealizacao, Status statusTarefa) {
        this.nomeAtividade = nomeAtividade;
        this.descricao = descricao;
        this.dataRealizacao = dataRealizacao;
        this.statusTarefa = statusTarefa;  
    }

    

    public String getNomeAtividade() {
        return nomeAtividade;
    }
    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Status getStatusTarefa() {
        return statusTarefa;
    }
    public void setStatusTarefa(Status statusTarefa) {
        this.statusTarefa = statusTarefa;
    }

    public LocalDate getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(LocalDate dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    
  /*   public void statusAtividade(String statusTarefa){
        if(this.statusTarefa.name() != null){
            this.statusTarefa.PENDENTE;
        }

    }*/
}
