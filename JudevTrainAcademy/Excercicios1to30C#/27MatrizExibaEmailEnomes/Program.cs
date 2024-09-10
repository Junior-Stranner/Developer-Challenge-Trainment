/*
 Atividade 27 

 Crie uma matriz (3x2) e peça para o Usuário 
 informar três nomes e três e-mails.

 Depois de realizar o cadastro, exiba as informações.
 */

string[,] dados = new string[3, 2];

// Obter os dados
for (int x = 0; x < 3; x++) // Percorre as linhas
{
    Console.WriteLine("Informe o nome do Usuário: ");
    dados[x, 0] = Console.ReadLine(); // Armazena o nome na coluna 0

    Console.WriteLine("Informe o e-mail do Usuário: ");
    dados[x, 1] = Console.ReadLine(); // Armazena o e-mail na coluna 1
}

// Exibir os dados obtidos
Console.WriteLine("\nDados cadastrados:");
for (int indice = 0; indice < 3; indice++) 
{
    Console.WriteLine($"Usuário {indice + 1}: Nome: {dados[indice, 0]}, E-mail: {dados[indice, 1]}");
}
