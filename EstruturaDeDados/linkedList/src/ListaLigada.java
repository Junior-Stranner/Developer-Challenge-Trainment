
public class ListaLigada<TIPO>{
    private Elemento<TIPO> primeiro;
    private Elemento<TIPO> ultimo;
    private int tamanho;
    

    public ListaLigada() {
        this.tamanho = 0;
    }
    public Elemento<TIPO> getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(Elemento<TIPO> primeiro) {
        this.primeiro = primeiro;
    }
    public Elemento<TIPO> getUltimo() {
        return ultimo;
    }
    public void setUltimo(Elemento<TIPO> ultimo) {
        this.ultimo = ultimo;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(TIPO novoValor){
     Elemento<TIPO> novoElemento = new Elemento<TIPO>(novoValor);
     if(this.primeiro == null && this.ultimo == null){
       this.primeiro = novoElemento;
       this.ultimo = novoElemento;
     }else{
        this.ultimo.setProximo(novoElemento);
        this.ultimo = novoElemento;
     }
     this.tamanho++;
    }


      public void remover(TIPO valorProcurado) {
        Elemento<TIPO> anterior = null;
        Elemento<TIPO> atual = primeiro;

        while (atual != null) {
            if (atual.getValor().equals(valorProcurado)) {
                if (tamanho == 1) {
                    primeiro = null;
                    ultimo = null;
                }
                else if (atual == primeiro) {
                    primeiro = atual.getProximo();
                    atual.setProximo(null);
                }
                else if (atual == ultimo) {
                    ultimo = anterior;
                    if (anterior != null) 
                    anterior.setProximo(null);
                }
                else {
                    anterior.setProximo(atual.getProximo());
                    atual.setProximo(null);
                }
                tamanho--;
                break;
            }

            anterior = atual;
            atual = atual.getProximo();
        }
    }


    public Elemento<TIPO> get(int posicao){
        Elemento<TIPO> atual = this.primeiro;
        for(int i=0; i< posicao; i++){
            if(atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }
}
