package com.typec;
//Explicit Casting (Narrowing Casting)
//It occurs when a larger data type is converted into a smaller data type manually.
//It may lead to data loss, and precision can be reduced.
//Example: double → float → long → int → short → byte

public class ExplicitCasting {
    public static void main(String[] args) {
        double d = 100.99;
        int num = (int) d;  // double to int
        System.out.println("Double value: " + d);
        System.out.println("Integer value: " + num);
    }
}

