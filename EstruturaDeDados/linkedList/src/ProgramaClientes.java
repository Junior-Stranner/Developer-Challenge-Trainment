public class ProgramaClientes {
    public static void main(String[] args) {
          ListaLigada<Cliente> clientes = new ListaLigada<Cliente>();
    clientes.adicionar(new Cliente("123", "Jão"));
    clientes.adicionar(new Cliente("543", "ZUca"));
    clientes.adicionar(new Cliente("680", "Junior"));

    System.out.println("Tamanho: "+clientes.getTamanho());
  for(int i =0; i < clientes.getTamanho(); i++){
            System.out.println(clientes.get(i).getValor());
        }
   } 
}
