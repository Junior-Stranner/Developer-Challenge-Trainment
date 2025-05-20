public class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;
    

    public ListaLigada() {
        this.tamanho = 0;
    }
    public Elemento getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }
    public Elemento getUltimo() {
        return ultimo;
    }
    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(String novoValor){
     Elemento novoElemento = new Elemento(novoValor);
     if(this.primeiro == null && this.ultimo == null){
       this.primeiro = novoElemento;
       this.ultimo = novoElemento;
     }else{
        this.ultimo.setProximo(novoElemento);
        this.ultimo = novoElemento;
     }
     this.tamanho++;
    }


      public void remover(String valorProcurado) {
        Elemento anterior = null;
        Elemento atual = primeiro;

        while (atual != null) {
            if (atual.getValor().equalsIgnoreCase(valorProcurado)) {
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


    public Elemento get(int posicao){
        Elemento atual = this.primeiro;
        for(int i=0; i< posicao; i++){
            if(atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }
}
