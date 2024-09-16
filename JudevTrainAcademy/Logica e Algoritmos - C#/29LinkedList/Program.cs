// Criando uma nova LinkedList
LinkedList<string> nomes = new LinkedList<string>();

// Adicionando elementos à LinkedList
nomes.AddLast("Ralf");
nomes.AddLast("Estella");
nomes.AddLast("Stephanie");

// Exibindo os elementos da LinkedList
Console.WriteLine("Elementos contidos na lista:");
foreach (var item in nomes)
{
    Console.WriteLine(item);
}

/*
    Características:
    
    1ª Encadeamento Duplo: Cada nó na lista tem uma referência tanto para o 
    próximo nó quanto para o nó anterior. 


    2ª Inserção e Remoção Eficientes: Inserir ou remover elementos no início, no 
    final ou em qualquer posição da lista é eficiente, pois não requer realocação de elementos.


    3ª Acesso Sequencial: O acesso aos elementos da lista é sequencial, o que significa
    que para acessar um elemento em uma posição específica, você precisa percorrer a 
    lista a partir do início ou do final até chegar ao elemento desejado.

*/