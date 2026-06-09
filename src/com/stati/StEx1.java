package com.stati;

/*public class StEx1 {
    int a = 10;
    static int b=20;

    public void test(){
        System.out.println("Value of A : "+a);
        System.out.println("Value of B : "+b);
        a++;
        b++;
    }

    public static void main(String[] args) {
        StEx1 s1= new StEx1();
        StEx1 s2= new StEx1();

        s1.test();
        s2.test();
        s1.test();
    }
}*/


public class StEx1{
    int a=10;
    static int b =20;

    public void test(){
        System.out.println("Value of B : "+a);
        System.out.println("Value of B : "+b);
        a++;
        b++;

    }

    public static void main(String[] args) {
        StEx1 s1 = new StEx1();
        StEx1 s2 = new StEx1();

        s1.test();
        s2.test();
        s1.test();
    }
}