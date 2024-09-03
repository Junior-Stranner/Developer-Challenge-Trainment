/*
ATIVIDADE 19

 Criar um laço de repetição para exibir 5 valores aleatórios entre 1 e 30.

*/

for(int indice = 0; indice < 5; indice++){



//Gerar número aleatório
Random random = new Random();

//Armazenar um número alearório entre 1 e 30
int numeroAleatorio = random.Next(1,31);

//Verificar se é par ou impar
string tipo = numeroAleatorio %2 == 0 ? "Par" : "Impar";

//Retorno
Console.WriteLine($"{numeroAleatorio} - {tipo}");
}
