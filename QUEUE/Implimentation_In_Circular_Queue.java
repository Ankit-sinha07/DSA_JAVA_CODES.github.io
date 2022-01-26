package com.company.QUEUE;

import java.util.IllegalFormatCodePointException;

public class Implimentation_In_Circular_Queue {
    public static class CircularQueue {
        public int size;
        public int front;
        public int rear;
        public int[] arr;
    }

    public static class GlobalMembres{
        public static int isEmpty(CircularQueue queue){
            if (queue.rear == queue.front){
                return 1;
            }
            return 0;
        }

        public static int isFull(CircularQueue queue){
            if ((queue.rear + 1) % queue.size == queue.front){ //Here we have used the formula "(i+1) % size of array" and if the queue size is equal to queue front the array is full
                return 1;
            }
            return 0;
        }

        public static void Enqueue(CircularQueue queue, int value){
            if (isFull(queue) != 0){ // Here this code will show that if queue is not equal to 0 then queue if full **NOTE:- (isFull = rear function)
                System.out.print("Queue is Full");
            }
            else{ //Else it will add the element in the array in a circular way
                queue.rear = (queue.rear + 1) % queue.size; // Here I have used the formula "(i + 1) % size of array" for Enqueue function and for rear end
                queue.arr[queue.rear] = value;
                System.out.printf("Enqued Element %d\n",value);
            }
        }

        public static int Dequeue(CircularQueue queue){
            int a = -1;
            if(isEmpty(queue) != 0){  // Here this code will show that if queue is not equal to 0 then queue if full **NOTE:- (isEmpty = front function)
                System.out.print("Queue is full");
            }
            else{ // Here I have used the formula "(i + 1) % size of array" for Dequeue function and for front end
                queue.front = (queue.front + 1) % queue.size;
                a = queue.arr[queue.front];
            }
            return a;
        }

        public static void main(String[] args) {
            CircularQueue queue = new CircularQueue();

            // Front and rear also take's space in index
            queue.size = 4;
            queue.front = queue.rear = 0;
            queue.arr = new int[queue.size];

            Enqueue(queue, 1);
            Enqueue(queue, 12);
            Enqueue(queue, 15);

            System.out.printf("Dequeuing Element %d\n", Dequeue(queue));
            System.out.printf("Dequeuing Element %d\n", Dequeue(queue));
            System.out.printf("Dequeuing Element %d\n", Dequeue(queue));

            Enqueue(queue, 45);
            Enqueue(queue, 46);
            Enqueue(queue, 47);
            if (isEmpty(queue) != 0){
                System.out.print("Queue is Empty \n");
            }
            if (isFull(queue) != 0)
            {
                System.out.print("Queue is full\n");
            }
        }
    }

}

