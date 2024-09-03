/*
ATIVIDADE 11
  Peça um número Inteiro, em seguida retorne a tabuada.
*/

Console.WriteLine("Digite um Valor");
int valor =  Convert.ToInt16(Console.ReadLine());

for(int i =1 ; i <=10 ; i++){
    Console.WriteLine($"{valor} X {i} = {valor * i}");
}
