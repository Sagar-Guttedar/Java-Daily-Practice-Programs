package com.typec;

//Implicit Casting (Widening Casting)
//It occurs automatically when a smaller data type is assigned to a larger data type.
//No data loss occurs during this process.
  //      Example: byte → short → int → long → float → double

/*public class ImplicitCasting {
    public static void main(String[] args) {
        int num = 100;
        double d = num;  // int to double
        System.out.println("Integer value: " + num);
        System.out.println("Double value: " + d);
    }
}*/

public class ImplicitCasting{
    public static void main(String[] args) {
        int num = 100;
        double d=num;
        System.out.println("Integer value : "+num);
        System.out.println("Double Value : "+d);
    }
}