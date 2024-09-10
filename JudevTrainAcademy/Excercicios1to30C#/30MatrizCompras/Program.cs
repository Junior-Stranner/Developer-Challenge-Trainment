string[,] produtos = {
    {"1", "Notebook Acer" , "4500"},
    {"2", "Teclado Microsoft", "280"},
    {"3", "Mouse HP" , "80"},
    {"4", "MacBook Air M3", "9300"},
    {"5", "Impressora Epson", "540"},
    {"6", "IPad", "7900"},
    {"7", "Notebook ASUS", "4000"},
    {"8", "Teclado Logitech", "170"},
    {"9", "MacBook Pro", "11400"},
    {"10", "MacBook Air M2", "9300"}
};

int codigo = 0;
int soma = 0;

do {
    // Exibir a lista de produtos
    for (int x = 0; x < 10; x++) {
        Console.WriteLine($"{produtos[x, 0]} - {produtos[x, 1]}");
    }

    Console.WriteLine("0 - Finalizar compra");
    codigo = Convert.ToInt16(Console.ReadLine()) - 1;   // Ler o código do produto

    // Verificar se o código é válido e somar o valor
    if (codigo >= 0 && codigo < 10) {
        soma += Convert.ToInt16(produtos[codigo, 2]);
    }

} while (codigo != -1);

// Exibir o total da compra
Console.WriteLine($"Total da compra: R$ {soma}");
