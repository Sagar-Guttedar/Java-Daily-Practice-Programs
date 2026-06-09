package com.str;

/*public class StringEx5 {
    public static void main(String[] args) {
        String s1 ="        hello        ";
        System.out.println("Before triming "+s1+" checking");
        System.out.println("After triming "+s1.trim()+" checking ");
    }
}*/


public class StringEx5{
    public static void main(String[] args) {
        String s1="         hello    good    morning        ";
        System.out.println("Before triming "+s1+" checking");
        System.out.println("After triming "+s1.trim()+" checking");

        String s2="good morning";
        System.out.println("Checks wether given string is Empty or not: "+s2.isEmpty());

        String s3 ="Data";
        System.out.println("Value of s3 is : "+s3);
        s3=s3+"Base";
        System.out.println("Value of s3 :"+s3);
        s3=s3+"MySQL";
        System.out.println("s3 is :"+s3);

    }

}