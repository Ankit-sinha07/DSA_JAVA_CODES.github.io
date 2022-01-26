package com.company.LINKED_LIST;
public class Insertion_in_LinkedList_5 {
    static class LinkedList {
        Node head;

        static class Node {
            public int data;
            public Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        // Case-1
        public void inseratfirst(int new_data) {

            Node ptr = new Node(new_data);

            ptr.next = head;

            head = ptr;
        }

        // Case-2
        public void insertbetween(Node prev_node, int new_data) {

            if (prev_node == null) {
                System.out.println("The given previous node cannot be null");
                return;
            }


            Node ptr = new Node(new_data);

            ptr.next = prev_node.next;

            prev_node.next = ptr;
        }

        // Case-3
        public void inseratend(int new_data) {

            Node ptr = new Node(new_data);

            if (head == null) {
                head = new Node(new_data);
                return;
            }

            ptr.next = null;

            Node last = head;
            while (last.next != null)
                last = last.next;

            last.next = ptr;
        }

            public void printList(){
            Node tnode = head;
            while (tnode != null) {
                System.out.print(tnode.data + " ");
                tnode = tnode.next;
            }
        }

        public static void main(String[] args) {
            LinkedList List = new LinkedList();

            List.inseratfirst(7);  // Then this will Insert
            List.inseratfirst(5); //This will Insert first in the Linkedlist

            List.insertbetween(List.head.next, 8);//This will Insert in between of the list.

            List.inseratend(1);  // This will insert at the Second-last  Linkedlist
            List.inseratend(4); //This will Insert at last of the Linkedlist



            System.out.println("\nCreated Linked list is: ");
            List.printList();
        }
    }
}
