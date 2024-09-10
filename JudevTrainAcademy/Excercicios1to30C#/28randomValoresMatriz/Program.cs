/*
  ATIVIDADE 28

  Utilizando a estrutura Random, gere valores entre 0 e 9
  e cadastre em uma matriz 5x5.

  Quando a matriz for devidamente preenchida, exiba a estrutura dela.
*/

// Definir a matriz 5x5
int[,] matriz = new int[5, 5];

// Instanciar o gerador de números aleatórios fora do loop
Random random = new Random();

// Preencher a matriz com números aleatórios entre 0 e 9
for (int x = 0; x < 5; x++) // Percorre as linhas
{
    for (int y = 0; y < 5; y++) // Percorre as colunas
    {
        matriz[x, y] = random.Next(0, 10);
    }
}

// Exibir a matriz preenchida
for (int x = 0; x < 5; x++) // Percorre as linhas
{
    for (int y = 0; y < 5; y++) // Percorre as colunas
    {
        Console.Write(matriz[x, y] + " ");

    }
    
    Console.WriteLine();// Quebra de linha para a próxima linha da matriz
}
