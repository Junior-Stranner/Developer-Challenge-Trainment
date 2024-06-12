/* ATIVIDADE 05 

 Peça um ano e retorne se é ano bisexto ou não */

 //obter ano 
Console.WriteLine("Digite um ano qualquer ");
int ano = Convert.ToInt16(Console.ReadLine());


//Verificação Ternári   
 Console.WriteLine(ano % 4 == 0 ? " É um ano Bisexto!! " : "Não é ano Bisexto");

if(ano % 4 == 0)
{
    Console.WriteLine("Sim é ano Bisexto!!");
}
else
{
    Console.WriteLine("não é ano Bisexto!!");

}
