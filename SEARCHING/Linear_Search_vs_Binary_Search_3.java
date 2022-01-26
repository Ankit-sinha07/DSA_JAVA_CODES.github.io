package com.company.SEARCHING;

public class Linear_Search_vs_Binary_Search_3 {
    public static int LinearSearch(int[] arr, int size, int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] arr, int size, int element) {
        int low;
        int mid;
        int high;
        low = 0;
        high = size - 1;
        while(low <= high) {
            mid = (low + high) / 2;
            if(arr[mid] == element){
                return mid;
            }
            else if (arr[mid] < element){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

public static void main(String[] args) {
// This is unsorted array for linear search

    int arr[] = {1, 5, 3, 2, 8, 444, 6, 4, 55, 6, 10, 65};
    int size = arr.length;
    int element = 444;
    int searchIndex = LinearSearch(arr, size, element);
    System.out.printf("The element %d was found at index %d\n", element, searchIndex);


// This is sorted array for Binary search
//    int [] arr = {1, 3, 5, 56, 444, 64, 73, 123, 225};
//    int size = arr.length;
//    int element = 444;
//    int searchIndex = BinarySearch(arr, size, element);
//      System.out.printf("The element %d was found at index %d\n", element, searchIndex);
}
}
