package com.ArraysAllMethods;

import java.util.Arrays;

public class ArrayMethodsExample3 {

    public static void main(String[] args) {
        // Method 11: equals(array1, array2)
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean arraysEqual = Arrays.equals(array1, array2);
        System.out.println("Are array1 and array2 equal? " + arraysEqual);

        System.out.println("---------------------------------------------------");

        // Method 12: fill(originalArray, fillValue)
        int[] originalArray = new int[5];
        int fillValue = 7;
        Arrays.fill(originalArray, fillValue);
        System.out.println("Filled array with value " + fillValue + ": " + Arrays.toString(originalArray));

        System.out.println("---------------------------------------------------");

        // Method 13: hashCode(originalArray)
        int arrayHashCode = Arrays.hashCode(originalArray);
        System.out.println("Hash code of the array: " + arrayHashCode);

        System.out.println("---------------------------------------------------");

        // Method 14: mismatch(array1, array2)
        int[] mismatchArray1 = {1, 2, 3, 4, 5};
        int[] mismatchArray2 = {1, 2, 3, 6, 5};
        int mismatchIndex = Arrays.mismatch(mismatchArray1, mismatchArray2);
        System.out.println("Mismatch index between mismatchArray1 and mismatchArray2: " + mismatchIndex);

        System.out.println("---------------------------------------------------");

        // Method 15: parallelSort(originalArray)
        int[] unsortedArray = {5, 3, 1, 4, 2};
        Arrays.parallelSort(unsortedArray);
        System.out.println("Sorted array using parallelSort: " + Arrays.toString(unsortedArray));
    }
}
