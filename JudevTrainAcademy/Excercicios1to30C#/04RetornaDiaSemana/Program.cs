/* ATIVIDADE 04 

Peça um dia de um determinado mês/ano , retorne o dia da semana.
Observando: Neste exercicio será utilizado como base o calendário de maio de 2024
*/

//Obter o dia 
Console.WriteLine("Informe o dia do mês de maio de 2024");
int dia = Convert.ToInt16(Console.ReadLine());

//verificação
if(dia == 6 || dia == 13 || dia == 20 || dia == 27)
{
    Console.WriteLine("Segunda-feira");
}
else if(dia == 7 || dia == 14 || dia == 21 || dia == 28)
{
    Console.WriteLine("Terça-feira");
}
else if(dia == 1 || dia == 8 || dia == 15 || dia == 22 || dia == 29)
{
    Console.WriteLine("Quarta-feira");
}
else if(dia == 2 || dia == 9 || dia == 16 || dia == 23 || dia == 30)
{
    Console.WriteLine("Quinta-feira");
}
else if(dia == 3 || dia == 10 || dia == 17 || dia == 24 || dia == 31)
{
    Console.WriteLine("Sexta-feira");
}
else if(dia == 4 || dia == 11 || dia == 18 || dia == 25 )
{
    Console.WriteLine("Sábado");
}
else if(dia == 5 || dia == 12 || dia == 19 || dia == 26 )
{
    Console.WriteLine("Domingo");
}
else
{
    Console.WriteLine("Dia Inválido");
}


// Obter o dia
        Console.WriteLine("Informe o dia do mês de maio de 2024");
        int diaa = Convert.ToInt16(Console.ReadLine());

        // Verificação da validade do dia
        if (diaa < 1 || diaa > 31)
        {
            Console.WriteLine("Dia Inválido");
        }
        else
        {
            // Criação do objeto DateTime para o dia informado
            DateTime data = new DateTime(2024, 5, diaa);

            // Obtendo o dia da semana
            string diaDaSemana = data.DayOfWeek.ToString();

            // Traduzindo o dia da semana para português
            switch (diaDaSemana)
            {
                case "Monday":
                    diaDaSemana = "Segunda-feira";
                    break;
                case "Tuesday":
                    diaDaSemana = "Terça-feira";
                    break;
                case "Wednesday":
                    diaDaSemana = "Quarta-feira";
                    break;
                case "Thursday":
                    diaDaSemana = "Quinta-feira";
                    break;
                case "Friday":
                    diaDaSemana = "Sexta-feira";
                    break;
                case "Saturday":
                    diaDaSemana = "Sábado";
                    break;
                case "Sunday":
                    diaDaSemana = "Domingo";
                    break;
            }
            Console.WriteLine(diaDaSemana);
        }