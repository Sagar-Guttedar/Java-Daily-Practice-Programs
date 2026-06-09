package com.StringPrograms;

public class StringExample {
    public static void main(String[] args) {
        // String literal
        String s="sagar";
        System.out.println("String Literal : "+s);

        //String non litetral
        String s1=new String("Sagar");
        System.out.println("String non Literal  :"+s1);

        //charAt method : char type : It returns the single characters at specified position.
        char c=s1.charAt(2);
        System.out.println("Charat : " +c);

        // Leangth method : int
        int x =s1.length();
        System.out.println("length of the given string : "+x);

        // concat() :
        String s3=s+s1;
        System.out.println("Canacete two String : "+s3);


        //toUptperCase()
        System.out.println("Convert String into UpperCase : "+s1.toUpperCase());


        //toLowerCase()
        String s4 ="HI ALL GOOD MORINING";
        System.out.println("Original String : "+s4);
        System.out.println("Convert entire string into lower case : "+s4.toLowerCase());


        // StartWith():boolean
        String s5="hi good maorning";
        String s6="hi go";
        boolean b=s5.startsWith(s6);
        System.out.println("Checking strart with : "+b);

        //endWith() : boolean
        String s7="ning";
        boolean b1=s5.endsWith(s7);
        System.out.println("Checks the endWith :"+b1);

        // SubString : Sring
        String s8 ="Hello Welcome to java world";
        String s9=s8.substring(6);
        System.out.println("Substring : "+s9);



    }
}
