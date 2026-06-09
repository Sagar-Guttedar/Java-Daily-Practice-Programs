package com.StringPrograms;

public class StringSplitMeethod {
    public static void main(String[] args) {
        /*String s ="Hi good morning";
        String s1[]=s.split("n");
        for (int i=0;i<s1.length;i++){
            System.out.println("String is : "+s1[i]);
        }*/

        /*String s="hi good morning sagar";
        String s1[]=s.split("o");
        for (int i=0;i<s1.length;i++) {
            System.out.println("String is : " +s1[i]);
        }

        System.out.println("----------------");
        */

        /*String s2="sagar";
        String s3[]=s2.split("g");
        for (int i=0;i<s3.length;i++){
            System.out.println(" String is :"+s3[i]);
        }

        System.out.println("----------------------------");
        // Enhanced for loop

        for(String s4:s3){
            System.out.println("Value are : "+s4);
        }*/

        String s="Sagar";
        String s1[]=s.split("g");
        for (int i=0;i<s1.length;i++) {
            System.out.println("String is : " + s1[i]);
        }

        // Enhanced for loop
        for (String s3:s1){
            System.out.println("Value are : "+s3);
        }

    }
}
