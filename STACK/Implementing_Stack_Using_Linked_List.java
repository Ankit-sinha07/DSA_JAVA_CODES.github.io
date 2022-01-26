package com.company;
import static java.lang.System.exit;
public class Implementing_Stack_Using_Linked_List {

// First I Have Created a Stack in Linked List
static class StackLinkedList {
    private static class Node {
        //Then I Have Created a Linked List Node
        int data;
        Node link;
    }

    Node top; // Global top reference

    //Constructor
    void StackLinkedList() {
        this.top = null;
    }

    //Then I have Created a Push Function to add element in the Stack
    public void Push(int x) {
        Node temp = new Node(); //Create a Node temp and allocate Memory

        //To see if Stack (HEAP) is full or not If Stack is full then it will return a message if not then it will insert an element
        if (temp == null) {
            System.out.println("\n HEAP OVERFLOW..!");
            return;
        }
        temp.data = x; //INITIALIZING data into temp data Field
        temp.link = top; //Top Reference to temp link
        top = temp; //updating top reference
    }

    //To show that the Linked List is Empty or not
    public boolean isEmpty() {
        return top == null;
    }

    // Created a Peek Operation to show the top element
    public int peek() {
        //Checking if the stack is empty or not
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    //Create a Pop function to Remove or delete an element from the stack
    public void pop() {
        if (top == null) { // To check that if all the element is  removed or the stack is empty then it will return a message
            System.out.println("\n Stack Underflow");
        }
        top = (top).link; // This will update the top pointer and point to the next Node
    }
    public void display()
    {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {
                // print node data
                System.out.printf("%d ", temp.data);

                // assign temp link to temp
                temp = temp.link;
            }
        }
    }
}

    public static void main(String[] args) {

        StackLinkedList s = new StackLinkedList();

        //Push Function
        s.Push(7);
        s.Push(22);
        s.Push(4);
        s.Push(3);

        //Display function
        s.display();

        //Statement to print top element of stack Linked List
        System.out.printf("\nTop element before pop Function is:-  %d\n", s.peek());

        //Pop Function
        s.pop();
        s.pop();
        s.display();
        System.out.printf("\nTop element after pop Function is:-  %d\n", s.peek());

    }
}