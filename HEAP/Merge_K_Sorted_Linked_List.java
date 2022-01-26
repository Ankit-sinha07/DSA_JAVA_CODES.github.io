package com.company.HEAP;
import java.io.*;
public class Merge_K_Sorted_Linked_List {
    static class Node {
        int data;
        Node next;

        Node(int element) {
            data = element;
            next = null;
        }
    }

    static Node Head;
    static Node temp;

    static void PrintList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    static Node MergeKList(Node[] arr, int last) {
        for (int i = 1; i <= last; i++) {
            while (true) {
                Node head_0 = arr[0];
                Node head_i = arr[1];

                if (head_i == null)
                    break;

                if (head_0.data >= head_i.data) {
                    arr[i] = head_i.next;
                    head_i.next = head_0;
                    arr[0] = head_i;
                } else {
                    while (head_0.next != null) {
                        if (head_0.next.data >= head_i.data) {
                            arr[i] = head_i.next;
                            head_i.next = head_0.next;
                            head_0.next = head_i;
                            break;
                        }
                        head_0 = head_0.next;
                        if (head_0.next == null) {
                            arr[i] = head_i.next;
                            head_i.next = null;
                            head_0.next = head_i;
                            head_0.next.next = null;
                            break;
                        }
                    }
                }
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        int a = 2; // Number of Linked List
        int b = 4; // Number of Element Present in the List

        Node[] arr = new Node[a];
        //1st Linked List
        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);

        //2st Linked List
        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);

        Head = MergeKList(arr, a - 1);
        PrintList(Head);
    }
}

