package com.TapArrayPro;

import java.util.Scanner;

public class AverageOfGivenArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the nth element : ");
        int n= sc.nextInt();
        int sum = 0;

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum +=arr[i];
        }

        Double avg=(double)sum/arr.length;
        System.out.print("Average of Given Array : "+avg);
        //or
        // System.out.printf("%.2f",avg);


    }
}


/*public class AverageOfGivenArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Nth element : ");
        int n= sc.nextInt();

        int sum=0;

        System.out.println("Enter the elements : ");
        for (int i=0;i<n;i++){
            int b=sc.nextInt();
        }
    }
}*/
