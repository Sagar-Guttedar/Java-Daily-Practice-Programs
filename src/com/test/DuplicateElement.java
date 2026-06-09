package com.test;

/*public class DuplicateElement {
    public static void main(String[] args) {
        int[] inputArray={10,5,10,30,20,40,50,60,70,60,10};

        for (int i=0; i< inputArray.length;i++){
            for (int j=i+1; j< inputArray.length;j++){
                if (inputArray[i] == inputArray[j]){
                    System.out.println("Duplicate elements found : "+inputArray[i]);
                }
            }
        }
    }
}*/

/*public class DuplicateElement{
    public static void main(String[] args) {
        int[] input = {10,20,30,10,20,40};
        int count=0;

        for(int i=0;i<input.length;i++){
            for (int j=i+1;j<input.length;j++){
                if (input[i]==input[j]){
                    System.out.println("Duplicate Element in given array : "+input[j]);
                    count++;
                }
            }
        }
        System.out.println("Duplicate element count : "+count);
    }
}*/

/*public class DuplicateElement{
    public static void main(String[] args) {
        int[] inputArray={100,200,300,400,200,300,100,500,600};
        int count=0;

        for (int i=0;i<inputArray.length;i++){
            for (int j=i+1;j<inputArray.length;j++){
                if (inputArray[i]==inputArray[j]){
                    System.out.println("Duplicate element in given array : "+inputArray[i]);
                }
            }
        }
        System.out.println("duplicate element count :"+count);
    }
}*/



/*public class DuplicateElement{
    public static void main(String[] args) {
        int[] input = {10,20,10,40,20,30,30,40,50};
        int count = 0;

        for (int i=0;i<input.length;i++){
            for (int j =i+1;j<input.length;j++){
                if (input[i]==input[j]){
                    System.out.println("Duplicate element : "+input[j]);
                    count++;
                }
            }
        }
        System.out.println("Duplicate element count  :"+count);
    }
}*/











/*
public class DuplicateElement{
    public static void main(String[] args) {
        int[] arr ={10,20,30,30,20,40,50,70,60,60};
        int count=0;

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j]){
                    System.out.println("Duplicate element in given Array : "+arr[j]);
                    count++;
                }
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("Count the duplicate element : "+count);
    }
}*/

/*public class DuplicateElement{
    public static void main(String[] args) {
        int[] arr= {10,20,30,40,30,10,20,50,60,60,70,50};
        int count = 0;

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j]){
                    System.out.println("Duplicate element in given array : "+arr[j]);
                    count++;
                }
            }
        }
        System.out.println("-----------------------------------");
        System.out.println("Count the duplicate element in given array : "+count);
    }
}*/


/*public class DuplicateElement{
    public static void main(String[] args) {
        String str = "java developer";
        int count=0;
        char[] ch=str.toCharArray();

        for (int i=0;i<ch.length;i++){
            for (int j=i+1;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    System.out.println("Duplicate element : "+ch[j]);
                    count++;
                }
            }
        }
        System.out.println("Count the duplicate Character : "+count);
    }
}*/


public class DuplicateElement{
    public static void main(String[] args) {
        String str = "Java Developer";
        int count = 0;

        char[] ch=str.toCharArray();
        for (int i=0;i<ch.length;i++){
            for (int j=0;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    System.out.println("Duplicate element in given string : "+ch[j]);
                    count++;
                }
            }
        }
        System.out.println("Count Duplicate element : "+count);
    }
}







