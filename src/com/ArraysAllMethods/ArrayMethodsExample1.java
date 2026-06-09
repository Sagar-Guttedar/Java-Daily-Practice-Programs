package com.ArraysAllMethods;


import java.util.Arrays;
import java.util.Comparator;

public class ArrayMethodsExample1 {

    public static void main(String[] args) {
        // Method 1: asList()
        Integer[] array = {1, 4, 7, 10, 13};
        System.out.println("Original Array: " + Arrays.asList(array));

        System.out.println("-------------------------------------------------------------------");

        // Method 2: binarySearch()
        int keyToSearch = 7;
        int index = Arrays.binarySearch(array, keyToSearch);
        System.out.println("Index of " + keyToSearch + ": " + index);

        System.out.println("-------------------------------------------------------------------");

        // Method 3: binarySearch(array, fromIndex, toIndex, key, Comparator)
        int fromIndex = 1;
        int toIndex = 4;
        int keyToSearchInRange = 10;
        Comparator<Integer> comparator = Comparator.naturalOrder();
        int indexInRange = Arrays.binarySearch(array, fromIndex, toIndex, keyToSearchInRange, comparator);
        System.out.println("Index of " + keyToSearchInRange + " in range [" + fromIndex + ", " + toIndex + "]: " + indexInRange);

        System.out.println("-------------------------------------------------------------------");

        // Method 4: compare(array1, array2)
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        int comparisonResult = Arrays.compare(array1, array2);
        System.out.println("Comparison result between array1 and array2: " + comparisonResult);

        System.out.println("-------------------------------------------------------------------");

        // Method 5: compareUnsigned(array1, array2)
        int[] unsignedArray1 = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        int[] unsignedArray2 = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        int unsignedComparisonResult = Arrays.compareUnsigned(unsignedArray1, unsignedArray2);
        System.out.println("Unsigned comparison result between unsignedArray1 and unsignedArray2: " + unsignedComparisonResult);
    }
}
