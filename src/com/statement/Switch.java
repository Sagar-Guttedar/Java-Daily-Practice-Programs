package com.statement;

/*
public class Switch {
    int a,b,c;
    String ops;

    public void save(int x, int y, String z){
        a = x;
        b = y;
        ops = z;
    }


    public void test(){
        switch(ops) {
            case "add":
                c = a + b;
                System.out.println("Addition of two number :" + c);
                break;
            case "sub":
                c = a - b;
                System.out.println("Substraction of two number :" + c);
                break;

            case "mul":
                c = a * b;
                System.out.println("Multiplication of two numbers :" + c);
                break;

            case "div":
                c=a/b;
                System.out.println("Division of two numbers : "+c);
                break;

            default :
                System.out.println("You have not selected any operator :");
                break;
        }

    }

    public static void main(String[] args) {
        Switch s = new Switch();
        s.save(100,20, "div");
        s.test();
    }
}
*/


public class Switch{
    int a,b,c;
    String ops;

    public void save(int x, int y, String z){
        a = x;
        b = y;
        ops = z;
    }

    public void test(){
        switch(ops){
            case "add":
                c=a+b;
                System.out.println("Addition of two numbers :"+c);
                break;
            case "sub":
                c=a-b;
                System.out.println("Substration of two numbers :"+c);
                break;
            case "mul":
                c=a*b;
                System.out.println("Multiplication of two numbers :"+c);
                break;
            case "div":
                c=a/b;
                System.out.println("Division of two numbers :"+c);
                break;
            default :
                System.out.println("You have not any operator");
        }
    }

    public static void main(String[] args){
        Switch s = new Switch();
        s.save(100,20,"div");
        s.test();
    }
}