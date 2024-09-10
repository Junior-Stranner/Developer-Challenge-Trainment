/* 
ATIVIDADE 30 
 Desenvolva um sistema para efetuar compras.

 Haverá uma Matriz 10X3 contendo> código , nome do prodto e balor.

 em uma estrutura de repetição, peça o código do produto que deseja adquirir.

 Enquanto não for informado o código zero , peça para selecionar 

 quando informado o código zero, exiba o total da compra.
*/

string[,] produtos = {
    {"1", "Notebook Acer" , "4500"},
    {"2", "Teclado Microsoft", "280"},
    {"3", "Mous HP" , "80"},
    {"4", "MacBook Air M3", "9300"},
    {"5", "Impresora Epson", "540",},
    {"6", "IPad", "7900"},
    {"7", "Notebook ASUS", "4000"},
    {"8", "Teclado Logitech", "170"},
    {"9", "MacBook Pro", "11400"},
    {"10","MacBook Air M2", "9300"}
};

int codigo =0;
int soma = 0;

do{

   for (int x = 0; x < 10; x++) // Percorre as linhas (horizontalmente)
{
    Console.WriteLine($"{produtos[x,0]} - {produtos[x,1]}")
}
    Console.WriteLine("0 - Finalizar uma compra");

    codigo = Convert.ToInt16(Console.ReadLine()) -1;

    // soma
    if (codigo >= 0 && codigo < 10) {
     soma +=Convert.ToInt16(produtos[codigo,2]);
 }

}while(codigo != 1);

//Total da compra
Console.WriteLine($"Total da compa{soma}")