try
{
    Console.WriteLine("Informe um número");
    int numero = COnvert.ToInt16(Console.ReadLine());
}
catch(Exception erro)
{
        Console.WriteLine("Ouvi uma falha!" +erro.Message);
}
finally
{
      Console.WriteLine("Sistema Finalizado !");
}
