package Ex7;

import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa implements Padrao{
    
        ArrayList<String> nomes = new ArrayList<>();

    @Override
     public void cadastrar(String nome){
      nomes.add(nome);
     }

     @Override
     public void listar(){
      for (String nome : nomes) {
        System.out.println(nome);
      }
     }

   @Override
public void modificar(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome a ser modificado:");
    String nomeAntigo = scanner.nextLine();

    if(nomes.contains(nomeAntigo)) {
        System.out.println("Digite o novo nome:");
        String nomeNovo = scanner.nextLine();

        int index = nomes.indexOf(nomeAntigo);
        nomes.set(index, nomeNovo);
        System.out.println("Nome modificado com sucesso.");
    } else {
        System.out.println("Nome não encontrado.");
    }
}    
    
  @Override
public void deletar(String nome){
    if(nomes.remove(nome)) {
        System.out.println("Nome removido com sucesso.");
    } else {
        System.out.println("Nome não encontrado.");
    }
  }
}
