package com.intr1;

@FunctionalInterface
public interface Benz {
    void drive();

    default void test1(){
        System.out.println("Hi all, I am a test1 method");
    }

    default void test2(){
        System.out.println("Hi all, I am a test2 method");
    }

    static void test3(){
        System.out.println("Hi all, I am a test3 method");
    }

    static void test4(){
        System.out.println("Hi all, I am a test4 method");
    }
}
