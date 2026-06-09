package com.javaPrograms;
// To find Maximum out of two number
/*public class LargestNumber {
    public static void main(String[] args) {
        int num1=14, num2 = 15;
        if(num1>num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
}*/

/*public class LargestNumber{
    public static void main(String[] args) {
        int num1=10, num2=20;
        if (num1<num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
}*/

/*public class LargestNumber{
    public static void main(String[] args) {
        int num1=10,num2=20;
        if (num1>num2){
            System.out.println(num1);
        }else {
            System.out.println(num2);
        }
    }
}*/

/*public class LargestNumber{
    public static void main(String[] args) {
        int num1=10, num2=20;
        if (num1>num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
}*/


/*
public class LargestNumber{
    public static void main(String[] args) {
        int num1 =10, num2=20;
        if(num1>num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
}
*/


/*
public class LargestNumber{
    public static void main(String[] args) {
        int num1 , num2;
        String decider;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter first integer : ");
            num1=sc.nextInt();
            System.out.println("Enter Second Integer : ");
            num2=sc.nextInt();
            if (num1 > num2) {
                System.out.println(num1);
            } else {
                System.out.println(num2);
            }
            System.out.println("Do you want to check another number : ");
            decider=sc.next();
        }while(decider.equalsIgnoreCase("yes"));
    }
}*/


import java.util.Scanner;

public class LargestNumber{
    public static void main(String[] args) {
        int num1, num2;
        String decider;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a Fist Number");
            num1 =sc.nextInt();

            System.out.println("Enter Second Number");
            num2=sc.nextInt();

            if(num1 > num2){
                System.out.println("The Largest Number is : "+num1);
            }else if(num2 > num1){
                System.out.println("The Largest Number is : "+num2);
            }else{
                System.out.println("Both are equal.");
            }
            System.out.println("Do you want to check naother number : ");
            decider = sc.next();
        }while (decider.equalsIgnoreCase("yes"));

        System.out.println("Thank you for Largest number checker.");
    }
}