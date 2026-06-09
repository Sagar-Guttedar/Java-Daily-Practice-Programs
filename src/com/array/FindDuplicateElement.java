package com.array;

// Java program to find duplicate elements in an array

/*public class FindDuplicateElement {
    public static void main(String[] args) {
        int[] numbers={10,5,10,30,20,40,50,60,70,60,10};

        for (int i=0; i< numbers.length;i++){
            for (int j=i+1; j< numbers.length;j++){
                if (numbers[i] == numbers[j]){
                    System.out.println("Duplicate elements found : "+numbers[i]);
                }
            }
        }
    }
}*/

/*public class FindDuplicateElement {
    public static void main(String[] args) {
        int[] numbers={10,5,10,30,20,40,50,60,70,60,10};

        for (int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;i++){
                if (numbers[i]==numbers[j]) {
                    System.out.println("Duplicate element is : "+numbers[i]);
                }
            }
        }
    }
}*/

/*public class FindDuplicateElement{
    public static void main(String[] args) {
        int[] arr={10,20,10,20,30,40,50,40};
        int count=0;

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println("Duplicate Element in given array :"+arr[j]);
                    count++;
                }
            }
        }
        System.out.println("Count the Duplictae element :"+count);
    }
}*/



/*public class FindDuplicateElement{
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,20,30,10,40};
        int count=0;

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println("Duplicate Element in given Array :"+arr[j]);
                    count++;
                }
            }
        }
        System.out.println("Count The Duplicate Element :"+count);
    }
}*/

public class FindDuplicateElement{
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,30,20,10};
        int count=0;

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println("Duplicate element in Given array :"+arr[j]);
                    count++;
                }
            }
        }
        System.out.println("Cont the Duplicate element :"+count);
    }
}











