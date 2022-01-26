package com.company.QUEUE;
import java.util.*;
public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer>PEQueue = new PriorityQueue<Integer>();
        PEQueue.add(10);
        PEQueue.add(20);
        PEQueue.add(15);
        System.out.println(PEQueue.peek());
        System.out.println(PEQueue.poll());
        System.out.println(PEQueue.peek());
    }
}
