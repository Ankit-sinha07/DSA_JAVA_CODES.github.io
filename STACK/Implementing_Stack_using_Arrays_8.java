package com.company;

public class Implementing_Stack_using_Arrays_8 {
    static class Stack {

        // For Creating stack
        static final int MAX = 100;
        int top;
        int arr[] = new int[MAX]; // Maximum size of Stack

        // isEmpty() Operation
        boolean isEmpty() {
            return (top < 0);
        }

        Stack() {
            top = -1;
        }

        // Push() Operation
        void push(int x) {
            if (top >= (MAX - 1)) {
                System.out.println("Stack Overflow");
            }
            else {
                arr[++top] = x;
                System.out.println(x + " pushed into stack");
            }
        }

        // pop() Operation
        int pop() {
            if (top < 0) {
                System.out.println("Stack Underflow");
                return 0;
            }
            else {
                int x = arr[top--];
                return x;
            }
        }

       //Peek() Operation
        int peek() {
            if (top < 0) {
                System.out.println("Stack Underflow");
                return 0;
            }
            else {
                int x = arr[top];
                return x;
            }
        }
        // This for-loop will print all the element that are present in the stack array.
        void print() {
            for (int i = top; i > -1; i--) {
                System.out.print(" " + arr[i]);
            }
        }
    }

        public static void main(String args[]) {
            Stack s = new Stack();
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
            s.push(50);
            System.out.println("Popped from stack:- " + s.pop()); // use s.pop again than the next top element will remove
            System.out.println("Top element is :- " + s.peek());  // Shows the top element
            System.out.print("Elements present in stack:- ");    // Shows the all existing element in the array
            s.print();
        }
    }