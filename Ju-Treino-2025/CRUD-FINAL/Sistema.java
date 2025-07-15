package org.example.CRUD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sistema {
       private static final Scanner in = new Scanner(System.in);
       private static final List<Produto> produtos = new ArrayList<>();
    public static void main(String[] args) {

        int op = 0;
        do{
            System.out.println("\n=== Sistema de Gerenciamento de Produtos ===");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Filtrar Produtos (Marca ou Segmento)");
            System.out.println("4 - Alterar Produto");
            System.out.println("5 - Remover Produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            op = in.nextInt();

            switch(op){

                case 1: cadastrarProduto();break;
                case 2:ListagemProdutos();break;
                case 3:in.nextLine();
                    System.out.print("Filtrar por Marca: ");
                    String marca = in.nextLine();

                    System.out.print("Filtrar por Segmento: ");
                    String segmento = in.nextLine();

                    filtragemProduto(marca, segmento, produtos);
                    break;
                case 4: alterarProduto();break;
                case 5: removerProduto();break;
                case 0:System.out.println("Encerrando o sistema...");break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }while(op != 0);
    }

    private static void removerProduto() {
        in.nextLine();
        System.out.print("Informe o nome do produto a ser removido: ");
        String nomeBusca = in.nextLine();

        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nomeBusca)) {
                produtos.remove(p);
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }


    private static void alterarProduto() {
        in.nextLine();
        System.out.print("Informe o nome do produto a ser alterado: ");
        String nomeBusca = in.nextLine();

        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.print("Novo nome do Produto: ");
                String novoNome = in.nextLine();

                System.out.print("Nova marca do Produto: ");
                String novaMarca = in.nextLine();

                System.out.print("Novo segmento do Produto: ");
                String novoSegmento = in.nextLine();

                System.out.print("Novo valor do Produto: ");
                double novoValor = Double.parseDouble(in.nextLine());

                p.setNome(novoNome);
                p.setMarca(novaMarca);
                p.setSegmento(novoSegmento);
                p.setValor(novoValor);

                System.out.println("Produto alterado com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    private static void filtragemProduto(String marcaFiltro, String segmentoFiltro, List<Produto> produtos) {
        for (Produto p : produtos) {
            if (p.filtraPorMarcaOuSegmento(marcaFiltro, segmentoFiltro)) {
                System.out.println(p);
            }
        }
    }

    private static void ListagemProdutos() {
        for (Produto p : produtos){
             p.toString();
            System.out.println(p);
        }
    }

    private static void cadastrarProduto() {
        in.nextLine();
        System.out.print("Nome do Produto");
        String nome = in.nextLine();
        System.out.print("Marca do Produto");
        String marca = in.nextLine();
        System.out.print("Segmento do Produto");
        String segmento = in.nextLine();
        System.out.print("valor do Produto");
        double valor = Double.parseDouble(in.nextLine());

        Produto p = new Produto(nome, marca, segmento, valor);
        produtos.add(p);
        System.out.println("Produto cadastrado com sucesso!");
    }
}
