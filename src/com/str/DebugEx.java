package com.str;

import java.util.Scanner;

public class DebugEx {
    int a, b, c;
    String ops;
    Scanner sc = new Scanner(System.in);

    public void test() {
        System.out.println("Enter the operation you want to perform");
        ops = sc.next();
        System.out.println("Enter a val");
        a = sc.nextInt();
        System.out.println("Enter b val");
        b = sc.nextInt();
        switch (ops) {
            case "ADD":
                c = a + b;
                System.out.println("Addition of two values " + c);
                break;
            case "SUB":
                c = a - b;
                System.out.println("Substraction of two values " + c);
                break;
            case "MUL":
                c = a * b;
                System.out.println("Multiplication of two values " + c);
                break;

            default:
                System.out.println("No operation got selected");
                break;

        }
    }
    public static void main(String[] args) {
        DebugEx d = new DebugEx();
        d.test();
    }
}
