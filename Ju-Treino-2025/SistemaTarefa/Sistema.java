import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    private static final Scanner in = new Scanner(System.in);
    private static final List<Tarefa> tarefas = new ArrayList<>();

    public static void main(String[] args) {
        int op;
        do {
            System.out.println("\n=== Sistema de Gerenciamento de Tarefas ===");
            System.out.println("1 - Criar Tarefa");
            System.out.println("2 - Listar Tarefas (Realizada, Pendente, Atrasada)");
            System.out.println("3 - Tarefas Realizadas");
            System.out.println("4 - Alterar Tarefa");
            System.out.println("5 - Remover Tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            op = in.nextInt();

            switch (op) {
                case 1 -> criandoTarefa();
                case 2 -> listarTarefas();
                case 3 -> listarTarefasNaoFinalizadas();
                case 4 -> alterarTarefa();
                case 5 -> removerTarefa();
                case 0 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (op != 0);
    }

 private static void removerTarefa() {
    in.nextLine();
    System.out.print("Informe o nome da Atividade a ser removido: ");
    String nomeBusca = in.nextLine();

    Iterator<Tarefa> it = tarefas.iterator();
    while (it.hasNext()) {
        Tarefa t = it.next();
        if (t.getNomeAtividade().equalsIgnoreCase(nomeBusca)) {
            it.remove(); 
            System.out.println("Atividade removida com sucesso!");
            return;
        }
    }
    System.out.println("Atividade não encontrado.");
}


private static void alterarTarefa() {
    System.out.print("Digite o nome da Atividade a ser alterada: ");
    String nomeAtividade = in.nextLine();

    boolean encontrada = false;

    for (Tarefa t : tarefas) {
        if (t.getNomeAtividade().equalsIgnoreCase(nomeAtividade)) {
            System.out.print("Novo Nome da Atividade: ");
            String nome = in.nextLine();
            t.setNomeAtividade(nome);

            System.out.print("Nova Descrição da Tarefa: ");
            String descricao = in.nextLine();
            t.setDescricao(descricao);

            System.out.print("Nova Data limite (YYYY-MM-DD): ");
            String dataInput = in.nextLine();
            LocalDate dataRealizacao = LocalDate.parse(dataInput);
            t.setDataRealizacao(dataRealizacao);

            System.out.print("Novo Status (REALIZADA, PENDENTE, ATRASADA): ");
            String statusInput = in.nextLine().toUpperCase();
            Status status = Status.valueOf(statusInput);
            t.setStatusTarefa(status);

            System.out.println("Tarefa alterada com sucesso!");
            encontrada = true;
            break;
        }
    }

    if (!encontrada) {
        System.out.println("Tarefa não encontrada.");
    }
}

    private static void listarTarefasNaoFinalizadas() {
    System.out.println("\n=== Tarefas Pendentes e Atrasadas ===");
    
    List<Tarefa> naoFinalizadas = new ArrayList<>();
    for (Tarefa t : tarefas) {
        if (t.getStatusTarefa() == Status.PENDENTE || t.getStatusTarefa() == Status.ATRASADA) {
            naoFinalizadas.add(t);
        }
    }

    if (naoFinalizadas.isEmpty()) {
        System.out.println("Não há tarefas pendentes ou atrasadas.");
        return;
    }

   for (int i = 0; i < naoFinalizadas.size(); i++) {
    System.out.println((i + 1) + " - " + naoFinalizadas.get(i));
   }

    System.out.print("Digite o número da tarefa para marcar como realizada (0 para cancelar): ");
    int escolha = in.nextInt();
    in.nextLine(); 

   if (escolha > 0 && escolha <= naoFinalizadas.size()) {
    Tarefa tarefaSelecionada = naoFinalizadas.get(escolha - 1);
        tarefaSelecionada.setStatusTarefa(Status.REALIZADA);
        System.out.println("Tarefa marcada como realizada com sucesso!");
    } else if (escolha == 0) {
        System.out.println("Operação cancelada.");
    } else {
        System.out.println("Opção inválida.");
    }
}

 private static List<Tarefa> listarTarefas() {
    System.out.println("\n=== Listagem de Tarefas ===");
    if (tarefas.isEmpty()) {
        System.out.println("Nenhuma tarefa cadastrada.");
    } else {
        for (Tarefa t : tarefas) {
            System.out.println(t);
        }
    }
    return tarefas;
}


    private static void criandoTarefa() {
        in.nextLine(); // Limpa buffer

        System.out.print("Nome da Atividade: ");
        String nome = in.nextLine();

        System.out.print("Descrição da Tarefa: ");
        String descricao = in.nextLine();

        System.out.print("Data limite da realização (formato YYYY-MM-DD): ");
        String dataInput = in.nextLine();
        LocalDate dataRealizacao = LocalDate.parse(dataInput);

        System.out.print("Status da Tarefa (REALIZADA, PENDENTE, ATRASADA): ");
        String statusInput = in.nextLine().toUpperCase();
        Status status = Status.valueOf(statusInput);

        Tarefa t = new Tarefa(nome, descricao, dataRealizacao, status);
        tarefas.add(t);

        System.out.println("Tarefa cadastrada com sucesso!");
     }
}

