package com.company.HEAP;
import java.util.*;

public class Deletion_in_Heap {
    static void heap(int []arr, int n, int i){
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l]>arr[largest])// for left child larger than root
            largest = l;

        if (r < n && arr[r]> arr[largest])// for right child larger than root
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heap(arr, n , largest);
        }
    }
    static int RootDelete(int []arr, int n){
        int LastElement = arr[n - 1];
        arr[0] = LastElement;
        n = n - 1;
        heap(arr, n, 0);
        return n;
    }
    static void PrintArray(int [] arr, int n){
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {15, 1, 3, 4, 2};
        int n = arr.length;
        n = RootDelete(arr, n);
        PrintArray(arr, n);
    }
}
