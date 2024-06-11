//variável
String linguagem = "Java";

//Estrutura de escolha
// switch(linguagem)
// {
//     case "HTML":
//     Console.WriteLine("Linguagem de Marcação.");
//     break;

//     case "CSS":
//     Console.WriteLine("Linguagem de Estilos.");
//     break;

//     case "C#":
//     Console.WriteLine("Linguagem de Programação.");
//     break;
    
//     default:
//     Console.WriteLine("Linguagem descoinhecida.");
//     break;
// }

//expressão Switch
String retorno = linguagem switch
{
    "HTML" => "Linguagem de marcação",
    "CSS" => "Linguagem de Estilos",
    "C#" => "Linguagem de Programação",
    _ => "Linguagem desconhecida",

};