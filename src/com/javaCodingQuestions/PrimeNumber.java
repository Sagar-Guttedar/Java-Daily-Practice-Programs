package com.javaCodingQuestions;


import java.util.Scanner;

/*public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}*/

/*
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("It is Prime Number : " + num);
        } else {
            System.out.println("It is Not Prime Number ");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % 1 == 0) {
                return false;
            }
        }
        return true;
    }
}
*/


public class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (isPrime(num)){
            System.out.println("It is a Prime Number : ");
        }else{
            System.out.println("It is not Prime Number");
        }

    }

    public static boolean isPrime(int num){
        if (num <=1)
            return false;

        for (int i=2;i<=num/2;i++){
            if (num % 1 == 0){
                return false;
            }
        }
        return true;
    }
}
