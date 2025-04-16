import javax.swing.JOptionPane;

public class Modal {
    public static void main(String[] args) {
        
    
    
   // 1. Mensagem Simples
   JOptionPane.showMessageDialog(null, "Este é um aviso simples!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        
   // 2. Mensagem de Erro com Ícone
   JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado!", "Erro", JOptionPane.ERROR_MESSAGE);
   
   // 3. Caixa de Confirmação
   int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
   if (resposta == JOptionPane.YES_OPTION) {
       JOptionPane.showMessageDialog(null, "Você escolheu continuar.");
   } else {
       JOptionPane.showMessageDialog(null, "Você escolheu sair.");
   }
   
   // 4. Entrada de Texto
   String nome = JOptionPane.showInputDialog("Digite seu nome:");
   JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");
   
   // 5. Caixa de Seleção (ComboBox)
   String[] opcoes = {"Java", "Python", "C#", "JavaScript"};
   String escolha = (String) JOptionPane.showInputDialog(null, "Escolha uma linguagem:", "Seleção", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
   if (escolha != null) {
       JOptionPane.showMessageDialog(null, "Você escolheu: " + escolha);
   }
   
   // 6. Caixa de Opções Customizadas
   Object[] botoes = {"Opção 1", "Opção 2", "Cancelar"};
   int escolhaBotao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Opções", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);
   JOptionPane.showMessageDialog(null, "Você selecionou: " + botoes[escolhaBotao]);
   }
}
