/*  ATIVIDADE 02 

Peça um número e retorne se e par ou impar .

DICA: para sabermos se um número é par ou impar, será necessário 
ultilizamos o módulo (resti da divisão -> %)*/

//Obter um número
Console.WriteLine("Informe um número ");
int num = Convert.ToInt16(Console.ReadLine());

//Verificação 
Console.WriteLine(num % 2 == 0 ? "Par " : "Impar");
