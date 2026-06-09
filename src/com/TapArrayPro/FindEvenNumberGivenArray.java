package com.TapArrayPro;

import java.util.Scanner;

public class  FindEvenNumberGivenArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the nth element : ");
        int n= sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int number : arr){
            if (number%2==0){
                System.out.print(number +" ");
            }
        }
    }
}
