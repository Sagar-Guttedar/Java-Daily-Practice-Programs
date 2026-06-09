package com.test;

import java.util.Scanner;

/*public class Palindromee {
    String s1,s2="",decider;
    Scanner sc = new Scanner(System.in);

    public void testPalindromee(){
        do{
            System.out.println("Enter a String : ");
            s1=sc.next();

            for (int i =s1.length()-1;i>=0;i-- ){
                s2 +=s1.charAt(i);
            }
            if (s1.equals(s2)){
                System.out.println("The given string is palindrome : ");
            }else{
                System.out.println("Given String is not palindrome : ");
            }
            System.out.println("Do you want to check another String : ");
            decider = sc.next();
            s2 = "";
        }while(decider.equalsIgnoreCase("yes"));
    }

    public static void main(String[] args) {
        Palindromee p = new Palindromee();
        p.testPalindromee();
    }
}*/





/*public  class Palindromee{
    String s1,s2="", decider;
    Scanner sc = new Scanner(System.in);

    public void testPalindrome() {
        do {
            System.out.println("Enter the String : ");
            s1 = sc.next();

            for (int i = s1.length() - 1; i>=0;i--) {
                s2 += s1.charAt(i);
            }
            if (s1.equals(s2)) {
                System.out.println("Given String is Palindrome: ");
            } else {
                System.out.println("Given String is not Palindrome : ");
            }

            System.out.println("Do you want to check another String : ");
            decider = sc.next();
            s2 = "";
        } while (decider.equalsIgnoreCase("yes"));
    }

    public static void main(String[] args) {
        Palindromee p = new Palindromee();
        p.testPalindrome();
    }

}*/


/*public class Palindromee{
    String s1,s2="",decider;
    Scanner sc =new Scanner(System.in);

    public void testPalindrome(){
        do {
            System.out.println("Enter a String :");
            s1 = sc.next();

            for (int i = s1.length() - 1; i >= 0; i--) {
                s2 += s1.charAt(i);
            }
            if (s1.equals(s2)) {
                System.out.println("Given String is Palindrome");
            } else {
                System.out.println("Given String is not Palindrome");
            }
            System.out.println("Do you want to check another String :");
            decider = sc.next();
            s2 = "";

        } while (decider.equalsIgnoreCase("yes"));
    }

    public static void main(String[] args) {
        Palindromee p =new Palindromee();
        p.testPalindrome();
    }
}*/



/*
public class Palindromee{
    String s1,s2="",decider;
    Scanner sc =new Scanner(System.in);

    public void testPalindrome(){
        do {
            System.out.println("Enter a String :");
            s1=sc.next();

            for(int i=s1.length()-1;i>=0;i--){
                s2 +=s1.charAt(i);
            }

            if (s1.equals(s2)){
                System.out.println("Given String is Palindrome.");
            }else{
                System.out.println("Given String is not Palindrome.");
            }
            System.out.println("Do you want to check another String :");
            decider=sc.next();
            s2="";
        }while (decider.equalsIgnoreCase("yes"));
    }

    public static void main(String[] args) {
        Palindromee p=new Palindromee();
        p.testPalindrome();
    }
}*/


/*
public class Palindromee{
    String s1,s2="",decider;
    Scanner sc = new Scanner(System.in);

    public void test(){
        do {
            System.out.println("Enter the String : ");
            s1 =sc.next();

            for(int i=s1.length()-1;i>=0;i--){
                s2 +=s1.charAt(i);
            }

            if (s1.equals(s2)){
                System.out.println("Given String is Palindrome.");
            }else{
                System.out.println("Given String is not Palindrome.");
            }
            System.out.println("Do you want to check another String :");
            decider = sc.next();
            s2="";
        }while (decider.equalsIgnoreCase("yes"));
    }

    public static void main(String[] args) {
        Palindromee p = new Palindromee();
        p.test();
    }
}*/

/*public class Palindromee{
    String s1, s2="",decider;
    Scanner sc=new Scanner(System.in);

    public void test(){
        do {
            System.out.println("Enter the first");
            s1=sc.next();

            for (int i=s1.length()-1;i>=0;i--){
                s2 +=s1.charAt(i);
            }
            if (s1.equals(s2)){
                System.out.println("Given String is Palindrome");
            }else{
                System.out.println("Given String is not Palindrome");
            }
            System.out.println("Do you want to check another String");
            decider=sc.next();
            s2="";
        }while(decider.equalsIgnoreCase("yes"));
    }

    public static void main(String[] args) {
        Palindromee p = new Palindromee();
        p.test();
    }
}*/


/*public class Palindromee{
    String s1,s2="",decider;
    Scanner sc = new Scanner(System.in);

    public void test(){
        do {
            System.out.println("Enter the String.");
            s1=sc.next();

            for (int i=s1.length()-1;i>=0;i--){
                s2 +=s1.charAt(i);
            }
            if (s1.equals(s2)){
                System.out.println("Given String is Palindrome");
            }else{
                System.out.println("Given String is not Palindrome");
            }
            System.out.println("Do you want to check another String.");
            decider=sc.next();
            s2="";
        }while(decider.equalsIgnoreCase("yes"));
    }

    public static void main(String[] args) {
        Palindromee p = new Palindromee();
        p.test();
    }
}*/

/*public class Palindromee{
    String s1,s2="",decider;
    Scanner sc = new Scanner(System.in);

    public void test(){
        do{
            System.out.println("Enter a String : ");
            s1=sc.next();

            for(int i=s1.length()-1;i>=0;i--){
                s2 +=s1.charAt(i);
            }

            if (s1.equals(s2)){
                System.out.println("Given String is Palindrome.");
            }else{
                System.out.println("Given String is not Palindrome");
            }
            System.out.println("Do you want to check another String.");
            decider = sc.next();
            s2="";
        }while (decider.equalsIgnoreCase("yes"));
    }

    public static void main(String[] args) {
        Palindromee p= new Palindromee();
        p.test();
    }
}*/



public class Palindromee{
    String s1,s2="",decider;
    Scanner sc = new Scanner(System.in);

    public void test(){
        do{
            System.out.println("Enter the String : ");
            s1=sc.next();

            for (int i=s1.length()-1;i>=0;i--){
                s2 +=s1.charAt(i);
            }

            if (s1.equals(s2)){
                System.out.println("Given String is Palindrome ");
            }else{
                System.out.println("Given String is not Palindrome");
            }

            System.out.println("Do you want to check another String : ");
            decider = sc.next();
            s2="";
        }while(decider.equalsIgnoreCase("yes"));

    }

    public static void main(String[] args) {
        Palindromee p = new Palindromee();
        p.test();
    }

}










