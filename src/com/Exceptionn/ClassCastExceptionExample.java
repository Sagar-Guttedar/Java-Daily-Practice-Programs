package com.Exceptionn;

// Occurs when an object is cast to a class that it’s not an instance of.
/*
public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object obj = "String";
        try {
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }
}*/


/*public class ClassCastExceptionExample{
    public static void main(String[] args) {
        Object obj="String";
        try {
            Integer num=(Integer) obj;
        }catch (ClassCastException c){
            c.printStackTrace();
        }
    }
}*/

/*

public class ClassCastExceptionExample{
    public static void main(String[] args) {
        Object obj="String";
        try {
            Integer num=(Integer) obj;
        }catch (ClassCastException c){
            c.printStackTrace();
        }
    }
}*/


public class ClassCastExceptionExample{
    public static void main(String[] args) {
        Object obj="String";
        try {
            Integer num=(Integer)obj;
            System.out.println(num);
        }catch (ClassCastException c){
            c.printStackTrace();
        }
    }
}