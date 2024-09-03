/*
 ATIVIDADES 23

Peça 5 nomes e adicione caa um em uma posição do vetor

depois exiba cada nome informado

*/

 // Definir o vetor com 5 nomes
        string[] nomes = new string[5];

        // Laço de repetição para solicitar os nomes e armazená-los no vetor
        for (int indice = 0; indice < nomes.Length; indice++)
        {
            // Obter um nome
            Console.WriteLine($"Informe o {indice + 1}º nome:");
            nomes[indice] = Console.ReadLine();
        }

        // Laço de repetição para exibir os nomes armazenados no vetor
        for (int indice = 0; indice < nomes.Length; indice++)
        {
            Console.WriteLine($"{indice + 1}º nome -> {nomes[indice]}");
            Console.WriteLine($"{indice + 1}º nome -> {nomes[indice]}");

        }
