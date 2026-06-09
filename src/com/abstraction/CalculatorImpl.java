package com.abstraction;

/*public class CalculatorImpl  extends Calculator{

    public void add(int x, int y){
        int z=x+y;
        System.out.println("addition of two number  : "+z);
    }

    public void sub(int x, int y){
        int z =x-y;
        System.out.println("Substraction of 2 number :"+z);
    }

    public static void main(String[] args) {
        CalculatorImpl c=new CalculatorImpl();
        c.add(10,20);
        c.sub(20,10);
        c.mul(10,10);
        c.div(20,10);
    }
}*/
public class CalculatorImpl extends Calculator{
    @Override
    public void add(int x, int y) {
        int z=x+y;
        System.out.println("Addition of two numbers : "+z);
    }

    @Override
    public void sub(int x, int y) {
        int z=x-y;
        System.out.println("Substraction of two number : "+z);
    }

    public static void main(String[] args) {
        CalculatorImpl c = new CalculatorImpl();
        c.add(10,10);
        c.sub(20,10);
        c.mul(10,10);
        c.div(40,10);

    }
}