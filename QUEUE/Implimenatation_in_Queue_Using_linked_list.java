package com.company.QUEUE;

public class Implimenatation_in_Queue_Using_linked_list {

        public static class Node {
                public int data;
                public Node next;
        }

        public static class GlobalMembers
        {
                public static Node front = null;
                public static Node rear = null;

//Linked-list Transversal
                public static void linkedListTraversal(Node ptr)
                {
                        System.out.print("Printing the elements of this linked list\n");
                        while (ptr != null)
                        {
                                System.out.printf("Element: %d\n", ptr.data);
                                ptr = ptr.next;
                        }
                }

//Enqueue
                public static void Enqueue(int val)
                {
                        Node n =  new Node();
                        if (n == null)
                        {
                                System.out.print("Queue is Full");
                        }
                        else
                        {
                                n.data = val;
                                n.next = null;

                                if (front == null)
                                {
                                        front = rear = n;
                                }

                                else
                                {
                                        rear.next = n;
                                        rear = n;
                                }
                        }
                }

//Dequeue
                public static int dequeue()
                {
                        int val = -1;
                        Node ptr = front;
                        if (front == null) {
                                System.out.print("Queue is Empty\n");
                        }
                        else {
                                front = front.next;
                                val = ptr.data;
                                ptr = null;
                        }
                        return val;
                }

                public static void main(String[] args){
                        linkedListTraversal(front);
                        System.out.printf("Element Dequeuing %d\n", dequeue());

                        Enqueue(34);
                        Enqueue(4);
                        Enqueue(7);
                        Enqueue(17);

                        System.out.printf("Element Dequeuing %d\n", dequeue());
                        System.out.printf("Element Dequeuing %d\n", dequeue());
                        System.out.printf("Element Dequeuing %d\n", dequeue());
                        System.out.printf("Element Dequeuing %d\n", dequeue());

                        linkedListTraversal(front);
                }
        }
}