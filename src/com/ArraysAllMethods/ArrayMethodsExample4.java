package com.ArraysAllMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Spliterator;

public class ArrayMethodsExample4 {

    public static void main(String[] args) {
        // Method 16: sort(originalArray)
        int[] originalArray = {5, 3, 1, 4, 2};
        Arrays.sort(originalArray);
        System.out.println("Sorted array using sort(): " + Arrays.toString(originalArray));

        System.out.println("---------------------------------------------------");

        // Method 17: sort(originalArray, fromIndex, endIndex)
        int[] partialArray = {5, 3, 1, 4, 2};
        int fromIndex = 1;
        int toIndex = 4;
        Arrays.sort(partialArray, fromIndex, toIndex);
        System.out.println("Partially sorted array from index " + fromIndex + " to " + toIndex + ": " + Arrays.toString(partialArray));

        System.out.println("---------------------------------------------------");

        // Method 18: sort(T[] a, int fromIndex, int toIndex, Comparator<? super T> c)
        String[] stringArray = {"Banana", "Apple", "Orange", "Grapes"};
        Comparator<String> lengthComparator = Comparator.comparingInt(String::length);
        Arrays.sort(stringArray, 0, stringArray.length, lengthComparator);
        System.out.println("Sorted string array by length: " + Arrays.toString(stringArray));

        System.out.println("---------------------------------------------------");

        // Method 19: sort(T[] a, Comparator<? super T> c)
        Integer[] customArray = {5, 3, 1, 4, 2};
        Comparator<Integer> reverseOrderComparator = Comparator.reverseOrder();
        Arrays.sort(customArray, reverseOrderComparator);
        System.out.println("Sorted array in reverse order: " + Arrays.toString(customArray));

        System.out.println("---------------------------------------------------");

        // Method 20: spliterator(originalArray)
        Spliterator.OfInt spliterator = Arrays.spliterator(originalArray);
        System.out.println("Spliterator characteristics: " + spliterator.characteristics());
    }
}
