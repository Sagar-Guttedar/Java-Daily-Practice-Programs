package com.str;

public class StEx {


    public static void main(String[] args) {
       //String Literal
        String s="hello";
        System.out.println("String Literal is  :"+s);

        // String Non Literal :
        String s1 =new String("Hii");
        System.out.println("String Non Literal is :"+s1);

        // CharAt method : Char
        // it returns the character  present at the specific index.
        char c=s.charAt(3);
        System.out.println("Character is present in specific index :"+c);

        // length method : int
        // It returns the length of the string.
        int x = s1.length();
        System.out.println("Length of the string is :"+x);

        //concat or + Method
        // it will combine the two string.
        String s2="Good Evening Sagar";

        // String s3=s1.concat(s2);
        String s3= s1+s2;
        System.out.println("After concatenation is :"+s3);

        // toUppercase : String
        // It will convert entire string into Upper case letter.
        System.out.println("Convert the string into Upper Case : "+s2.toUpperCase());



        //toLowerCase: String
        // It Will convert entire String into Lower case letter.
        String s4="HII GOOOOOOOOD";
        System.out.println("String s4 is: "+s4);
        System.out.println("To convert string into lower case letter :"+s4.toLowerCase());

        //startWith: boolean
        //Checks whether given string is starting with the substring or not. If it is Starting it returns true otherwise it retuurns false.
        String s5="Welcome to my MyRoom";
        String s6="Wel";
        boolean b=s5.startsWith(s6);
        System.out.println("Checking b :"+b);


        // endsWith : boolean
        // Checks wether given string is stating with substring or not. It it is Ending it returns True else returns false.
        String s7="oom";
        boolean b1=s5.endsWith(s7);
        System.out.println("Checks endsWith Method : "+b1);


        //substring ; String
        // returns the part of the string.
        String s9="Hi sagar good morning What are you doing?";
        String s10=s9.substring(9);
        System.out.println("Substring is  :"+s10);



    }
}