package com.company.SORTING;

public class Insertion_Sort_implimentation {

    public static void PrintArray(int[] Arr, int n){
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", Arr[i]);
        }
        System.out.print("\n");
    }

    public static void InsertionSort(int[] Arr, int n){
        int key;
        int j;
        for (int i = 1; i <= n - 1; i++){
            key = Arr[i];
            j = i - 1;

            while (j >= 0 && Arr[j] > key){
                Arr[j + 1] = Arr[j];
                j--;
            }
            Arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] Arr = {7, 2, 91, 77, 3};
        int n = 5;
        PrintArray(Arr,n);
        InsertionSort(Arr, n);
        PrintArray(Arr, n);
    }
}
