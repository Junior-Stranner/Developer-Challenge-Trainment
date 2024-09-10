// Matriz de dados (nomes e cidades)
string[,] dados = {
    {"Junior", "Laguna"},
    {"Vitor", "Balneário"},
    {"Selmita", "Petrópolis"},
    {"Andreia", "Laguna"}
};

// Exibir o primeiro dado específico
Console.WriteLine("Dado específico: " + dados[0,0]);

// Exibir todos os dados usando 'foreach'
Console.WriteLine("\nExibindo todos os dados usando 'foreach':");
foreach (string dado in dados)
{
    Console.WriteLine(dado);
}

// Exibir dados de forma estruturada com dois loops 'for' aninhados
Console.WriteLine("\nExibindo dados de forma estruturada:");
for (int x = 0; x < dados.GetLength(0); x++) // Percorre as linhas
{
    for (int y = 0; y < dados.GetLength(1); y++) // Percorre as colunas
    {
        Console.Write(dados[x, y] + " ");
    }
    Console.WriteLine(); // Quebra de linha após cada linha de dados
}
