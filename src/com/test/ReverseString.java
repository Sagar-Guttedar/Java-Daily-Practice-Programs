package com.test;

public class ReverseString {
    public static void main(String[] args) {
        String str = "sagar";

        // Using toCharArray
        char[] chArr=str.toCharArray();
        for (int i=chArr.length-1;i>=0;i--){
            System.out.print(chArr[i]);
        }
        System.out.println("");


        System.out.println("----------------------------------------");

        // Using charAt() method
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println("");

        System.out.println("----------------------------------------");

        // Using StringBuffer
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        System.out.println("----------------------------------------");

        //Using StringBuilder
        StringBuilder sb1 = new StringBuilder(str);
        System.out.println(sb1.reverse());
    }
}

