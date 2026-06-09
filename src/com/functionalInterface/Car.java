package com.functionalInterface;

public class Car implements Benz {

    public void drive(){
        System.out.println("Hii, I am Driving a  New Benz Car.");
    }

    public static void main(String[] args) {
        Benz b = new Car();
        b.drive();
        b.test1();
        b.test2();
        b.test3();
        b.test4();

    }
}
