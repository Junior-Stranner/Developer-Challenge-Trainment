/*
   ATIVIDADE 12 

   Peça um nome até que seha informado o termo "sair"
*/

//Variável

string ?nome;

do{
    Console.WriteLine("Informe um nome");
     nome =  Console.ReadLine();

}while(nome != "sair");