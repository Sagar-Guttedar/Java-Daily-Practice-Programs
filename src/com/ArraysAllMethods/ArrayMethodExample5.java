package com.ArraysAllMethods;

import java.util.Arrays;
import java.util.Spliterator;
import java.util.stream.IntStream;

public class ArrayMethodExample5 {

    public static void main(String[] args) {
        // Method 21: spliterator(originalArray, fromIndex, endIndex)
        int[] originalArray = {1, 2, 3, 4, 5};
        Spliterator.OfInt spliterator = Arrays.spliterator(originalArray, 1, 4);
        System.out.println("Spliterator characteristics: " + spliterator.characteristics());

        System.out.println("---------------------------------------------------");

        // Method 22: stream(originalArray)
        IntStream intStream = Arrays.stream(originalArray);
        System.out.println("IntStream from originalArray: ");
        intStream.forEach(System.out::println);

        System.out.println("---------------------------------------------------");

        // Method 23: toString(originalArray)
        String arrayToString = Arrays.toString(originalArray);
        System.out.println("String representation of originalArray: " + arrayToString);
    }
}
