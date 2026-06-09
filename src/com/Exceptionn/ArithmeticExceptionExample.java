package com.Exceptionn;

// Occurs when an illegal arithmetic operation, like division by zero, is attempted

/*public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int result=a/b;
        }catch (ArithmeticException ae){
            ae.printStackTrace();
        }
    }
}*/


/*

public class ArithmeticExceptionExample{
    public static void main(String[] args) {
        int a=10, b=0;
        try {
            int c=a/b;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}*/


/*
public class ArithmeticExceptionExample{
    public static void main(String[] args) {
        int a=10,b=0,c;
        try {
            c=a/b;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}*/


public class ArithmeticExceptionExample{
    public static void main(String[] args) {
        int a=10,b=0,c;
        try {
            c=10/0;
        }catch (ArithmeticException ae){
            ae.printStackTrace();
        }
    }
}