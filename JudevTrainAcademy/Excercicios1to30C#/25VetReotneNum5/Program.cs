// Atividade 25
// Peça cinco números inteiros e armazene cada um no vetor.
// Depois de armazenar os valores, exiba cada posição onde o número seja igual a cinco.
// Caso não seja informado nenhum número 5, retorne: "O número 5 não foi encontrado".

int[] numeros = new int[5];

// Variável lógica para verificar se o número 5 foi encontrado
bool existeNum5 = false;

// Ler cinco números do usuário e armazenar no vetor
for (int indice = 0; indice < 5; indice++)
{
    Console.WriteLine("Informe um número:");
    numeros[indice] = Convert.ToInt32(Console.ReadLine());
}

// Verificar se o número 5 foi inserido no vetor
for (int indice = 0; indice < 5; indice++)
{
    if (numeros[indice] == 5)
    {
        Console.WriteLine($"O número 5 está na posição {indice+1}");
        existeNum5 = true;
    }
}

// Caso o número 5 não tenha sido encontrado
if (!existeNum5)
{
    Console.WriteLine("O número 5 não foi encontrado");
}
