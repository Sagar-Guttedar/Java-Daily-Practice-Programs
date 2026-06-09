package com.Exceptionn;

/* public class PropogationExample {

    public static void method1() {
        int result = 10 / 0;
    }

    public static void method2() {
        method1();
    }
    public static void method3() {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in method3: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        method3();
    }
}*/

public class PropogationExample{

    public static void method1(){
        int result=10/0;
    }

    public static void method2(){
        method1();
    }

    public void method3(){
        try {
            method2();
        }catch (ArithmeticException ae){
            System.out.println("Exception caught in method3 :"+ae.getMessage());
        }
    }

    public static void main(String[] args) {

    }
}

