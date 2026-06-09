package com.array;


import java.util.Arrays;
import java.util.Collections;

// Write a program to print given array in descending order

/*
public class SortArrayInDescendingOrder {
    public static void main(String[] args) {
        Integer[] arr = {5, 8, 2, 10, 1};

        // Descending Order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending Order: " + Arrays.toString(arr));

        System.out.println("--------------------------------------------------------");

        // Ascending Order
        Arrays.sort(arr);
        System.out.println("Ascending order : "+Arrays.toString(arr));
    }
}*/


public class SortArrayInDescendingOrder {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,64,4,5,6};

        // Ascending Order
        Arrays.sort(arr);
        System.out.println("Ascending Order : "+Arrays.toString(arr));

        //Descending order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending Order : "+Arrays.toString(arr));

    }
}


