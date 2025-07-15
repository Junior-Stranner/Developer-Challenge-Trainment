public class ProgramaINteiros {
    public static void main(String[] args) {
        
    
    ListaLigada<Integer> numeros = new ListaLigada<>();
    numeros.adicionar(1);
    numeros.adicionar(2);
    numeros.adicionar(3);

    System.out.println("Tamanho: "+numeros.getTamanho());
  for(int i =0; i < numeros.getTamanho(); i++){
            System.out.println(numeros.get(i).getValor());
        }
   } 
}
