package com.company.SORTING;

public class Selection_Sort_Implimentation {

    public static void PrintArray(int[] Arr, int n){
        for (int i = 0; i < n; i++){
            System.out.printf("%d, ", Arr[i]);
        }
        System.out.print(" \n ");
    }

    public static void SelectionSort(int[] Arr, int n){
        int IndexOfMinimum;
        int temp;
        System.out.print("Selection Sort Running.......\n");
        for (int i = 0; i < n; i++){
            IndexOfMinimum = i;
            for (int j = i + 1; j < n; j++){
                if (Arr[j] < Arr[IndexOfMinimum]){
                    IndexOfMinimum = j;
                }
            }
            //Code to Swap Arr[i] and Arr[IndexOfMinimum]
            temp = Arr[i];
            Arr[i] = Arr[IndexOfMinimum];
            Arr[IndexOfMinimum] = temp;
        }
    }

    public static void main(String[] args) {
        int [] Arr = {8, 0, 7, 1, 3};
        int n = 5;
        PrintArray(Arr, n); // Print array before sorting
        SelectionSort(Arr, n); // Sorting the array
        PrintArray(Arr, n); // Print array After Sorting
    }
}
