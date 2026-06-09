package com.str;

import org.w3c.dom.ls.LSOutput;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello ");
        System.out.println("SB value is  :"+sb);

        sb.append("Good morning ");
        System.out.println("Appending Value of  sb :"+sb) ;
        /*sb.append("Good evening");
        System.out.println("value is :"+sb);
        sb.append(" Sagar");
        System.out.println("Value is :" +sb);*/

        sb.insert(5, "good");
        System.out.println("Inserting value is : "+sb);

        sb.replace(5,10,"Sagar");
        System.out.println("Repalce Valiue is :"+sb);

        sb.delete(5,10);
        System.out.println("After deletion : "+sb);

        String s2 =sb.reverse().toString();
        System.out.println("Reverse String is : "+s2);

       String s3=String.valueOf(sb.reverse());
       System.out.println("String 2 is: "+s3);


       String s4=String.valueOf(sb.reverse());
       System.out.println("Vuale : " +s4);

       String s5=String.valueOf(sb.reverse());
       System.out.println("valueeeeeeeeeeeeeeeeeeeeeeee : "+s5);


    }
}














































