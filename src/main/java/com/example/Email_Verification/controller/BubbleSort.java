package com.example.Email_Verification.controller;

import java.util.Arrays;

public class BubbleSort {

    // Bubble Sort function
    public void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) { // Corrected the loop boundary for optimization
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Main method to test the Bubble Sort
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90}; // Sample array
        BubbleSort sorter = new BubbleSort();

        System.out.println("Unsorted Array: " + Arrays.toString(arr));

        sorter.bubbleSort(arr); // Sort the array using bubble sort

        System.out.println("Sorted Array: " + Arrays.toString(arr)); // print the sorted array
    }
}


