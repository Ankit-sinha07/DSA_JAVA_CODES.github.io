package com.company.INSERTION_AND_DELETION;

public class Coding_Deletion_Operation_2 {
    public static void display(int[] arr, int n) {
        // Code for Traversal
        for (int i = 0; i < n; i++) {
            System.out.printf(" %d", arr[i]);
        }
        System.out.print("\n");
    }

    public static void indDeletion(int[] arr, int size, int index) {
        // code for Deletion
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public static void main(String[] args) {
            int [] arr;
            arr = new int[100];
            arr[0] = 7;
            arr[1] = 8;
            arr[2] = 12;
            arr[3] = 27;
            arr[4] = 88;
            int size = 5;
            int index = 0; // it will remove the particular index element.
            display(arr, size);
            indDeletion(arr, size, index);
            size -= 1;
            display(arr, size);
        }
    }