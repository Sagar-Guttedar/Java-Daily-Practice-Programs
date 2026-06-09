package com.Exceptionn;

/*public class ThrowThrowsExample {
    public static void checkNumber(int number) throws ArithmeticException {
        if (number < 0) {
            throw new ArithmeticException("Number must be non-negative"); // Explicitly throwing an exception
        }
        System.out.println("Number is: " + number);
    }
    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}*/

/*public class ThrowThrowsExample{
    public static void checkNumber(int number) throws ArithmeticException{
        if (number <0 ){
            throw new ArithmeticException("Number must be non-negetive");
        }
        System.out.println("Number is :"+number);
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        }catch (ArithmeticException e){
            System.out.println("Exception cought : "+e.getMessage());
        }
    }
}*/

import com.OOPS.A;

/*
public class ThrowThrowsExample{
    public static void checkNumber(int number)throws ArithmeticException{
        if (number <0){
            throw new ArithmeticException("Number must be non-negative ");
        }
        System.out.println("Numbers id : "+number);
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        }catch (ArithmeticException ae){
            System.out.println("Exception Cought : "+ae.getMessage());
        }
    }
}*/

/*public class ThrowThrowsExample{
    public static void checkNumber(int number)throws ArithmeticException{
        if (number<0){
            throw new ArithmeticException("number must be non-negative");
        }
        System.out.println("Number is :"+number);
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        }catch (ArithmeticException ae){
            System.out.println("Exception cought :"+ae.getMessage());
        }
    }
}*/

public class ThrowThrowsExample{
    public static void checkNumber(int number) throws ArithmeticException{
        if(number<0){
            throw new ArithmeticException("The number must be non-negetive");
        }
        System.out.println("Number is:"+number);
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        }catch (ArithmeticException ae){
            System.out.println("Exception cought :"+ae.getMessage());
        }
    }
}
