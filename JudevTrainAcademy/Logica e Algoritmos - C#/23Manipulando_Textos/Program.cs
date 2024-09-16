// Exemplo 1: Declarando uma string
string nome = "Ralf";

// Exemplo 2: Concatenando strings
string sobrenome = "Lima";
string nomeCompleto = nome + " " + sobrenome;

// Exemplo 3: Interpolação de strings
string mensagem = $"Olá, {nome} {sobrenome}!";

// Exemplo 4: Comparando strings
string senhaDigitada = "senha123";
string senhaCorreta = "senha123";
bool senhasIguais = senhaDigitada == senhaCorreta;

// Exemplo 5: Obtendo o comprimento da string
int comprimentoNome = nome.Length;

// Exemplo 6: Convertendo uma string para maiúsculas
string nomeMaiusculo = nome.ToUpper();

// Exemplo 7: Convertendo uma string para minúsculas
string sobrenomeMinusculo = sobrenome.ToLower();

// Exemplo 8: Removendo espaços em branco do início e do fim da string
string texto = "   Exemplo de texto com espaços em branco   ";
string textoSemEspacos = texto.Trim();

// Exemplo 9: Dividindo uma string em partes com base em um delimitador
string frase = "Esta é uma frase de exemplo";
string[] palavras = frase.Split(' ');

// Exemplo 10: Substituindo parte de uma string por outra
string textoOriginal = "O cachorro é um animal fiel";
string textoEditado = textoOriginal.Replace("cachorro", "gato");

// Exemplo 11: Verificando se uma string começa com determinado texto
bool comecaCom = textoOriginal.StartsWith("O cachorro");

// Exemplo 12: Verificando se uma string termina com determinado texto
bool terminaCom = textoOriginal.EndsWith("fiel");

// Exemplo 13: Buscando a posição de um caractere ou substring dentro de uma string
int posicao = textoOriginal.IndexOf("animal");

// Exemplo 14: Verificando se uma string está vazia
bool stringVazia = string.IsNullOrEmpty(texto);

// Exemplo 15: Comparando strings sem diferenciar maiúsculas de minúsculas
bool mesmoTexto = textoOriginal.Equals("o cachorro é um animal fiel", StringComparison.OrdinalIgnoreCase);

// Exemplo 16: Adicionando texto no início de uma string
string novoTexto = textoOriginal.Insert(0, "Querido dono, ");

// Exemplo 17: Removendo parte de uma string
string textoSemAnimal = textoOriginal.Remove(0, 11); // Remove os caracteres a partir da posição 0 e vai até a posição 11.

// Exemplo 18: Repetindo uma string várias vezes
string repeticao = new string('*', 5);

// Exemplo 19: Convertendo uma string para um array de caracteres
char[] caracteres = textoOriginal.ToCharArray();

// Exemplo 20: Formatando um número com duas casas decimais
double salario = 2500;
string salarioFormatado = salario.ToString("N2"); // N-> Número | 2-> Quantidade de casas decimais