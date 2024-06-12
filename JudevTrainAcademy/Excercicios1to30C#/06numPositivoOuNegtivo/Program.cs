/*  ATIVIDADE 06

Peça um número inteiro , retorne se é um número positivo , neutro ou negativo
*/

Console.WriteLine("Informe um número ");
int num = Convert.ToInt16(Console.ReadLine());

        if (num > 0)
        {
            Console.WriteLine($"Número Positivo: {num}");
        }
        else if (num == 0)
        {
            Console.WriteLine($"Número Neutro: {num}");
        }
        else
        {
            Console.WriteLine($"Número Negativo: {num}");
        }

