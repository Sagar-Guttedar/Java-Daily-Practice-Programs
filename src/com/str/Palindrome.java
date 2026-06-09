package com.str;

import java.util.Scanner;

/*
public class Palindrome{

    String s1, s2="", decider;
    Scanner sc = new Scanner(System.in);

    public void testPalindrome(){

        do {
            System.out.println("Enter a String :");
            s1=sc.next();

            for (int i=s1.length()-1;i>=0;  i--){
                s2 += s1.charAt(i);
            }
            if (s1.equals(s2))
                System.out.println("Given String is Palindrome.");
            else
                System.out.println("Given string is not palindrome.");

            System.out.println("Do you want to check another string :(Yes / No)");
            decider = sc.next();
            s2="";
        }while(decider.equalsIgnoreCase("Yes"));
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.testPalindrome();
    }
}*/


/*
public class Palindrome{

    String s1, s2="", decider;
    Scanner sc = new Scanner(System.in);


    public void testPalindrome(){

        do{
            System.out.println("Enter a String :");
            s1=sc.next();
            for (int i=s1.length()-1; i>=0; i--){
                s2 +=s1.charAt(i);
            }
            if(s1.equals(s2))
                System.out.println("Given string is palindrome :");
            else
                System.out.println("The given string is not paalindrome :");

            System.out.println("Do you want to check another String :(Yes / No)");
            decider =sc.next();
            s2 ="";
        }while(decider.equalsIgnoreCase("Yes"));
    }

    public static void main(String[] args){
        Palindrome p= new Palindrome();
        p.testPalindrome();
    }
}*/

/*
public class Palindrome{
    String s1, s2 ="",decider;
    Scanner sc = new Scanner(System.in);

    public void testPlaindrome(){
        do {
            System.out.println("Enter a string");
            s1 = sc.next();

            for (int i = s1.length()-1; i>=0;i--) {
                s2 += s1.charAt(i);
            }
            if (s1.equals(s2)) {
                System.out.println("Given String is Palindrome : ");
            } else {
                System.out.println("Given String is not Palindrome : ");
            }
            System.out.println("Do yo want to check another String : ");
            decider =sc.next();
            s2 = "";
        }while(decider.equalsIgnoreCase("yes"));
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.testPlaindrome();
    }
}*/

/*
public class Palindrome {
    String s1, s2 ="",decider;
    Scanner sc = new Scanner(System.in);

    public void testPalindrome(){
        do{
            System.out.println("Enter A String : ");
            s1=sc.next();

            for (int i = s1.length()-1; i>=0;i--) {
                s2 += s1.charAt(i);
            }

            if (s1.equals(s2)){
                System.out.println("Given String is Palindrome : ");
            }else{
                System.out.println("Given String is not palindrome : ");
            }
            System.out.println("Do you want to check another word : ");
            decider=sc.next();
            s2="";
        }while(decider.equalsIgnoreCase("yes"));
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.testPalindrome();
    }
}
*/

public class Palindrome{
    String s1, s2="",decider;
    Scanner sc = new Scanner(System.in);

    public void testPalindrome(){
        do {
            System.out.println("Enter a String : ");
            s1 = sc.next();

            for (int i = s1.length()-1; i>=0;i--) {
                s2 += s1.charAt(i);
            }
            if (s1.equals(s2)){
                System.out.println("Given String is Palindrome : ");
            }else{
                System.out.println("Given String is not Palindrome : ");
            }
            System.out.println("Do you want to check another String : ");
            decider=sc.next();
            s2 ="";
        }while(decider.equalsIgnoreCase("yes"));
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.testPalindrome();
    }
}













