using System;

class Program
{
    static string[,] produtos = new string[100, 3]; 
    static int totalProdutos = 0; 

    static void Main(string[] args)
    {
        int opcao;

        do
        {
            Console.WriteLine("Sistema de Gerenciamento de Produtos (CRUD)");
            Console.WriteLine("1. Cadastrar Produto");
            Console.WriteLine("2. Listar Produtos");
            Console.WriteLine("3. Alterar Produto");
            Console.WriteLine("4. Excluir Produto");
            Console.WriteLine("5. Sair");
            Console.Write("Escolha uma opção: ");
            opcao = Convert.ToInt16(Console.ReadLine());

            switch (opcao)
            {
                case 1:
                    CadastrarProduto();
                    break;
                case 2:
                    ListarProdutos();
                    break;
                case 3:
                    AlterarProduto();
                    break;
                case 4:
                    ExcluirProduto();
                    break;
                case 5:
                    Console.WriteLine("Saindo...");
                    break;
                default:
                    Console.WriteLine("Opção inválida, tente novamente.");
                    break;
            }

            Console.WriteLine();
        } while (opcao != 5);
    }

static void CadastrarProduto()
{
    if (totalProdutos >= 100)
    {
        Console.WriteLine("Capacidade máxima de produtos atingida.");
        return;
    }

    Console.WriteLine("Cadastro de Produto");

    string codigo;
    do
    {
        Console.Write("Código do produto: ");
        codigo = Console.ReadLine();
    } while (string.IsNullOrWhiteSpace(codigo) || EncontrarProduto(codigo) != -1);

    string nome;
    do
    {
        Console.Write("Nome do produto: ");
        nome = Console.ReadLine();
    } while (string.IsNullOrWhiteSpace(nome) || EncontrarProduto(nome) != -1);

    string valor;
    do
    {
        Console.Write("Valor do produto: ");
        valor = Console.ReadLine();
    } while (string.IsNullOrWhiteSpace(valor) || !decimal.TryParse(valor, out _));

    // Armazenamento do produto
    produtos[totalProdutos, 0] = codigo;
    produtos[totalProdutos, 1] = nome;
    produtos[totalProdutos, 2] = valor;

    totalProdutos++;
    Console.WriteLine("Produto cadastrado com sucesso!");
}


    static void ListarProdutos()
    {
        if (totalProdutos == 0)
        {
            Console.WriteLine("Nenhum produto cadastrado.");
            return;
        }

        Console.WriteLine("Listagem de Produtos:");
        Console.WriteLine("Código , Nome , Valor");

        for (int i = 0; i < totalProdutos; i++)
        {
            Console.WriteLine($"{produtos[i, 0]} , {produtos[i, 1]} , {produtos[i, 2]}");
        }
    }

    static void AlterarProduto()
    {
        Console.Write("Digite o código do produto a ser alterado: ");
        string codigo = Console.ReadLine();

        int indice = EncontrarProduto(codigo);
        if (indice == -1)
        {
            Console.WriteLine("Produto não encontrado.");
            return;
        }

        Console.Write("Novo nome do produto: ");
        string novoNome = Console.ReadLine();

        Console.Write("Novo valor do produto: ");
        string novoValor = Console.ReadLine();

        produtos[indice, 1] = novoNome;
        produtos[indice, 2] = novoValor;

        Console.WriteLine("Produto alterado com sucesso!");
    }

    static void ExcluirProduto()
    {
        Console.Write("Digite o código do produto a ser excluído: ");
        string codigo = Console.ReadLine();

        int indice = EncontrarProduto(codigo);
        if (indice == -1)
        {
            Console.WriteLine("Produto não encontrado.");
            return;
        }

        for (int i = indice; i < totalProdutos - 1; i++)
        {
            produtos[i, 0] = produtos[i + 1, 0];
            produtos[i, 1] = produtos[i + 1, 1];
            produtos[i, 2] = produtos[i + 1, 2];
        }

        totalProdutos--;
        Console.WriteLine("Produto excluído com sucesso!");
    }

    static int EncontrarProduto(string codigo)
    {
        for (int i = 0; i < totalProdutos; i++)
        {
            if (produtos[i, 0] == codigo)
            {
                return i;
            }
        }
        return -1; // Produto não encontrado
    }
}