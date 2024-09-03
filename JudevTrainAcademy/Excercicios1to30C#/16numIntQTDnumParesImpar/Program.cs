/*
ATIVIDADE 16 

Peça um número inteiro, em seguida crie uma estrutura de repetição 
que deverá iniciar pelo número 1 e finalizar peli número infoemado.

Retorne a quantidade de números pares e impares entre is valores.

Exemplo: Se informado o número 5 , o laço irá percorrer os valores
1,2,3,4 e 5

Retornando 2 pares e 3 impares
*/

int pares = 0;
int impares = 0;

     Console.WriteLine("Informe o Número");
     int num = Convert.ToInt16(Console.ReadLine());

//Estrutura de repetição
for (int i = 1; i <= num; i++){ 
        //Condicional
        if(i % 2 == 0){
            pares++;
        }else{
           impares++;
        }
     }

     Console.WriteLine("Número pares: "+pares );
     Console.WriteLine("Número Impares: "+impares );