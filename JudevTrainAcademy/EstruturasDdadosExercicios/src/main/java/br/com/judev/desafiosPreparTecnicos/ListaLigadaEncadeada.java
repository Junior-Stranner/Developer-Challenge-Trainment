package br.com.judev.desafiosPreparTecnicos;

public class ListaLigadaEncadeada {
    public static void main(String[] args) {
        //Uma lista ligada é uma coleção de elementos onde cada elemento aponta para o próximo.
        // Definição da classe principal LinkedListExample

        // Inicialização da cabeça da lista ligada
        Node head = null;

        // Adiciona elementos à lista ligada
        head = append(head, 1);
        head = append(head, 2);
        head = append(head, 3);

        // Imprime a lista após adições
        System.out.print("Lista após adições: ");
        printList(head);

        // Remove um elemento da lista ligada
        head = remove(head, 2);

        // Imprime a lista após remoção
        System.out.print("Lista após remoção: ");
        printList(head);
    }

    // Definição de um nó da lista ligada
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Função para adicionar um novo nó no final da lista
    public static Node append(Node head, int data) {
        if (head == null) {
            return new Node(data);
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
        return head;
    }

    // Função para remover um elemento da lista ligada
    public static Node remove(Node head, int data) {
        if (head == null) {
            return null;
        }
        if (head.data == data) {
            return head.next;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
        return head;
    }

    // Função para imprimir a lista
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

/*Classe Node dentro do método main:

A definição da classe Node foi movida para dentro do método main como uma classe estática (static class Node). Isso mantém toda a implementação dentro da classe LinkedListExample.
Método append:

Adiciona um novo nó com o valor data no final da lista ligada head.
Método remove:

Remove o nó com o valor data da lista ligada head.
Método printList:

Imprime os elementos da lista ligada a partir da cabeça head.*/



/*Uma lista ligada (ou lista encadeada) é uma estrutura de dados linear que consiste em uma sequência de elementos,
onde cada elemento (nó) contém dois componentes principais:

Dado: A informação armazenada no nó.
Referência (ou ponteiro): Um link para o próximo nó na sequência.
Características principais:
Estrutura dinâmica: Ao contrário de arrays, as listas ligadas não possuem um tamanho fixo. Elas podem crescer e diminuir
 dinamicamente com a adição e remoção de nós.
Inserção e remoção eficientes: Adicionar ou remover elementos pode ser feito de forma eficiente, sem a necessidade de
realocar ou reorganizar a estrutura inteira, como acontece em arrays.
Acesso sequencial: Para acessar um elemento, é necessário percorrer a lista a partir do primeiro nó (cabeça), seguindo os
 ponteiros até chegar ao nó desejado.
Tipos comuns de listas ligadas:
Lista simplesmente ligada: Cada nó aponta para o próximo nó na lista.
Lista duplamente ligada: Cada nó possui dois ponteiros, um apontando para o próximo nó e outro para o nó anterior.
Lista circular: O último nó aponta de volta para o primeiro nó, formando um círculo.
Exemplo visual de uma lista simplesmente ligada:

Cabeça
  |
+-----+------+
|  1  |   o----->  +-----+------+
+-----+------+     |  2  |   o----->  +-----+------+
                   +-----+------+     |  3  | null |
                                      +-----+------+
Neste exemplo, o primeiro nó contém o valor 1 e um ponteiro para o segundo nó, que contém o valor 2 e um ponteiro para o terceiro nó, que contém o valor 3 e um ponteiro nulo (indicando o fim da lista).*/