/*
  ATIVIDADE 17 

  Crie um sistema de votação.

  Haverá quatro opções para o eleitor escolher, sendo três candidatos e uma opção 
  
  para finalizar a votação, exemplo:
  1) ANa
  2) Ronson
  3) Evandro
  4)sair

  Quando finalizar a votação, exiba a quantidade de votos de cada candidato.

*/
int ana =0;
int robson =0;
int evandro =0;
int voto=0;

//Estrutura de repetição

do{
    Console.WriteLine("Selecione uma opção")
    Console.WriteLine("1 - Ana")
    Console.WriteLine("2 - Robson")
    Console.WriteLine("3 - Evandro")
    Console.WriteLine("4 - Sair")
    voto = Convert.ToInt16(Console.ReadLine());

    switch(voto){
        case 1: ana++;break;
        case 2: robson++;break;
        case 3: evandro++;break;
        case 4:     Console.WriteLine("Saindo ...")break;
    }

}while(voto != 4);

    Console.WriteLine($"Ana obteve: {ana}  voto(s)")
    Console.WriteLine($"Robson obteve: {robson}  voto(s)")
    Console.WriteLine($"Evandro obteve: {evandro}  voto(s)")
