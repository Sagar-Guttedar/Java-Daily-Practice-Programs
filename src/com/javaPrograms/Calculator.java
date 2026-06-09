package com.javaPrograms;

// Calculator program using Switch Staement
// input - 10 & 20  OutPut = 30

public class Calculator {
    public static void main(String[] args) {
        int num1 = 20, num2 = 10;
        String ops="sub";

        switch (ops){
            case "add":
                System.out.println(num1 + num2);
                break;
            case "sub":
                System.out.println(num1 - num2);
                break;
            case "mul":
                System.out.println(num1 * num2);
                break;
            case "div":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Not Valid Operation");
        }
    }
}
