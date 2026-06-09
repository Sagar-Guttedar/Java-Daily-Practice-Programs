package com.test;

/*Write a program to print a highest value in given array {5,8,25,4,40,8,2}
This program finds and prints the maximum value in a given array.
It initializes the max variable with the first element of the array,
then iterates through the array using a for-each loop. During each iteration,
it compares the current element (num) with max. If num is greater than max,
it updates max with the new value. After the loop finishes,
the highest value in the array is stored in max and printed to the console.
This approach ensures all elements are checked to identify the maximum value.*/

// Using For loop
/*public class MaxValueGivenArray {
    public static void main(String[] args) {
        int[] arr = {5, 8, 25, 4, 40, 8, 2};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}*/

/*public class MaxValueGivenArray{
    public static void main(String[] args) {
        int[] arr= {5,8,25,4,40,8,2};

        int max = arr[0];
        for (int num : arr){
            if (num > max){
                max = num;
            }
        }
        System.out.println(max);
    }
}*/
public class MaxValueGivenArray{
    public static void main(String[] args) {
        int[] arr = {5,8,25,4,40,8,2};

        int max = arr[0];
        for (int num:arr){
            if(max > num){
                max = num;
            }
        }
        System.out.println(max);
    }

}


/*This program finds the maximum value in a given array by using the Arrays.sort() method.
The array is sorted in ascending order, and the largest value is placed at the last index.
After sorting, the program prints the value at arr[arr.length - 1], which is the maximum value.
This approach leverages Java's built-in sorting functionality to find the highest number in a concise manner.*/

// Using Arrays.sort()
/*public class MaxValueGivenArray {
    public static void main(String[] args) {
        int[] arr = {5, 8, 25, 4, 40, 8, 2};
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }
}*/

