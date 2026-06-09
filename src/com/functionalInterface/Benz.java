package com.functionalInterface;



@FunctionalInterface
public interface Benz {

    void drive();

    default  void test1(){
        System.out.println("Hii all I am in Method.");
    }

    default void test2(){
        System.out.println("Hii all I am test2 Method");
    }

    default void test3(){
        System.out.println("Hii all I am test3 method");
    }

    default void test4(){
        System.out.println("Hii al I am test4 method.");
    }
}



