package com.company.TREE_TRAVERSAL;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.logging.Level;

public class BFS_Traversal {
    static class Node{
        int data;
        Node Left, Right;
        public Node(int Item){
            data = Item;
            Left = Right = null;
        }
    }
    static class BinaryTree{
        Node root;
        public BinaryTree(){
            root = null;
        }
        void printLevelOrder() {
            int h = Height(root);
            int i;
            for (i = 1; i <= h; i++)
                CurrentLevel(root, i);
        }

        int Height(Node root){
            if (root == null)
                return 0;
            else{
                int LeftHeight = Height(root.Left);
                int RightHeight = Height(root.Right);

                if (LeftHeight > RightHeight)
                    return (LeftHeight + 1);
                else
                    return (RightHeight + 1);
            }
        }
        void CurrentLevel(Node root, int level){
            if (root == null)
                return;
            if (level == 1)
                System.out.print(root.data + " ");
            else if (level > 1) {
                CurrentLevel(root.Left, level - 1);
                CurrentLevel(root.Right, level - 1);
            }
        }

        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.root = new Node(1);
            tree.root.Left = new Node(2);
            tree.root.Right = new Node(3);
            tree.root.Left.Left = new Node(4);
            tree.root.Left.Right = new Node(5);

            tree.printLevelOrder();
        }
    }
}