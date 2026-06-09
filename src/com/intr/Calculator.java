package com.intr;

public class Calculator implements Calc{


    @Override
    public void add(int x, int y) {
        int z = x+y;
        System.out.println("Addition of two numbers"+z);
    }

    @Override
    public void sub(int x, int y) {
        int z = x-y;
        System.out.println("Substraction of two numbers"+z);
    }

    @Override
    public void mul(int x, int y) {
        int z = x*y;
        System.out.println("Multiplication of two numbers"+z);
    }

    @Override
    public void div(int x, int y) {
        int z = x%y;
        System.out.println("Division of two numbers"+z);
    }
}
