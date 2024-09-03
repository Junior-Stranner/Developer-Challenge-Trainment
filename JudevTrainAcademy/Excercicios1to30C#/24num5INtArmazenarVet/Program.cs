/*
 ATIVIDADES 24

Peça 5 Números Inteiros e armazene no  vetor

Exiba a média dis valores informados e quais números são maioress ou 
iguais a média.
*/

 // Definir o vetor com 5 números
        int[] numeros = new int[5];

        int soma = 0;

        // Laço de repetição para solicitar os nomes e armazená-los no vetor
        for (int indice = 0; indice < nomes.Length; indice++)
        {
            // Obter um nome
            Console.WriteLine("Informe o  nome:");
            numeros[indice] = Convert.ToInt16(Console.ReadLine());

            soma += numeros[indice];
        }

        double media = soma / 5;
        Console.WriteLine($" A média dis valores é : {media}");

        Console.WriteLine("Os números maiores ou iguais a média são :");
       for (int indice = 0; indice < nomes.Length; indice++){
              if(numeros[indice] >= media){
                
                  Console.WriteLine(numeros[indice]);
              }
       }