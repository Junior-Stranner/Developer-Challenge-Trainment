//Matriz 
String[,] dados = {{"Junior","Laguna"},{"Vitor","Balenário"},{"Selmita", "Petrópolis"},{"Andreia","Laguna"}};

//Exibir dados
Console.WriteLine(dados[0,0]);

//Exibir dados
foreach (String dado in dados)
{
    Console.WriteLine(dado );
}

// Melhor forma: usando dois loops for aninhados para exibir dados de forma estruturada
for (int x = 0; x < dados.GetLength(0); x++) // Percorre as linhas
{
    for (int y = 0; y < dados.GetLength(1); y++) // Percorre as colunas
    {
        Console.Write(dados[x, y] + " ");
    }
    Console.WriteLine(); // Quebra de linha para a próxima linha da matriz
}