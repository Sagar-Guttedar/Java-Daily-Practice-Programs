package com.stati;


public class StEx {
    int a = 10;
    static int b = 20;

    public static void test1(){
        System.out.println("Testing the static variable "+b);
        // System.out.println("Testing the instance variable "+a);
    }
    public void test2(){
        System.out.println("Testing the static variable in test2 method "+b);
        System.out.println("Testing the instance variable in test2 method "+a);
    }

    public static void main(String[] args) {
        System.out.println("Inside main method "+StEx.b);
        StEx.test1();
        StEx s = new StEx();
        System.out.println("Inside main method lets test instance variable "+s.a);
        s.test2();
    }
}