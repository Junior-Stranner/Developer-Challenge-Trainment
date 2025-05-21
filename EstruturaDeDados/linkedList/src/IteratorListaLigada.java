public class IteratorListaLigada<TIPO> {
        private Elemento<TIPO> elemento;

     public IteratorListaLigada(Elemento<TIPO> atual) {
        this.elemento = atual;
        }

     public boolean temProximo() {
    if (elemento.getProximo() != null) {
        return true;
    }
    return false;
 }

   public Elemento<TIPO> getProximo(){
    elemento = elemento.getProximo();
    return elemento;
   }

}
