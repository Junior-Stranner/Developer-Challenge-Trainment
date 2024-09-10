/*
   Atividade 26 

   Crie uma matriz (3x3) contendo valores numéricos inteiros.

   Exiba o valor contido na matriz e a soma dos valores.
*/

// Definir a matriz 3x3 com valores numéricos inteiros
int[,] numeros = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Variável para armazenar a soma dos valores
int soma = 0;

// Exibir a estrutura da matriz e calcular a soma dos valores
for (int x = 0; x < 3; x++) // Percorre as linhas
{
    for (int y = 0; y < 3; y++) // Percorre as colunas
    {
        Console.Write(numeros[x, y] + " "); // Exibe o valor atual
        soma += numeros[x, y]; // Soma o valor atual
    }
    Console.WriteLine(); // Quebra de linha para a próxima linha da matriz
}

// Exibir a soma total dos valores
Console.WriteLine($"A soma dos valores da matriz é: {soma}");


// Definir a matriz 3x3 com valores numéricos inteiros
int[,] numeros = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Exibir a matriz original e somar cada elemento com ele mesmo
for (int x = 0; x < 3; x++) // Percorre as linhas
{
    for (int y = 0; y < 3; y++) // Percorre as colunas
    {
        numeros[x, y] += numeros[x, y]; // Soma o valor atual com ele mesmo
        Console.Write(numeros[x, y] + " "); // Exibe o novo valor
    }
    Console.WriteLine(); // Quebra de linha para a próxima linha da matriz
}
