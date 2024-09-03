/* Atividade 1o 

Peça um valor monetário , em seguida escolha o tipo de conversão

Real para Dólar
Dólar para Real

Retornre o valor convertido
*/

Console.WriteLine("Informe um valor");
double valor = Convert.ToDouble(Console.ReadLine());

// Selecionoar o tipo de conversão
Console.WriteLine("Selecione o tipo de conversão");
Console.WriteLine(" 1 - Real para Dólar");
Console.WriteLine(" 2 - Dólar para Real ");
int tipo = Convert.ToInt16(Console.ReadLine());

//Verificação 
if(tipo == 1){
    Console.WriteLine($" Dolar: {valor/5}");

}else{
        Console.WriteLine($" Real: {valor*5}");

}