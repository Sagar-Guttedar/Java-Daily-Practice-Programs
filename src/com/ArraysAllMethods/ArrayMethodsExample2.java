package com.ArraysAllMethods;

import java.util.Arrays;

public class ArrayMethodsExample2 {

    public static void main(String[] args) {
        // Original array
        int[] originalArray = {1, 2, 3, 4, 5};

        // Method 6: copyOf(originalArray, newLength)
        int newLength = 7;
        int[] copyArray = Arrays.copyOf(originalArray, newLength);
        System.out.println("Copy of originalArray with new length: " + Arrays.toString(copyArray));

        System.out.println("---------------------------------------------------");

        // Method 7: copyOfRange(originalArray, fromIndex, endIndex)
        int fromIndex = 1;
        int toIndex = 4;
        int[] copyRangeArray = Arrays.copyOfRange(originalArray, fromIndex, toIndex);
        System.out.println("Copy of originalArray from index " + fromIndex + " to " + toIndex + ": " + Arrays.toString(copyRangeArray));

        System.out.println("---------------------------------------------------");

        // Method 8: deepEquals(Object[] a1, Object[] a2)
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        boolean areEqual = Arrays.deepEquals(new Object[]{array1}, new Object[]{array2});
        System.out.println("Are array1 and array2 deepEquals? " + areEqual);

        System.out.println("---------------------------------------------------");

        // Method 9: deepHashCode(Object[] a)
        int deepHashCode = Arrays.deepHashCode(new Object[]{array1});
        System.out.println("Deep hash code of array1: " + deepHashCode);

        System.out.println("---------------------------------------------------");

        // Method 10: deepToString(Object[] a)
        String deepToString = Arrays.deepToString(new Object[]{array1});
        System.out.println("Deep string representation of array1: " + deepToString);
    }
}
