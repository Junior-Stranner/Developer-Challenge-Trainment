/*
   ATIVIDADE 21

 Crie um vetor contendo 5 números Inteiros, percorra o vetor e retorna soma dos valores.
  
*/

//vetor 
int[] numeros = {4,6,9,4,3};

//variável de soma
int soma =0;

//Estrutura de repetição
for(int indice =0; indice <5 ; indice++){
    soma += numeros[indice];
}

Console.WriteLine($"A soma dos valores é {soma}");
