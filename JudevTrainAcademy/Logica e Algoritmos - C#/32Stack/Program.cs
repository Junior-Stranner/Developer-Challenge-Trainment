/*
    É uma estrutura de dados do tipo pilha que segue o 
    princípio LIFO (Last In, First Out).
    
    O último elemento inserido é o primeiro a ser removido. 
*/

// Criando uma pilha
Stack<string> minhaPilha = new Stack<string>();

// Adicionando elementos à pilha
minhaPilha.Push("Elemento 1");
minhaPilha.Push("Elemento 2");
minhaPilha.Push("Elemento 3");

// Removendo um elemento
string elementoRemovido = minhaPilha.Pop();
Console.WriteLine($"Elemento removido: {elementoRemovido}");

// Contando o número de elementos
Console.WriteLine($"Número de elementos na pilha: {minhaPilha.Count}");