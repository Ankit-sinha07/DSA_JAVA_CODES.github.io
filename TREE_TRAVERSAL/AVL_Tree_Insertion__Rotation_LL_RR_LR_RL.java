package com.company.TREE_TRAVERSAL;

public class AVL_Tree_Insertion__Rotation_LL_RR_LR_RL {

    public static class Node{
        public int key;
        public Node left;
        public Node right;
        public int height;
    }

    public static int height(Node n){
        if (n == null){
            return 0;
        }
        return n.height;
    }

    public static Node CreateNode(int key){
        Node node = new Node();
        node.key = key;
        node.left = null;
        node.right = null;
        node.height = 1;
        return node;
    }

    public static int maximum(int a, int b){
        return Math.max(a, b);
    }

    public static int BalanceFactor(Node n){
        if (n == null){
            return 0;
        }
        return height(n.left) - height(n.right);
    }

    //RIGHT ROTATE
    public static Node RotateRight(Node y){
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        x.height = maximum(height(x.right),height(x.left)) + 1;
        y.height = maximum(height(y.right),height(x.left)) + 1;

        return x;
    }

    //LEFT ROTATE
    public static Node RotateLeft(Node x){
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = maximum(height(x.right),height(x.left)) + 1;
        y.height = maximum(height(y.right),height(y.left)) + 1;

        return y;
    }

    public static Node insert(Node node, int key){
        if (node == null){
            return CreateNode(key);
        }
        if (key < node.key){
            node.left = insert(node.left, key);
        }
        else if (key > node.key){
            node.right = insert(node.right, key);
        }
        node.height = 1 + maximum(height(node.left), height(node.right));
        int BF = BalanceFactor(node);

        //Left-Left Case(LL)
        if (BF > 1 && key < node.left.key){
            return RotateRight(node);
        }
        //Right-Right Case(RR)
        if (BF < -1 && key > node.right.key){
            return RotateLeft(node);
        }
        //Left-Right Case(LR)
        if (BF > 1 && key > node.left.key){
            node.left = RotateLeft(node.left);
        }
        //Right-Left Case(RL)
        if (BF < -1 && key < node.right.key){
            node.right = RotateRight(node.right);
            return RotateLeft(node);
        }
        return node;
    }
    public static void PreOrder(Node root){
        if (root != null){
            System.out.printf("%d ", root.key);
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;

        root = insert(root, 1);
        root = insert(root, 2);
        root = insert(root, 4);
        root = insert(root, 5);
        root = insert(root, 6);
        root = insert(root, 3);

        PreOrder(root);

    }
}
