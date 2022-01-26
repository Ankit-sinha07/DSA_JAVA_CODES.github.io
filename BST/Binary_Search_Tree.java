package com.company.BST;

public class Binary_Search_Tree {
    public static class node
    {
        public int data;
        public node left;
        public node right;
    }

        public static node createNode(int data) {
            node n; // creating a node pointer
            n = new node(); // Allocating memory in the heap
            n.data = data; // Setting the data
            n.left = null;
            return n;
        }

        public static void preOrder(node root) {
            if (root != null)
            {
                System.out.printf("%d ", root.data);
                preOrder(root.left);
                preOrder(root.right);
            }
        }

        public static void postOrder(node root) {
            if (root != null) {
                postOrder(root.left);
                postOrder(root.right);
                System.out.printf("%d ", root.data);
            }
        }

        public static void inOrder(node root) {
            if (root != null) {
                inOrder(root.left);
                System.out.printf("%d ", root.data);
                inOrder(root.right);
            }
        }
        public static node prev = null;

        public static int isBST(node root) {
            if (root != null) {
                if (isBST(root.left) == 0) {
                    return 0;
                }
                if (prev != null && root.data <= prev.data) {
                    return 0;
                }
                prev = root;
                return isBST(root.right);
            }
            else {
                return 1;
            }
        }

        public static void main(String[] args) {

            // Constructing the root node - Using Function (Recommended)
            node p = createNode(5);
            node p1 = createNode(3);
            node p2 = createNode(6);
            node p3 = createNode(1);
            node p4 = createNode(4);

            p.left = p1;
            p.right = p2;
            p1.left = p3;
            p1.right = p4;

            // preOrder(p);
            // printf("\n");
            // postOrder(p);
            // printf("\n");
            inOrder(p);
            System.out.print("\n");
            if (isBST(p) != 0) {
                System.out.print("This is a Binary Search Tree (bst)");
            }
            else{
                System.out.print("This is not a bst");
            }
        }
    }
