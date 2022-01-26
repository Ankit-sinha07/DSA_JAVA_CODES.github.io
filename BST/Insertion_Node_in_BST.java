package com.company.BST;

public class Insertion_Node_in_BST {
    //CREATING A BINARY SEARCH TREE
    public static class BST{
        //CREATING A NODE
        static class Node{
            int key;
            Node left, right;
            public Node(int item){
                key = item;
                left = right = null;
            }
        }
        Node root; //BST ROOT

        //CONSTRUCTOR
        BST(){
            root = null;
        }
        void Insert(int key){
            root = InsertRec(root, key);
        }
        Node InsertRec(Node root , int key){
            if (root == null){
                root = new Node(key);
                return root;
            }
            if (key < root.key)
                root.left = InsertRec(root.left, key);
            else if (key > root.key)
                root.right = InsertRec(root.right, key);
            return root;
        }

        void InOrder(){
            InOrderRec(root);
        }
        void InOrderRec(Node root){
            if (root != null){
                InOrderRec(root.left);
                System.out.println(root.key);
                InOrderRec(root.right);
            }
        }

        public static void main(String[] args) {
            BST tree = new BST();
            tree.Insert(5);
            tree.Insert(3);
            tree.Insert(6);
            tree.Insert(1);
            tree.Insert(4);
            tree.Insert(10);
            tree.InOrder();

        }
    }
}
