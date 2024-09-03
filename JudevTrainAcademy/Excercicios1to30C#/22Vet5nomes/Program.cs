/*
 ATIVIDADES 22 

  crie um vetor contendi 5 nomes.

  será pedido um nome aleatório, retorne se o nome existe no vetor ou não
*/

// Definir o vetor com 5 nomes
        string[] nomes = string{ "Junior", "Bubu", "Andreia", "Heinz", "Thor" };

        // Obter um nome
        Console.WriteLine("Informe um nome:");
        string? nome = Console.ReadLine();

        // Variável lógica para verificar se o nome existe
        bool existe = false;

        // Laço de repetição para verificar se o nome está no vetor
        for (int indice = 0; indice < nomes.Length; indice++)
        {
            // Condicional para comparar os nomes
            if (nome == nomes[indice])
            {
                existe = true;
                break; // Interrompe o laço se o nome for encontrado
            }
        }

        // Verificar se o nome existe e exibir o resultado
        if (existe)
        {
            Console.WriteLine($"{nome} existe no vetor!");
        }
        else
        {
            Console.WriteLine($"{nome} não foi encontrado!");
        }