package com.company.QUEUE;

public class Implementation_in_DEQueue_Using_Circular_Array {
    static class DEqueue{
        static final int MaxArray = 50;
        int arr[];
        int front;
        int rear;
        int size;

        public DEqueue(int size){
            arr = new int[MaxArray];
            front = -1;
            rear = 0;
            this.size = size;
        }
        //Code for checking the DEqueue is full or not
        boolean isFull(){
            return ((front == 0 && rear == size -1) || front == rear + 1);
        }

        //Code for checking the DEqueue is empty or not
        boolean isEmpty(){
            return (front == -1);
        }

        void EnqueueFront(int key){

            // Code for checking the DEqueue is full or not
            if (isFull()){
                System.out.println("D.E Queue Overflowed");
                return;
            }

            // Code if the D.E Queue is initially Empty

            if (front == -1){
                front = 0;
                rear = 0;
            }

            else if (front == 0)
                front = size - 1;

            arr[front] = key;
        }

        // Code to insert element at rear end of DEQueue

        void EnqueueRear(int key){
            if (isFull()){
                System.out.println("D.E Queue Overflowed");
                return;
            }

            if (front == -1){
                front = 0;
                rear = 0;
            }

            else if (rear == size -1){
                front = 0;
                rear = 0;
            }

            // Rear is last position of Queue
            else if (rear == size -1)
                rear = 0;

            else
                rear = rear + 1;

            // Code for inserting current element into DEQUEUE
            arr[rear] = key;
        }

        // Code to Delete element at front end of DEQueue
        void DequeueFront(){

            //Code for checking the DEqueue is empty or not
            if (isEmpty()){
                System.out.println("D.E Queue Overflowed \n");
                return;
            }
            if (front == rear){
                front = -1;
                rear = -1;
            }

            else
                if (front == size -1)
                    front = 0;

                else
                    front = front + 1;
        }

        void DequeueRear(){
            if (isEmpty()) {
                System.out.println("D.E Queue Underflow");
                return ;
            }
            if (front == rear){
                front = -1;
                rear = -1;
            }
            else if (rear == 0)
                rear =size - 1;
            else
                rear = rear - 1;
        }
        // Code for Returning the First element of DEQUEUE

        int getFront(){
            if (isEmpty()){
                System.out.println("D.E Queue OverFlowed");
                return -1;
            }
            return arr[front];
        }

       int getRear(){
            if (isEmpty() || rear < 0){
                System.out.println("D.E Queue UnderFlow \n");
                return -1;
            }
            return arr[rear];
       }

        public static void main(String[] args) {
            DEqueue DEQUEUE = new DEqueue(5);

            //EnqueueRear()
            System.out.println("ELEMENT INSERT AT REAR END:- 10");
            DEQUEUE.EnqueueRear(10);

            System.out.println("ELEMENT INSERT AT REAR END:- 20");
            DEQUEUE.EnqueueRear(20);

            //getRear()
            System.out.println("GET REAR ELEMENT:- " + DEQUEUE.getRear());
            DEQUEUE.DequeueRear(); //Deleting the Rear Element1
            System.out.println("AFTER Deleting the rear element new rear is:- " + DEQUEUE.getRear());

            //EnqueueFront
            System.out.println("ELEMENT INSERTING AT THE FRONT END");
            DEQUEUE.EnqueueFront(50);

            //getFront()
            System.out.println("GET FRONT ELEMENT:- " + DEQUEUE.getFront());
            DEQUEUE.DequeueFront();//Deleting the Front Element
            System.out.println("AFTER Deleting the Front element new Front is:-" + DEQUEUE.getFront());

        }
    }
}
