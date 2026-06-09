package com.test;

import java.util.*;

/*public class DontUseSortMethod {
    public static void main(String[] args) {
        int arr[] = {0,0,2,4,0,1};
        int temp;
        System.out.print("Original Array : ");
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("");

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] =arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Sorted Array : ");
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}*/



public class DontUseSortMethod{
    public static void main(String[] args) {
        int arr[] = {0,0,2,4,0,1};
        int temp;

        System.out.println("Original Array : ");
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array : ");
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i] + " ");
    }
}


// An immutable class is a class whose objects cannot be modified once they are created.







