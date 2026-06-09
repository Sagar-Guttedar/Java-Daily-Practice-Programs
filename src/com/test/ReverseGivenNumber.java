package com.test;

// Write a program to reverse the given number : 54321
// Using StringBuilder
/*public class ReverseGivenNumber {
    public static void main(String[] args) {
        int number = 54321;
        String reverse = new StringBuilder(String.valueOf(number)).reverse().toString();
        System.out.println(reverse);
    }
}*/

// Using Array
/*public class ReverseGivenNumber {
    public static void main(String[] args) {
        int number = 54321;
        char[] ch = String.valueOf(number).toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}*/
/*public class ReverseGivenNumber{
    public static void main(String[] args) {
        int numbers =54321;

        System.out.print("Reversed Given Number : ");
        char[] ch=String.valueOf(numbers).toCharArray();
        for (int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]+" ");
        }
    }
}*/

/*public class ReverseGivenNumber{
    public static void main(String[] args) {
        int numbers = 54321;

        System.out.print("Reversed Given string : ");
        char[] ch=String.valueOf(numbers).toCharArray();
        for (int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}*/

/*public class ReverseGivenNumber{
    public static void main(String[] args) {
        int numbers =54321;

        System.out.print("Reversed Given Number : ");
        char[] ch=String.valueOf(numbers).toCharArray();
        for (int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}*/

/*
public class ReverseGivenNumber{
    public static void main(String[] args) {
        int numbers=54321;

        System.out.print("Reversed Given Number : ");
        char[] ch=String.valueOf(numbers).toCharArray();
        for (int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}*/


/*
public class ReverseGivenNumber{
    public static void main(String[] args) {
        int numbers =54321;

        System.out.println("Reversed Given Numbers : ");
        char[] ch=String.valueOf(numbers).toCharArray();
        for (int i=ch.length-1;i>=0;i--){
            System.out.println(ch[i]);
        }
    }
}*/


/*
public class ReverseGivenNumber{
    public static void main(String[] args) {
        int numbers=54321;

        System.out.print("Reversed Given Numbers : ");
        char[] ch=String.valueOf(numbers).toCharArray();
        for (int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}*/

/*
public class ReverseGivenNumber{
    public static void main(String[] args) {
        int numbers = 12345;

        char[] ch = String.valueOf(numbers).toCharArray();
        for (int i=ch.length-1;i>=0;i++){
            System.out.println();
        }
    }
}*/


/*public class ReverseGivenNumber{
    public static void main(String[] args) {
        int numbers= 12345;

        char[] ch =String.valueOf(numbers).toCharArray();
        for (int i=ch.length-1;i>=0; i--){
            System.out.print(ch[i]);
        }
    }
}*/


/*public class ReverseGivenNumber{
    public static void main(String[] args) {
        int numbers = 123456789;

        char[] ch=String.valueOf(numbers).toCharArray();
        for (int i=ch.length-1; i>=0;i--){
            System.out.println(ch[i]);
        }
    }
}*/


/*public class ReverseGivenNumber{
    public static void main(String[] args) {
        int numbers =12345;
        char[] ch = String.valueOf(numbers).toCharArray();
        for (int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}*/


// Ascending and Descending order given array.

import java.util.Arrays;

public class ReverseGivenNumber{
    public static void main(String[] args) {
        int numbers = 12373456;


        char[] ch = String.valueOf(numbers).toCharArray();
        Arrays.sort(ch);

        System.out.print("Descending Order : ");
        for (int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]+" ");
        }

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.print("Ascending Order : ");
        for (int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }
    }
}














