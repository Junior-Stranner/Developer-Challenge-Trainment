/*  ATIVIDADE 09 

   Peça três lados de um Triângulo e retorne o seu tipo 
   
   Equilátero : todos os lados congruentes;
   Isósceles : dois lados congruentes;
   Escaleno : todos os lados com medidas distintas;*/

Console.WriteLine("Informe o lado Direito");
int ladoDireito = Convert.ToInt16(Console.ReadLine());

Console.WriteLine("Informe o lado inferiror");
int ladoinferiror = Convert.ToInt16(Console.ReadLine());

Console.WriteLine("Informe o lado Esquerdo");
int ladoEsquerdo= Convert.ToInt16(Console.ReadLine());

if(ladoDireito == ladoinferiror && ladoinferiror == ladoEsquerdo)
{
    Console.WriteLine("Equilátero ");
}
else if(ladoDireito == ladoinferiror || ladoDireito == ladoEsquerdo || ladoinferiror == ladoEsquerdo)
{
        Console.WriteLine("Isóciles ");
}
else{
        Console.WriteLine("Escaleno ");
}

/*  OU 

 // Determinar o tipo de triângulo usando operadores ternários
        string tipoTriangulo = (ladoDireito == ladoInferior && ladoInferior == ladoEsquerdo) ? "Equilátero" :
                               (ladoDireito == ladoInferior || ladoDireito == ladoEsquerdo || ladoInferior == ladoEsquerdo) ? "Isósceles" :
                               "Escaleno";

        // Exibir o tipo de triângulo
        Console.WriteLine($"O triângulo é {tipoTriangulo}");*/