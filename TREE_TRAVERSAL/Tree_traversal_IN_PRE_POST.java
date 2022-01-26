package com.company.TREE_TRAVERSAL;

public class Tree_traversal_IN_PRE_POST {
    //Creating a Node (LEFT & RIGHT)
    static class Node{
        int key;
        Node left, right;
        public Node (int item){
            key = item;
            left = right = null;
        }
    }
    //Creating a Binary-Tree
     static class BinaryTree{
        Node root; // create a Node root for BinaryTree.
        BinaryTree(){
            root = null;
        }

        //PRE-ORDER TRAVERSAL in Binary Tree.
        void PreOrder(Node node){
         if (node == null)
             return;
         System.out.print(node.key + " "); //Root Node
         PreOrder(node.left); //Left Node
         PreOrder(node.right); // Right Node
        }

        //POST-ORDER TRAVERSAL in Binary Tree.
        void PostOrder(Node node){
            if (node == null)
                return;
            PostOrder(node.left); //Left Node
            PostOrder(node.right);
            System.out.print(node.key + " "); //Root Node
        }

        //IN-ORDER TRAVERSAL in Binary Tree.
        void InOrder(Node node){
            if (node == null)
                return;
            InOrder(node.left); //Left Node
            System.out.print(node.key + " "); //Root Node
            InOrder(node.right); // Right Node
        }

        void PostOrder() {
            PostOrder(root);
        }
        void PreOrder() {
            PreOrder(root);
        }
        void InOrder() {
            InOrder(root);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Pre-Order traversal in Binary Tree:- ");
        tree.PreOrder();

        System.out.println("\nPost-Order traversal in Binary Tree:- ");
        tree.PostOrder();

        System.out.println("\nIn-Order traversal in Binary Tree:- ");
        tree.InOrder();
    }
}
