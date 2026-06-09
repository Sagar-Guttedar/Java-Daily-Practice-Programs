package com.StringBuffe;

public class StringBuffExample {
    public static void main(String[] args) {
        /* //StringBuffer
        StringBuffer sb = new StringBuffer("hello");
        System.out.println("Value is : "+sb);

        //append() method :
        sb.append(" good morning");
        System.out.println("Value of sb : "+sb);

        //Insert method
        sb.insert(6,"Joctopus");
        System.out.println("After insertion : "+sb);*/

        //replace() method
      /*  StringBuffer sb = new StringBuffer("hello");
        sb.replace(3,4,"o");
        System.out.println("After replaced value : "+sb);*/

      //delete method
        StringBuffer sb = new StringBuffer("hello");
        sb.delete(3,4);
        System.out.println("after deleting th string : "+sb);

        // Reverse() method
       /* String s1=sb.reverse().toString();
        System.out.println("String is : "+s1);*/

        StringBuffer sb1=new StringBuffer("naveen");
        String s5=sb1.reverse().toString();
        System.out.println("String reverse method : "+s5);

        String s6=String.valueOf(sb1.reverse());
        System.out.println("String valueOf method is : "+s6);



    }
}
