package com.array;

/*public class PrimeNumberEx {
    public static void main(String[] args) {
        int num=8;
        if (num<=1){
            System.out.println("Prime number");
        }else{
            System.out.println("Not Prime Number.");
        }
    }
}*/

/*public class PrimeNumberEx{
    public static void main(String[] args) {
        int num=8;
        if (num<=1){
            System.out.println("Prime number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
}*/

/*
public class PrimeNumberEx{
    public static void main(String[] args) {
        int num = 10;

        if (num<=1){
            System.out.println("Prime number. ");
        }else{
            System.out.println("Not Prime Number");
        }
    }
}*/


/*
public class PrimeNumberEx{
    public static void main(String[] args) {
        int num = 0;

        if (num<=1){
            System.out.println("Prime number.");
        }else{
            System.out.println("Not Prime number");
        }
    }
}
*/


import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

/*
public class PrimeNumberEx{
    String decider;
    Scanner sc = new Scanner(System.in);
    public void testPrime(){
        do{
            System.out.println("Enter the element : ");
            int s=sc.nextInt();

            if (s<=1){
                System.out.println("Prime Number.");
            }else{
                System.out.println("Not Prime Number");
            }
            System.out.println("Do you Want to check Another Number.");
            decider=sc.next();
        }while(decider.equalsIgnoreCase("yes"));
    }
    public static void main(String[] args) {
        PrimeNumberEx p = new PrimeNumberEx();
        p.testPrime();
    }
}
*/

/*public class PrimeNumberEx{
    public static void main(String[] args) {
        int n=0;

        if (n<=1){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
}*/


/*public class PrimeNumberEx{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The element : ");
        int n = sc.nextInt();

        if (n<=1){
            System.out.println("Prime Number.");
        }else{
            System.out.println("Not Prime Number.");
        }
    }
}*/









/*public class PrimeNumberEx{

    Scanner sc= new Scanner(System.in);
    String decider;
    public void test(){
        do {
            System.out.println("Enter Element : ");
            int a = sc.nextInt();

            if (a<=1){
                System.out.println("Prime Number");
            }else{
                System.out.println("Not Prime Number");
            }
            System.out.println("Do you want to check another number");
            decider= sc.next();
        }while(decider.equalsIgnoreCase("Yes"));
    }
    public static void main(String[] args) {
        PrimeNumberEx p = new PrimeNumberEx();
        p.test();
    }
}*/


import java.util.Scanner;

public class PrimeNumberEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(num + (isPrime ? " is a Prime Number" : " is not a Prime Number"));
    }
}









