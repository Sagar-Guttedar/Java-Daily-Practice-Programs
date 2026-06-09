package com.str;

/*
public class StEx4 {
    public static void main(String[] args) {
        String s1 ="hello";
        String s2="hello";
        String s3 = new String("hello");
        String s4 = new String("hello");

        boolean b1 = s1 == s2;
        boolean b2 = s1.equals(s2);
        boolean b3 = s3 == s4;
        boolean b4 = s3.equals(s4);

        System.out.println("Boolean  1 "+b1);
        System.out.println("Boolean  2 "+b2);
        System.out.println("Boolean  3 "+b3);
        System.out.println("Boolean  4 "+b4);

        //equals & ==
        //equals method checks the content of the string
        // == it checks the address of the string
    }
}*/




public class StEx4{
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3=new String("hello");
        String s4= new String("hello");

        boolean b1=s1 == s2;
        boolean b2 = s1.equals(s2);
        boolean b3=s3 == s4;
        boolean b4 = s3.equals(s4);

        System.out.println("Boolean b1 value is :"+b1);
        System.out.println("Boolean b2 value is :"+b2);
        System.out.println("Boolean b3 value is :"+b3);
        System.out.println("Boolean b4 value is :"+b4);
    }
}