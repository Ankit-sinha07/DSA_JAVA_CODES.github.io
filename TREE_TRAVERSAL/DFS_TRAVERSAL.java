package com.company.TREE_TRAVERSAL;
import java.util.*;

public class DFS_TRAVERSAL {
    // DFS TRAVERSAL OF A TREE USING RECURSION
    static class Node{
        int key;
        Node Left, Right;
        public Node(int item){
            key = item;
            Left = Right = null;
        }
    }
    static class BinaryTree{
        Node root;
        BinaryTree(){
            root = null;
        }

        //PreOrder
        void PreOrder(Node node){
            if (node == null){
                return;
            }
            System.out.print(node.key + " ");// Root Node
            PreOrder(node.Left);// Left Node
            PreOrder(node.Right);// Right Node
        }

        //PostOrder
        void PostOrder(Node node){
            if (node == null){
                return;
            }
            PostOrder(node.Left);// Left Node
            PostOrder(node.Right);// Right Node
            System.out.print(node.key + " ");// Root Node
        }

        //InOrder
        void InOrder(Node node){
            if (node == null){
                return;
            }
            InOrder(node.Left);// Left Node
            System.out.print(node.key + " ");// Root Node
            InOrder(node.Right);// Right Node
        }

        void PreOrder(){
            PreOrder(root);
        }
        void PostOrder(){
            PostOrder(root);
        }
        void InOrder(){
            InOrder(root);
        }

        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.root = new Node(1);
            tree.root.Left = new Node(2);
            tree.root.Right = new Node(3);
            tree.root.Left.Left = new Node(4);
            tree.root.Left.Right = new Node(5);

            System.out.println("FOR PREORDER TRAVERSAL:- ");
            tree.PreOrder();

            System.out.println("\n FOR POSTORDER TRAVERSAL:- ");
            tree.PostOrder();

            System.out.println("\n FOR INORDER TRAVERSAL:- ");
            tree.InOrder();
        }
    }
}
