/*
ATIVIDADE 15 

 Será gerado aleatóriamente um número entre 1 e 10.
 Enquanto o usuário não oferecer o número , peça para informar um valor.
*/

//Gerar número aleatório
Random random = new Random();

//Armazenar um número alearório entre 1 e 10
int numeroAleatorio = random.Next(1,11);

//Exibir o número aleatorio
Console.WriteLine(numeroAleatorio);

int palpite = 0;

//Estrutura de repetição
do{

     Console.WriteLine("Informe o Número");
     palpite = Convert.ToInt16(Console.ReadLine());

}while( palpite != numeroAleatorio);

