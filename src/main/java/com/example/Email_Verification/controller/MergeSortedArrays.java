package com.example.Email_Verification.controller;

public class MergeSortedArrays {

    // Method to merge two sorted arrays
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        return result;
    }

    // Main method to test the mergeSortedArrays method
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        // Call the mergeSortedArrays method and store the result
        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        // Print the merged array
        System.out.println("Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

    }

}


