package com.str;

/*public class StrEx1 {
    public static void main(String[] args) {
        String s = "Hi Good morning ";
        String s1[] = s.split(" ");
        //for loop
        for (int i = 0; i < s1.length; i++) {
            System.out.println("String is :" + s1[i]);
        }

        System.out.println("______");
        //Enhanced for loop
        for (String s2 : s1) {
            System.out.println("values are: " + s2);
        }
    }
}*/

/*public class StrEx1 {
    public static void main(String[] args) {
        String s="Hi Good Morning Sagar";
        String s1[] =s.split(" ");
        // for loop
        for(int i=0; i<s1.length; i++){
            System.out.println("String is : "+s1[i]);
        }

        System.out.println("_____________________________");
        // Enhanced for loop
        for (String s2:s1){
            System.out.println("Value is :"+s2);
        }
    }
}*/


/*public class StrEx1{
    public static void main(String[] args) {
        String s="Hi all good morning sagar";
        String s1[]=s.split(" ");
        // for loop
        for(int i=0; i<s1.length; i++){
            System.out.println("String is :"+s1[i]);
        }
        System.out.println("--------------------------");

        //for Enhanced for loop
        for (String s2:s1){
            System.out.println("Value are: "+s2);
        }

    }
}*/


/*public class StrEx1{
    public static void main(String[] args) {
        String s="hello good morning ";
        String s1[] =s.split(" ");
        //for loop
        for (int i = 0; i<s1.length; i++){
            System.out.println("String is:"+s1[i]);
        }
        System.out.println("------------------");

        //Enhanced for loop
        for (String s2:s1){
            System.out.println("Value is :"+s2);
        }
    }
}*/


public class StrEx1{
    public static void main(String[] args) {
        String s="hello Good Morning";
        String s1[]=s.split("n");
        for (int i =0; i<3; i++){
            System.out.println("Splitted String is :"+s1[i]);
        }
        System.out.println("________________________");
        // Enhanced for loop
        for(String s2 :s1){
            System.out.println("value is :"+s2);
        }
    }
}
