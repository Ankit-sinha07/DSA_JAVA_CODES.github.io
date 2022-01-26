package com.company.SORTING;

public class Bubble_Sort_insertion {

    public static void PrintArray(int[] Arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", Arr[i]);
        }
        System.out.print("\n");
    }

    public static void BubbleSort(int[] Arr, int n) {
        int temp;
        int isSort = 0;
        for (int i = 0; i < n - 1; i++) {
            System.out.printf("For Working on pass Number %d\n", i + 1);
            for (int j = 0; j < n - 1 - i; j++) {
                if (Arr[j] > Arr[j + 1]) {
                    temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                }
            }
        }
    }

    public static void BubbleSortAdaptive(int[] Arr, int n) {
        int temp;
        int isSort = 0;

        for (int i = 0; i < n - 1; i++) {
            System.out.printf("For Working on pass number %d\n", i + 1);
            isSort = 1;
            for (int j = 0; j < n - 1 - i; j++) {
                if (Arr[j] > Arr[j + 1]) {
                    temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                    isSort = 0;
                }
            }
            if (isSort != 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] Arr = {1, 4, 5, 6, 112, 534, 625, 7, 203, 9, 987, 145, 465, 505};
        int n = 14;

        // Printing the array before sorting
        PrintArray(Arr, n);

        // Function to Sort the Array
        BubbleSort(Arr, n);

        // Function for BubbleSortArray
        // BubbleSortAdaptive(A, n);

        // Printing the array before sorting
        PrintArray(Arr, n);
    }
}

