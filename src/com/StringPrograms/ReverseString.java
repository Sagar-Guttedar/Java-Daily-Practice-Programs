package com.StringPrograms;

// To How to reverse the sting

// In java We can reverse the String In 4 ways.
//   1. By using toCharArray() method.
//   2. By using charAt(int index).
//   3. By using java.lang.StringBuffer class provided reverse method.
//   4. By using java.lang.StringBuilder class provided reverse() method






// How to reverse the string

// In java we can reverse string in 4 ways.
//1.by using toCharArray() method;
//2.Bu using charAt() methos
//By using java.lang.StringBuffer class provided reverse() method.
//By using java.lang.StringBuilder class provided reverse() method

public class ReverseString {
    public static void main(String[] args) {
        String str="hello";

        char[] chArr = str.toCharArray();
        for(int i=chArr.length-1; i>=0;i--){
            System.out.print(chArr[i]);
        }
        System.out.println("");

        char[] chArr1 = str.toCharArray();
        for(int i=chArr.length-1;i>=0;i--){
            System.out.print(chArr[i]);
        }


        System.out.println("");

        String str1 = "Sagar";
        for (int i=str1.length()-1;i>=0;i--){
            System.out.print(str1.charAt(i));
        }
        System.out.println("");

        StringBuffer sb = new StringBuffer((str1));
        System.out.println(sb.reverse());
        System.out.println("");

        StringBuilder sb2 =new StringBuilder(str1);
        System.out.println(sb2.reverse());



    }
}






















/*
public class ReverseString{
    public static void main(String[] args) {
        String str="hello";

        char[] chArr=str.toCharArray();
        for (int i=chArr.length-1;i>=0; i--){
            System.out.print(chArr[i]);
        }
        System.out.println("");
        for (int i=str.length()-1; i>=0;i--){
            System.out.print(str.charAt(i));
        }

        System.out.println("");

        StringBuffer sb=new StringBuffer(str);
        System.out.print(sb.reverse());

        System.out.println("");

        StringBuilder sb1 = new StringBuilder(str);
        System.out.print(sb1.reverse());




        StringBuilder sb2 = new StringBuilder(str);
        System.out.println(sb2.reverse());

    }

}
*/

/*public class ReverseString {
    public static void main(String[] args) {
        String str = "sagar";


        // Approach - 1  By using toCharArray() method.

        char[] chArr = str.toCharArray();
        for(int i= chArr.length-1; i>=0;i--){
            System.out.print(chArr[i]);
        }

        System.out.println("");

        // Approach - 2 By using charAt(int index) method.

        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }

        System.out.println("");

        // Approach - 3 By using java.lang.StringBuffer class provide reverse() method.
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        System.out.println("");
        // Approach - 4 By Using java.lang.StringBuilder class provide reverse() method.

        StringBuilder sb1 = new StringBuilder(str);
        System.out.println(sb1.reverse());


    }

}*/
