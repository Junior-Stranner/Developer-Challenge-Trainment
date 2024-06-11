/*  ATIVIDADE 1 

  Peça dois números inteiros, se forem iguais realize a soma , se forem
  diferentes realize a multiplicação.
*/ 

//Obter o primeiro valor
Console.WriteLine("Informe o primeiro número ");
int num1 = Convert.ToInt16(Console.ReadLine());

//Obter o segundo valor
Console.WriteLine("Informe o segundo número ");
int num2 = Convert.ToInt16(Console.ReadLine());

//Condicional Simples
if(num1 == num2)
{
    Console.WriteLine(num1 + num2);
}
else
{
    Console.WriteLine(num1 * num2);

}

/* OU 

OPERADOR TERNÁRIO */

int resultado = (num1 == num2) ? (num1 + num2) : (num1 * num2);

Console.WriteLine("O resultado é: " + resultado);
