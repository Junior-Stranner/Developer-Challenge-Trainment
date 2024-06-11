//variáveis 
using System.Data.Common;

double valor = 500;
String pagamento = "a vista";

//condicional 
if(valor >= 100 && pagamento == "a vista")
{
    Console.WriteLine($"Desconto de 10%! Total a pagar RS{valor*0.9}");
}
else{
     Console.WriteLine($"O total da compra é RS{valor}");
}