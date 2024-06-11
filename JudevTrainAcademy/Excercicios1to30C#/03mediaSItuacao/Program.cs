/*
     ATIVIDADE 03

      Peça duas notas, em seguida realize a média e retorne a situação

      7 - 10: Aprovado(a)
      5 - 6.9: Recuperação
      0 - 4.9: Reprovado(a)
*/
Console.WriteLine("Informe a Primeira nota ");
double nota1 = Convert.ToDouble(Console.ReadLine());

Console.WriteLine("Informe a segunda nota ");
double nota2 = Convert.ToDouble(Console.ReadLine());

double media = (nota1 + nota2) /2;

  if (media >= 7)
        {
           Console.WriteLine("Aprovado(a) com media {media}");
        }
        else if (media >= 5)
        {
           Console.WriteLine("Recuperação com media {media}");
        }
        else
        {
           Console.WriteLine("Reprovado(a) com media {media}");
        }
