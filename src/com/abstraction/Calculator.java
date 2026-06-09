package com.abstraction;

/*public abstract class Calculator {


    public abstract void add(int x, int y);

    public abstract void sub(int x, int y);

    public void mul(int x, int y){
        int z = x*y;
        System.out.println("Multiplication of two numbers : "+z);
    }

    public void div(int x, int y){
        int z=x/y;
        System.out.println("Division of two numbers : "+z);
    }
}*/
public abstract class Calculator{

    public abstract void add(int x, int y);

    public abstract  void sub(int x, int y);

    public void mul(int x, int y){
        int z = x*y;
        System.out.println("Multiplication of two numbers : "+z);
    }

    public void div(int x,int y){
        int z=x/y;
        System.out.println("Division of two number : "+z);
    }
}