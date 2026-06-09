package com.intr1;

public class Car implements Benz {

    public void drive(){
        System.out.println("Hii all, I am driving a new Benz car");
    }

    public static void main(String[] args) {

        Benz b = new Car();
        b.drive();
        b.test1();
        b.test2();
        Benz.test3();
        Benz.test4();
    }
}
