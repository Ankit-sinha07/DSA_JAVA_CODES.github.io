package com.company.LINKED_LIST;

public class Deletion_in_linked_list_6{
 public static class Node{
     public int data;
     public Node next;
 }
 public static class GlobalMembers{
     public static void LinkedlistTraversal(Node ptr){
         while(ptr != null){
             System.out.printf("Element: %d\n", ptr.data);
             ptr = ptr.next;
         }
     }
     //Case-1
     public static Node DeleteFirst(Node head){
         Node ptr = head;
         head = head.next;
         ptr = null;
         return head;
     }
     //Case-2
     public static Node DeleteAtIndex(Node head, int index){
         Node p = head;
         Node q = head.next;
         for (int i = 0; i < index - 1; i++){
             p = p.next;
             q = q.next;
         }
         p.next = q.next;
         q = null;
         return head;
     }
     //case -3
     public static Node DeleteAtLast(Node head, int value){
         Node p = head;
         Node q = head.next;
         while (q.data != value && q.next != null){
             p = p.next;
             q = q.next;
         }
         if (q.data == value){
             p.next = q.next;
             q = null;
         }
         return head;
     }

     public static void main(String[] args) {
         Node head;
         Node second;
         Node third;
         Node fourth;

         head = new Node();
         second = new Node();
         third = new Node();
         fourth = new Node();

         head.data = 1;
         head.next = second;

         second.data = 2;
         second.next = third;

         third.data = 3;
         third.next = fourth;

         fourth.data = 4;
         fourth.next = null;

         System.out.print("Linked List Before deletion ");
         LinkedlistTraversal(head);

         head = DeleteFirst(head); // For deleting first element of the linked list
         head = DeleteAtIndex(head, 2);

         //head = DeleteAtLast(head);
         System.out.print("Linked list after deletion\n");
         LinkedlistTraversal(head);
     }
 }

    public static class Circular_linked_list {
        public static class Node
        {
             public int data;
             public Node next;
        }


        public static class GlobalMembers
        {
            public static void linkedListTraversal(Node head)
            {
                Node ptr = head;
                do
                {
                    System.out.printf("Element is %d\n", ptr.data);
                    ptr = ptr.next;
                }while (ptr != head);
            }

            public static Node insertAtFirst(Node head, int data)
            {
                Node ptr =  new Node();
                ptr.data = data;

                Node p = head.next;
                while (p.next != head)
                {
                    p = p.next;
                }
                // At this point p points to the last node of this circular linked list

                p.next = ptr;
                ptr.next = head;
                head = ptr;
                return head;

            }

            public static void main(String[] args)
            {

                Node head;
                Node second;
                Node third;
                Node fourth;

                // Allocate memory for nodes in the linked list in Heap
                head = new Node();
                second = new Node();
                third = new Node();
                fourth = new Node();

                // Link first and second nodes
                head.data = 4;
                head.next = second;

                // Link second and third nodes
                second.data = 3;
                second.next = third;

                // Link third and fourth nodes
                third.data = 6;
                third.next = fourth;

                // Terminate the list at the third node
                fourth.data = 1;
                fourth.next = head;
                System.out.print("Circular Linked list before insertion\n");
                linkedListTraversal(head);
                head = insertAtFirst(head, 54);
                head = insertAtFirst(head, 58);
                head = insertAtFirst(head, 59);
                System.out.print("Circular Linked list after insertion\n");
                linkedListTraversal(head);


            }
        }

    }
}
