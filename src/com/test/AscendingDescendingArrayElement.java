package com.test;

import java.util.Arrays;

/*
public class AscendingDescendingArrayElement {
    public static void main(String[] args) {
        int[] arr= {10,30,20,40,30,50,70,60};

        Arrays.sort(arr);

        System.out.print("Ascending order : ");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("----------------------------------");

        System.out.print("Descending order : ");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Length of the array : "+arr.length);
    }
}*/

public class AscendingDescendingArrayElement{
    public static void main(String[] args) {
        int[] arr = {10,30,20,50,40,50};

        Arrays.sort(arr);

        System.out.print("Ascending Order : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("------------------------------------");;

        System.out.print("Descending Order : ");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
        System.out.println("------------------------------------");;

        System.out.println("Length of an Array : "+arr.length);
    }
}










