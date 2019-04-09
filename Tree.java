package com.silva.app;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    public static void main(String[] args) {
        // Creating the nodes of tree
        Node<String> A = new Node<>("A");
        Node<String> B = new Node<>("B");
        Node<String> C = new Node<>("C");
        Node<String> D = new Node<>("D");
        Node<String> E = new Node<>("E");
        Node<String> F = new Node<>("F");
        Node<String> G = new Node<>("G");
        Node<String> H = new Node<>("H");
        Node<String> I = new Node<>("I");
        Node<String> J = new Node<>("J");
        Node<String> K = new Node<>("K");

        // Defining root node and building of the tree
        Node<String> root = A;
        A.setLeft(B); A.setRight(C);
        B.setLeft(D); B.setRight(E);
        C.setLeft(F); C.setRight(G);
        D.setLeft(H); D.setRight(I);
        E.setLeft(J);
        G.setLeft(K);

        System.out.println("Pre Order Traversal with Recursion:\n");
        preOrderTraverse(A);
        System.out.println("\nOrder Traversal with Recursion:\n");
        orderTraverse(A);
        System.out.println("\nPost Order Traversal with Recursion:\n");
        postOrderTraverse(A);
        System.out.println("\nLevel Order Traversal with Recursion:\n");
        levelOrderTraverse(A);
    }

    // Start with pre order traversal with recursion
    static <T> void preOrderTraverse(Node<T> node) {
        if(node == null)
            return;

        System.out.print(node.getData() + " \t");
        preOrderTraverse(node.getLeft());
        preOrderTraverse(node.getRight());
    }

    // Start with order traversal with recursion
    static <T> void orderTraverse(Node<T> node) {
        if(node == null)
            return;
        orderTraverse(node.getLeft());
        System.out.print(node.getData() + " \t");
        orderTraverse(node.getRight());
    }

    // Start with post order traversal with recursion
    static <T> void postOrderTraverse(Node<T> node) {
        if(node == null)
            return;
        postOrderTraverse(node.getLeft());
        postOrderTraverse(node.getRight());
        System.out.print(node.getData() + " \t");
    }

    // Start with level order traversal with recursion
    static <T> void levelOrderTraverse(Node<T> node) {
        if(node == null)
            return;

        Queue<Node<T>> queue = new LinkedList<>();
        // add start node
        queue.add(node);

        while(!queue.isEmpty()) {
            Node<T> next = queue.remove();
            System.out.print(next.getData() + " \t");

            if (next.getLeft() != null)
                queue.add(next.getLeft());

            if (next.getRight() != null)
                queue.add(next.getRight());
        }
    }
}
