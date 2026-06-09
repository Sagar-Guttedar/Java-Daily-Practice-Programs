package com.javaPrograms;

// To check given number is positive or negetive or zero


/*public class PositiveNegetive{
    public static void main(String[] args) {
        int num = 10;
        if (num>0){
            System.out.println("positive ");
        }else if(num<0){
            System.out.println("Negetive");
        }else{
            System.out.println("Zero");
        }
    }
}*/

/*
public class PositiveNegetive{
    public static void main(String[] args) {
        int num=10;
        if (num>0){
            System.out.println("Positive");
        }else if(num<0){
            System.out.println("Negative");
        }else{
            System.out.println("zero");
        }
    }
}
*/





/*import java.util.Scanner;

public class PositiveNegetive{
    public static void main(String[] args) {
        int num;
        String decider;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a String : ");
            num=sc.nextInt();
            if (num > 0) {
                System.out.println("Positive number :");
            } else {
                System.out.println("Negetive number : ");
            }
            System.out.println("Do you want to check another number :");
            decider=sc.next();
        }while(decider.equalsIgnoreCase("yes"));
    }
}*/










/*public class PositiveNegetive {
    public static void main(String[] args) {
        int num=10;
        if (num>0){
            System.out.println("Positive ");
        }else if(num<0){
            System.out.println("Negetive ");
        }else{
            System.out.println("Zero");
        }
    }
}*/

/*
public class PositiveNegetive{
    public static void main(String[] args) {
        int num=0;
        if (num>0){
            System.out.println("Positive");
        } else if (num<0) {
            System.out.println("Negetive");
        }else {
            System.out.println("Zero");
        }
    }
}*/


/*
public class PositiveNegetive{
    public static void main(String[] args) {
        int num=0;
        if (num>0){
            System.out.println("positive");
        }else if(num < 0 ){
            System.out.println("Negetive");
        }else{
            System.out.println("Zero");
        }
    }
}*/

/*public class PositiveNegetive{
    public static void main(String[] args) {
        int num=0;
        if (num > 0){
            System.out.println("Positive ");
        }else if (num < 0){
            System.out.println("Negetive");
        }else {
            System.out.println("Zero");
        }
    }
}*/

/*public class PositiveNegetive{
    public static void main(String[] args) {
        int num =1;

        if (num > 0){
            System.out.println("Positive");
        }else if(num < 0){
            System.out.println("Negetive");
        }else{
            System.out.println("Zero");
        }
    }
}*/


/*public class PositiveNegetive{
    public static void main(String[] args) {
        int num=0;

        if (num > 0){
            System.out.println("Positive ");
        }else if (num < 0){
            System.out.println("Negetive");
        }else{
            System.out.println("Zero");
        }
    }
}*/


/*import java.util.Scanner;

public class PositiveNegetive{
    public static void main(String[] args) {
        String decider;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a Number : ");
            int num=sc.nextInt();

            if (num > 0){
                System.out.println("Given Number is Positive.");
            }else if (num < 0){
                System.out.println("Given Number is Negetive.");
            }else{
                System.out.println("Given Number is Zero.");
            }
            System.out.println("Do you want to check another Number.");
            decider=sc.next();
        }while(decider.equalsIgnoreCase("Yes"));
    }
}*/

import java.util.Scanner;

public class PositiveNegetive{
    public static void main(String[] args) {
        String decider;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter a Number :");
            int num = sc.nextInt();

            if (num > 0){
                System.out.println("Positive");
            }else if (num < 0){
                System.out.println("Negetive");
            }else{
                System.out.println("Zero");
            }
            System.out.println("Do you want to check another Number.");
            decider=sc.next();
        }while(decider.equalsIgnoreCase("Yes"));
    }
}










