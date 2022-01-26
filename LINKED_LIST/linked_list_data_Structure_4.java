package com.company.LINKED_LIST;
public class linked_list_data_Structure_4 {
    public static class node{
        int data;
        node next;
    }

    public static void linkedlistTraversal(node ptr){
        while (ptr != null){
            System.out.printf("Elements %d\n", ptr.data);
            ptr = ptr.next;
        }
    }

    public static void main(String[] args) {
        node head;
        node second;
        node third;
        node fourth;
        node fifth;

// Allocate memory for nodes in the linked list in Heap
        head = new node();
        second = new node();
        third = new node();
        fourth = new node();
        fifth = new node();

        // Link first and second nodes

        head.data = 10;
        head.next = second;

        // Link second and second nodes

        second.data = 31;
        second.next = third;

        // Link third and second nodes

        third.data = 42;
        third.next = fourth;


        // Link fourth and second nodes
        fourth.data = 3;
        fourth.next = fifth;

        // Link first and second nodes
        fifth.data = 14;
        fifth.next = null;

        linkedlistTraversal(head);
    }
}
