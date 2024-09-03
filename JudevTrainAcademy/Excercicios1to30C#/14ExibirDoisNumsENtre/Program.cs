/*
  ATIVIDADE 14 

  Peça dois números , em seguida exiba is vakores entre os números

  Exemplo : Se informados 2 e 5 , o retorno será 2 3 4 5.
*/

//Obter o primeiro número
    Console.WriteLine("Informe o Primeiro número ?");
    int numero1 = Convert.ToInt16(Console.ReadLine());
    Console.WriteLine("Informe o Segundo número ?");
    int numero2 = Convert.ToInt16(Console.ReadLine());


if(numero1 < numero2){
    while(numero1 <= numero2){

        Console.WriteLine(numero1);
        numero1++;
    }
}else{
     while(numero1 >= numero2){

        Console.WriteLine(numero1);
        numero1--;
    }
}