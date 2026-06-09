package com.array;

/*public class MissingNumberArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length + 1; // Total numbers including the missing one
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int arraySum = 0;

        for (int num : arr) {
            arraySum += num;
        }

        int missingNumber = totalSum - arraySum;
        System.out.println("The missing number is: " + missingNumber);
    }
}*/

// Easy and Understandable Program

/*public class MissingNumberArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int totalSum = 21; // Pre-calculated sum of first n numbers (1 to 6)
        int arraySum = 0;

        for (int num : arr) {
            arraySum += num;
        }
        int missingNumber = totalSum - arraySum;
        System.out.println("The missing number is: " + missingNumber);
    }
}*/

/*public class MissingNumberArray{
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int totalSum = 21;
        int arraySum = 0;

        for(int num : arr){
            arraySum += num;
        }
        int missingNumber = totalSum - arraySum;
        System.out.println("The missing number is : "+missingNumber);
    }
}*/

// Using enhanced for loop
/*public class MissingNumberArray{
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int totalSum = 21;
        int arraySum=0;

        for(int num:arr){
            arraySum +=num;
        }

        int missingNumber = totalSum - arraySum;
        System.out.println("Missing number : "+missingNumber);

    }
}*/

// Using for loop
/*public class MissingNumberArray{
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int totalSum = 21;
        int arraySum =0;

        for (int i=0;i<arr.length;i++){
            arraySum += arr[i];
        }

        int missingNumber = totalSum - arraySum;
        System.out.println("Missing Value is : "+missingNumber);
    }
}*/

/*public class MissingNumberArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        int totalSum = 28;
        int arraySum = 0;

        for (int i=0;i<arr.length;i++){
            arraySum += arr[i];
        }

        int missingNumber = totalSum - arraySum;
        System.out.println("Missing Number is : "+missingNumber);
    }
}*/



public class MissingNumberArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        int totalSum = 28;
        int arraySum = 0;

        for (int i=0;i<arr.length;i++){
            arraySum =arraySum+arr[i];
        }

        int missingNumber = totalSum - arraySum;
        System.out.println("Missing Number : "+missingNumber);
    }
}







