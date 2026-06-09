package com.intr;

public class Calculate implements Square,Cube{

    @Override
    public void test2() {
        System.out.println("Hi all, I am from test2 method");
    }

    @Override
    public void find(int x) {
        double no = Math.sqrt(x);
        System.out.println("Square root of given no :"+no);
    }

    @Override
    public void test() {

    }

    @Override
    public void test1() {
        System.out.println("Hi all, I am from test1 method");
    }

    public static void main(String[] args) {
        Calculate ca = new Calculate();
        ca.find(1024);
        ca.test1();
        ca.test2();
    }
}
