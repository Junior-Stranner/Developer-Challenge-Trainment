// Criação e preenchimento da matriz 5x5 com valores pré-definidos
int[,] matriz = {
    {5, 1, 4, 1, 1},
    {2, 7, 2, 3, 2},
    {2, 3, 9, 3, 5},
    {4, 9, 4, 8, 4},
    {1, 5, 6, 5, 5}
};

int somarTodaMatriz = 0;
int somaDiagonalPrincipal = 0;
int somaDiagonalSecundaria = 0;

for (int x = 0; x < 5; x++)
{
    for (int y = 0; y < 5; y++) 
    {
        Console.Write(matriz[x, y] + " ");
        somarTodaMatriz += matriz[x, y]; 

        // Soma dos elementos da diagonal principal
        if (x == y)
        {
            somaDiagonalPrincipal += matriz[x, y];
        }

        // Soma dos elementos da diagonal secundária
        if (x + y == 4)
        {
            somaDiagonalSecundaria += matriz[x, y];
        }
    }
    Console.WriteLine(); 
}

// Exibindo as somas
Console.WriteLine($"A soma de todos os elementos da matriz é: {somarTodaMatriz}");
Console.WriteLine($"A soma da diagonal principal é: {somaDiagonalPrincipal}");
Console.WriteLine($"A soma da diagonal secundária é: {somaDiagonalSecundaria}");
