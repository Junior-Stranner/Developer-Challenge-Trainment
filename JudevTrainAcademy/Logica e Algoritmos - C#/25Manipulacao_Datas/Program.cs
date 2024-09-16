// Exemplo 1: Obtendo a data e hora atual
DateTime agora = DateTime.Now;

// Exemplo 2: Obtendo apenas a data atual
DateTime dataAtual = DateTime.Today;

// Exemplo 3: Obtendo apenas a hora atual
TimeSpan horaAtual = DateTime.Now.TimeOfDay;

// Exemplo 4: Adicionando dias a uma data
DateTime dataFutura = agora.AddDays(7);

// Exemplo 5: Subtraindo dias de uma data
DateTime dataPassada = agora.AddDays(-7);

// Exemplo 6: Adicionando horas a uma hora
DateTime horaFutura = agora.AddHours(3);

// Exemplo 7: Subtraindo horas de uma hora
DateTime horaPassada = agora.AddHours(-3);

// Exemplo 8: Obtendo o dia da semana de uma data
DayOfWeek diaDaSemana = agora.DayOfWeek;

// Exemplo 9: Obtendo o mês de uma data
int mes = agora.Month;

// Exemplo 10: Obtendo o ano de uma data
int ano = agora.Year;

// Exemplo 11: Verificando se um ano é bissexto
bool bissexto = DateTime.IsLeapYear(ano);

// Exemplo 12: Calculando a diferença entre duas datas
TimeSpan diferencaDatas = dataFutura - dataAtual;

// Exemplo 13: Verificando se uma data está no passado
bool noPassado = dataPassada < agora;

// Exemplo 14: Verificando se uma data está no futuro
bool noFuturo = dataFutura > agora;

// Exemplo 15: Formatando uma data para uma string
string dataFormatada = agora.ToString("dd/MM/yyyy");

// Exemplo 16: Obtendo a data e hora em um fuso horário específico
TimeZoneInfo fusoHorario = TimeZoneInfo.FindSystemTimeZoneById("E. South America Standard Time");
DateTime horaNoFusoHorario = TimeZoneInfo.ConvertTime(agora, fusoHorario);

// Exemplo 17: Obtendo o número de dias em um mês específico
int diasNoMes = DateTime.DaysInMonth(ano, mes);

// Exemplo 18: Adicionando meses a uma data
DateTime dataNoFuturo = agora.AddMonths(3);

// Exemplo 19: Adicionando anos a uma data
DateTime dataDaquiA5Anos = agora.AddYears(5);

// Exemplo 20: Calculando a idade a partir da data de nascimento
DateTime dataNascimento = new DateTime(1990, 5, 15);
int idade = agora.Year - dataNascimento.Year;