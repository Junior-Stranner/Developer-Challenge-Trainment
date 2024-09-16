// Exemplo 1: Declarando números inteiros
int numero1 = 10;
int numero2 = 20;

// Exemplo 2: Somando dois números
int soma = numero1 + numero2;

// Exemplo 3: Subtraindo dois números
int diferenca = numero2 - numero1;

// Exemplo 4: Multiplicando dois números
int resultado = numero1 * numero2;

// Exemplo 5: Dividindo dois números
int quociente = numero2 / numero1;

// Exemplo 6: Obtendo o resto da divisão entre dois números
int resto = numero2 % numero1;

// Exemplo 7: Verificando se um número é par
bool par = numero1 % 2 == 0;

// Exemplo 8: Verificando se um número é ímpar
bool impar = numero2 % 2 != 0;

// Exemplo 9: Obtendo o maior número entre dois números
int maiorNumero = Math.Max(numero1, numero2);

// Exemplo 10: Obtendo o menor número entre dois números
int menorNumero = Math.Min(numero1, numero2);

// Exemplo 11: Calculando uma potência
double resultadoPotencia = Math.Pow(numero1, 2);

// Exemplo 12: Arredondando um número para cima
double numeroDecimal = 3.7;
double numeroArredondadoParaCima = Math.Ceiling(numeroDecimal);

// Exemplo 13: Arredondando um número para baixo
double numeroArredondadoParaBaixo = Math.Floor(numeroDecimal);

// Exemplo 14: Arredondando um número
double numeroArredondado = Math.Round(numeroDecimal);

// Exemplo 15: Obtendo o valor absoluto de um número
int numeroNegativo = -5;
int valorAbsoluto = Math.Abs(numeroNegativo);

// Exemplo 16: Gerando um número aleatório
Random random = new Random();
int numeroAleatorio = random.Next(1, 101); // Número aleatório entre 1 e 100

// Exemplo 17: Convertendo um número para uma string
string numeroString = numero1.ToString();

// Exemplo 18: Convertendo uma string para um número
int numeroConvertido = int.Parse("25");

// Exemplo 19: Limitando o número de casas decimais
double numeroComMaisCasasDecimais = 3.141592653589793238;
double numeroComDuasCasasDecimais = Math.Round(numeroComMaisCasasDecimais, 2);

// Exemplo 20: Obtendo o valor da constante Pi
double pi = Math.PI;
Console.WriteLine(pi);