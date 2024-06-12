
        // Obter os números do usuário
        Console.WriteLine("Informe o primeiro número:");
        int num1 = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("Informe o segundo número:");
        int num2 = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("Informe o terceiro número:");
        int num3 = Convert.ToInt32(Console.ReadLine());

        int menor = num1;

        if (num2 < menor)
        {
            menor = num2;
        }

        if (num3 < menor)
        {
            menor = num3;
        }
        Console.WriteLine($"O menor número é: {menor}");
