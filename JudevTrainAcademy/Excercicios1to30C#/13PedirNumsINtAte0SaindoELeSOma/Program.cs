/*

   ATIVIDADE 13 

   Peça diversos Números inteiros , até que seja informado num zero.
*/

//Variável
int numero =0;
int soma = 0;

do{

    //Perguntar um número
    Console.WriteLine("Qual número deseja informar?");
    numero = Convert.ToInt16(Console.ReadLine());

    //Somar 
    soma += numero;

}while(numero != 0);

//Exibir a soma
    Console.WriteLine($"A Soma dos valores é {soma}");
