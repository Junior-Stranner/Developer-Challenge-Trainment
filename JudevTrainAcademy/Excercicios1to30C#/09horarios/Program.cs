/*  ATIVIDADE 09 

 Peça uma hora referente ao horário de Brasilia (0 até 23).
 Em seguida liste três cidade e peça para * selecionar uma.
 Tendo esses duas informações , retorne i hirário da cidade selecionada.
 
 Alguma cidade e seus respectivos fusos horários:
 Tóquio: +12
 Lisboa: +4
 Paris: +5*/
Console.WriteLine("Informe um horário entre 0 e 23 horas ?");
int hora = Convert.ToInt16(Console.ReadLine());


Console.WriteLine("Selecione uma cidade:");
Console.WriteLine("1) Tóquio ");
Console.WriteLine("2) Lisboa");
Console.WriteLine("3) Paris");
int cidade = Convert.ToInt16(Console.ReadLine());

switch (cidade)
{
    case 1: hora +=12;break;

    case 2: hora +=4;break;

    default: hora +=5;break;
}

//retorno
if(hora > 23)
{
    Console.WriteLine(hora - 24);
}
else
{
        Console.WriteLine(hora);
}


