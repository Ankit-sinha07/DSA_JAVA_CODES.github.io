package com.company.INSERTION_AND_DELETION;

public class Coding_Insertion_Operation_1 {
    // Here I have created  a void named display int that we have given 2 arguments named "int[] arr and int n".
    // Then I have iterate "n" using (for-loop) and in that same (for-loop) I have given a "print-statement" and printed "arr[i]" which iterate's the all the value whose value is less that "i < n" in the array.
    private static void display(int[] arr, int n)
    {
       // Traversal Code
      for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.print("\n");
    }

    public static void indInsertion(int[] arr, int size, int element, int capacity, int index)
    {
        // Insertion Code
        if (size >= capacity) {
               return;
        }
        for(int i = size-1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = element;
    }

    public static void main(String[] args) {
        int [] arr;
        arr = new int[10];
        arr[0] = 7;
        arr[1] = 8;
        arr[2] = 12;
        arr[3] = 27;
        arr[4] = 88;
        int size = 5;
        int element = 45; //inserting a new element in the array
        int index = 1; // it shifts the previous element from it position and inserts a new one on its place
        /*Note:- It shifts the element because the array has 100 element space is fill means all the 100 element is filled then it will not insert any new element*/
       display(arr, size);
        System.out.println("After inserting a new element it shifts the previous element of the array and that also increases the size of the array too.");
       indInsertion(arr, size, element,10 ,index);
       size += 1;
       display(arr, size);
    }
}