package com.array;

public class ArrayExample {
    public static void main(String[] args) {
        /*int[] numbers={1,2,3,45,5};
        System.out.println("Accessing first element : "+numbers[0]);*/

        //Iterating Over an array
        /*int[] numbers={10,20,30,40};
        for (int i=0;i<=numbers.length;i++){
            System.out.println("Element at Index : "+numbers[i]);
        }*/

        // Array index out of bound exception
      /*  int[] numbers={1,2,3,4,5};
        System.out.println(numbers[6]);*/

        // Array with Different dataTypes

        /*String[] names={"sagar","ram","shaym"};
        for (String s:names){
            System.out.println(s);
        }*/

        // Multidimensional array

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Element at [1][2] : "+matrix[1][2]);



    }
}
