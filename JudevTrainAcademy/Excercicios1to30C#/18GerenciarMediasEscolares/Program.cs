/*
  ATIVIDADE 18 
  
  Desenvolva um sistema para gerenciar médias escolares.

  Em uma estrutura de repetição peça duas notas.
  
  Após obter as notas , retorne a média e a situação (>=7 aprovado e <7 reprovado).

  Depois de exibir a média e a situação, pergunte se deseja cadastrar mais algum aluno.

  quando sair do lço de repetição, exiba a quantidade de alunos aprovados e reprovados.
*/

 do
        {
            // Solicita as duas notas do aluno
            Console.WriteLine("Informe a primeira nota:");
            double nota1 = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Informe a segunda nota:");
            double nota2 = Convert.ToDouble(Console.ReadLine());

            // Calcula a média
            double media = (nota1 + nota2) / 2;
            Console.WriteLine($"Média do aluno: {media}");

            // Verifica a situação do aluno
            if (media >= 7)
            {
                Console.WriteLine("Situação: Aprovado");
                aprovados++;
            }
            else
            {
                Console.WriteLine("Situação: Reprovado");
                reprovados++;
            }

            // Pergunta se deseja continuar
            Console.WriteLine("Deseja cadastrar mais algum aluno? (s/n)");
            continuar = Console.ReadLine().ToLower();

        } while (continuar == "s");

        // Exibe o total de alunos aprovados e reprovados
        Console.WriteLine($"Quantidade de alunos aprovados: {aprovados}");
        Console.WriteLine($"Quantidade de alunos reprovados: {reprovados}");
