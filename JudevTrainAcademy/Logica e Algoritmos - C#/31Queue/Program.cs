/*
    A classe Queue em C# é uma estrutura de dados que representa uma fila, 
    seguindo o princípio FIFO (First-In-First-Out). 
    
    Isso significa que o primeiro elemento adicionado 
    à fila será o primeiro a ser removido. 
    
    A fila em C# é útil em situações em que você precisa 
    processar itens na ordem em que foram adicionados.
*/

// Referenciar o System.Collections
using System.Collections;

// Criar Fila
Queue minhaFila = new Queue();

// Adicionando elementos à fila
minhaFila.Enqueue("Primeiro");
minhaFila.Enqueue("Segundo");
minhaFila.Enqueue("Terceiro");

// Realizar a remoção do elemento e retornar o valor.
Console.WriteLine($"Elemento removido: {minhaFila.Dequeue()}");

// Informa qual é o primeiro elemento da lista
Console.WriteLine($"Próximo elemento: {minhaFila.Peek()}");

// Realiza a contagem de registros
Console.WriteLine(minhaFila.Count);
