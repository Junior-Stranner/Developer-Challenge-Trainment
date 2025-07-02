// Importar JOptionPane
import javax.swing.JOptionPane;

public class Acoes {

    // 1º Método: Construtor
    public Acoes(){
        // Variável para armazenar a ação
        int opcaoMenu;

        // Laço de repetição
        do{
            // Menu
            opcaoMenu = menu();

            // Estrutura de escolha
            switch (opcaoMenu) {
                case 1:
                    cadastrar();    
                break;

                case 2:
                    listar();
                break;

                case 3:
                    alterar();
                break;

                case 4:
                    remover();
                break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Obrigado por utilizar o sistema.");
                break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }while(opcaoMenu != 5);
    }

    // 2º Método: Menu
    private int menu(){
        //Opções do menu
        String opcoes = "MENU\n";
               opcoes+= "1º Cadastrar\n";
               opcoes+= "2º Listar\n";
               opcoes+= "3º Alterar\n";
               opcoes+= "4º Remover\n";
               opcoes+= "5º Finalizar";
        
        // Obter a opção
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(opcoes));

        // Retorno
        return opcao;
    }

    // 3º Método: Listar nomes (Utilizado para alterar e remover)
    private int listarNomes(){
        // Variável para armazenar a listagem de nomes
        String listagem = "Pessoas registradas:\n\n";

        // Laço de repetição
        for(int indice = 0; indice < Armazenamento.pessoas.size(); indice++){
            listagem += indice + ") " + Armazenamento.pessoas.get(indice).getNome();
            listagem += "\n";
        }

        // Obter o índice do nome selecionado
        int indiceNome = Integer.parseInt(JOptionPane.showInputDialog(listagem));

        // Retorno
        return indiceNome;
    }

    // 4º Método: Obter dados (nome, idade e cidade)
    private Pessoa obterDados(){
        // Criar objeto
        Pessoa p = new Pessoa();
        
        // Obter dados
        p.setNome(JOptionPane.showInputDialog("Informe o nome."));
        p.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade.")));
        p.setCidade(JOptionPane.showInputDialog("Informe a cidade."));

        // Retorno
        return p;
    }

    // 5º Método: Cadastrar
    private void cadastrar(){
        // Obter dados (nome, idade e cidade)
        Pessoa p = obterDados();

        // Efetuar cadastro no ArrayList
        Armazenamento.pessoas.add(p);

        // Mensagem
        JOptionPane.showMessageDialog(null, "Cadastro realizado!");
    }

    // 6º Método: Listar
    private void listar(){
        // Variável para armazenar a listagem de nomes
        String listagem = "Pessoas registradas:\n";

        // Laço de repetição
        for(int indice = 0; indice < Armazenamento.pessoas.size(); indice++){
            listagem += "\nNome: "   + Armazenamento.pessoas.get(indice).getNome();
            listagem += "\nIdade: "  + Armazenamento.pessoas.get(indice).getIdade();
            listagem += "\nCidade: " + Armazenamento.pessoas.get(indice).getCidade();
            listagem += "\n";
        }

        // Exibir os dados de todas as pessoas contidas no ArrayList
        JOptionPane.showMessageDialog(null, listagem);
    }

    // 7º Método: Alterar
    private void alterar(){
        // Listar todos os nomes e obter o índice da pessoa que será alterada
        int indicePessoa = listarNomes();

        // Obter os novos dados
        Pessoa p = obterDados();

        // Efetuar a alteração no ArrayList
        Armazenamento.pessoas.set(indicePessoa, p);

        // Mensagem
        JOptionPane.showMessageDialog(null, "Alteração realizada!");
    }

    // 8º Método: Remover
    private void remover(){
        // Listar todos os nomes e obter o índice da pessoa que será removida
        int indicePessoa = listarNomes();

        // Efetuar a remoção no ArrayList
        Armazenamento.pessoas.remove(indicePessoa);

        // Mensagem
        JOptionPane.showMessageDialog(null, "Remoção realizada!");
    }
    
}
