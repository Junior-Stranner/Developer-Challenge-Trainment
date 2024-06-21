package br.com.judev.desafiosPreparTecnicos;

public class Arvore {

    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class BinaryTree {
        TreeNode root;

        BinaryTree() {
            root = null;
        }

        // Método para percorrer a árvore em ordem (in-order traversal)
        void inOrder(TreeNode node) {
            if (node != null) {
                inOrder(node.left);
                System.out.print(node.data + " ");
                inOrder(node.right);
            }
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da árvore binária
        BinaryTree tree = new BinaryTree();

        // Construindo a árvore
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        // Imprimindo a árvore em ordem
        System.out.print("Árvore em ordem: ");
        tree.inOrder(tree.root);  // Output: 4 2 5 1 3
    }
}

/*Classe TreeNode: Representa um nó na árvore binária, com um valor inteiro (data)
 e referências para os nós filhos esquerdo e direito (left e right).

Classe BinaryTree: Representa a árvore binária em si, com um nó raiz (root)
e métodos para operar na árvore, como inOrder para percorrer a árvore em ordem.

Método inOrder: Realiza a travessia da árvore em ordem (in-order traversal),
 que imprime os nós da árvore na sequência esquerda-raiz-direita.

Método main: Cria uma instância da árvore binária, constrói a árvore com
alguns nós e imprime os valores dos nós em ordem usando o método inOrder.*/
