package com.test;


import java.util.Scanner;

// It is simply a name given to numbers where the sum of the digits equals the product of the digits.

/*
public class SPYPro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        int sum = 0, product = 1;

        while (num > 0) {
            int id = num % 10;
            sum =sum+id;
            product = product * id;
            num = num / 10;
        }
        if (sum == product) {
            System.out.println("It is a SPY number");
        } else {
            System.out.println("It is NOT a SPY number");
        }
    }
}
*/


import java.util.Scanner;

/*
public class SPYPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int n = sc.nextInt();

        int d,s = 0,p=1;
        while(n!=0) {
            d = n % 10;
            s = s + d;
            p = p * d;
            n = n / 10;
        }
        if(s==p){
            System.out.println("The given number is SPY.");
        } else{
            System.out.println("The given number is not SPY. ");
        }
    }
}*/
/*
public class SPYPro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int sum=0, p=1,id;
        while (n !=0 ){
            id = n%10;
            sum=sum+id;
            p=p*id;
            n=n/10;
        }
        if (sum==p){
            System.out.println("Given number is spy");
        }else{
            System.out.println("given number is not SPY");
        }
    }
}*/
/*public class SPYPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n =sc.nextInt();
        int sum=0, p=1, id;
        while(n !=0){
            id=n%10;
            sum=sum+id;
            p=p*id;
            n=n/10;
        }
        if (sum==p){
            System.out.println("Given String is SPY");
        }else{
            System.out.println("Given String is not SPY");
        }
    }
}*/
public class SPYPro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int sum=0, p=1,id;
        while(n !=0){
            id =n%10;
            sum=sum+id;
            p=p*id;
            n=n/10;
        }
        if (sum == p){
            System.out.println("Given Number is SPY.");
        }else {
            System.out.println("Given Number is not SPY");
        }
    }
}