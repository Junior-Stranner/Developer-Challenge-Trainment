package ExercicosTreinoCanalRalfLima10;

import java.util.Scanner;

public class Q3Agenda {
    private static String[] nomes = new String[2];
    private static int[] telefones = new int[2];
    private static String[] email = new String[2];
    private static String[] cidades = new String[2];
    private static String[] estados = new String[2];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op;

        do {
            System.out.println("Agenda "
                + "\n 1 - Cadastrar "
                + "\n 2 - Listar "
                + "\n 3 - Alterar "
                + "\n 4 - Remover "
                + "\n 5 - Finalizar");
            op = Integer.parseInt(in.nextLine());

            switch (op) {
                case 1:
                    cadastrar(in);
                    break;

                case 2:
                    listar();
                    break;

                case 3:
                    alterar(in);
                    break;

                case 4:
                    remover(in);
                    break;

                case 5:
                    System.out.println("Finalizar ");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (op != 5);

        in.close();
    }

    public static void cadastrar(Scanner in) {
        for (int i = 0; i < 2; i++) {
            System.out.println("Informe o nome ");
            nomes[i] = in.nextLine();

            System.out.println("Informe o telefone");
            telefones[i] = Integer.parseInt(in.nextLine());

            System.out.println("Informe o E-mail ");
            email[i] = in.nextLine();

            System.out.println("Informe a cidade ");
            cidades[i] = in.nextLine();

            System.out.println("Informe o estado ");
            estados[i] = in.nextLine();
        }
    }

    public static void listar() {
        System.out.println("Listagem de contatos:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Contato " + (i + 1) + ":");
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Telefone: " + telefones[i]);
            System.out.println("E-mail: " + email[i]);
            System.out.println("Cidade: " + cidades[i]);
            System.out.println("Estado: " + estados[i]);
            System.out.println();
        }
    }

    public static void alterar(Scanner in) {
        System.out.println("Digite o índice (0 ou 1) do contato que deseja alterar:");
        int index = Integer.parseInt(in.nextLine());

        if (index >= 0 && index < 2) {
            System.out.println("Informe o novo nome:");
            nomes[index] = in.nextLine();

            System.out.println("Informe o novo telefone:");
            telefones[index] = Integer.parseInt(in.nextLine());

            System.out.println("Informe o novo E-mail:");
            email[index] = in.nextLine();

            System.out.println("Informe a nova cidade:");
            cidades[index] = in.nextLine();

            System.out.println("Informe o novo estado:");
            estados[index] = in.nextLine();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void remover(Scanner in) {
        System.out.println("Digite o índice (0 ou 1) do contato que deseja remover:");
        int index = Integer.parseInt(in.nextLine());

        if (index >= 0 && index < 2) {
            nomes[index] = "";
            telefones[index] = 0;
            email[index] = "";
            cidades[index] = "";
            estados[index] = "";
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
