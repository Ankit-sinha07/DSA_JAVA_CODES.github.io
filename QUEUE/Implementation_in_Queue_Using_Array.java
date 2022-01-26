package com.company.QUEUE;

public class Implementation_in_Queue_Using_Array {
    public static class queue
    {
        public int size;
        public int front;
        public int rear;
        public int[] arr;
    }

    public static class GlobalMembers
    {
        public static int isEmpty(queue q)
        {
            if (q.rear == q.front)
            {
                return 1;
            }
            return 0;
        }

        public static int isFull(queue q)
        {
            if (q.rear == q.size-1)
            {
                return 1;
            }
            return 0;
        }

        public static void enqueue(queue q, int val)
        {
            if (isFull(q) != 0)
            {
                System.out.print("This Queue is full\n");
            }
            else
            {
                q.rear++;
                q.arr[q.rear] = val;
                System.out.printf("Enqueue element: %d\n", val);
            }
        }

        public static int dequeue(queue q)
        {
            int a = -1;
            if (isEmpty(q) != 0)
            {
                System.out.print("This Queue is empty\n");
            }
            else
            {
                q.front++;
                a = q.arr[q.front];
            }
            return a;
        }

        public static void main(String[] args)
        {
            queue q = new queue();
            q.size = 6;
            q.front = q.rear = 0;
            q.arr = new int[q.size];

            // Enqueue few elements
            enqueue(q, 1);
            enqueue(q, 12);
            enqueue(q, 15);

            System.out.printf("Dequeuing element %d\n", dequeue(q));
            System.out.printf("Dequeuing element %d\n", dequeue(q));
            System.out.printf("Dequeuing element %d\n", dequeue(q));

            enqueue(q, 45);
            enqueue(q, 46);
            enqueue(q, 47);

            if (isEmpty(q) != 0)
            {
                System.out.print("Queue is empty\n");
            }
            if (isFull(q) != 0)
            {
                System.out.print("Queue is full\n");
            }

        }
    }

}
