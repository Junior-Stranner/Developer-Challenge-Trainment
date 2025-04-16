import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CRUD {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        
        while (true) {
            String menu = "Escolha uma opção:\n" +
                          "1. Adicionar nome\n" +
                          "2. Listar nomes\n" +
                          "3. Atualizar nome\n" +
                          "4. Remover nome\n" +
                          "5. Sair";
            String opcao = JOptionPane.showInputDialog(null, menu);
            
            switch (opcao) {
                case "1":
                    String nomeAdicionar = JOptionPane.showInputDialog("Digite o nome a ser adicionado:");
                    nomes.add(nomeAdicionar);
                    JOptionPane.showMessageDialog(null, "Nome adicionado com sucesso!");
                    break;

                case "2":
                    StringBuilder listaNomes = new StringBuilder("Lista de Nomes:\n");
                    for (int i = 0; i < nomes.size(); i++) {
                        listaNomes.append((i + 1) + ". " + nomes.get(i) + "\n");
                    }
                    JOptionPane.showMessageDialog(null, listaNomes.toString());
                    break;

                case "3":
                    String indiceAtualizarStr = JOptionPane.showInputDialog("Digite o número do nome a ser atualizado (1 a " + nomes.size() + "):");
                    int indiceAtualizar = Integer.parseInt(indiceAtualizarStr) - 1;
                    String novoNome = JOptionPane.showInputDialog("Digite o novo nome:");
                    nomes.set(indiceAtualizar, novoNome);
                    JOptionPane.showMessageDialog(null, "Nome atualizado com sucesso!");
                    break;

                case "4":
                    String indiceRemoverStr = JOptionPane.showInputDialog("Digite o número do nome a ser removido (1 a " + nomes.size() + "):");
                    int indiceRemover = Integer.parseInt(indiceRemoverStr) - 1;
                    nomes.remove(indiceRemover);
                    JOptionPane.showMessageDialog(null, "Nome removido com sucesso!");
                    break;

                case "5":
                    JOptionPane.showMessageDialog(null, "Saindo do programa. Até logo!");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}
