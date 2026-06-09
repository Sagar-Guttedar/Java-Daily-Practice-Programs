package com.test;


import java.util.Arrays;

/*public class SecondLargestElementArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50,100, 10, 15};

        if (arr.length < 2) {
            System.out.println("Invalid Input");
            return;
        }
        Arrays.sort(arr);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                System.out.println("The second largest element is: " + arr[i]);
                return;
            }
        }
        System.out.println("No second largest element found.");
    }
}*/


/*
public class SecondLargestElementArray{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,10,20,40,60};
        if (arr.length < 2){
            System.out.println("Invalid Input");
            return;
        }
        Arrays.sort(arr);

        for (int i=arr.length-2;i>=0;i--){
            if (arr[i] !=arr[arr.length-1]){
                System.out.println("The Second largest element is : "+arr[i]);
                return;
            }
        }
        System.out.println("No second largest element found.");
    }
}*/

/*
public class SecondLargestElementArray{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};

        if (arr.length < 2){
            System.out.println("Invalid Input");
            return;
        }

        Arrays.sort(arr);

        for (int i=arr.length-2;i>=0;i--){
            if (arr[i] != arr[arr.length-1]){
                System.out.println("The Second Largest element is : "+arr[i]);
                return;
            }
        }
        System.out.println("No second largest element found.");
    }
}*/


/*
public class SecondLargestElementArray{
    public static void main(String[] args) {
        int[] arr = {10,20,30,20,30,400,30,40,50};

        if (arr.length < 2){
            System.out.println("Invalid Input");
            return;
        }

        Arrays.sort(arr);

        for (int i =arr.length-2;i>=0;i--){
            if (arr[i] != arr[arr.length-1]){
                System.out.println("The Second Largest element is : "+arr[i]);
                return;
            }
        }
        System.out.println("Second largest element is not found");
    }
}*/



public class SecondLargestElementArray{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};

        if (arr.length < 2){
            System.out.println("Invalid input");
            return;
        }

        Arrays.sort(arr);

        for (int i=arr.length-2;i>=0;i--){
            if (arr[i] !=arr[arr.length-1]){
                System.out.println("Second Largest element is : "+arr[i]);
                return;
            }
        }
        System.out.println("No Second Largest element");
    }
}




















