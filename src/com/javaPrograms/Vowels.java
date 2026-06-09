package com.javaPrograms;

// Write a Java Program To Check Given Character is Vowel or Not | Java Boolean Operator

/*public class Vowels{
    public static void main(String[] args) {
        char c = 'e';

        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Not vowel");
        }
    }
}*/


/*public class Vowels{
    public static void main(String[] args) {
        char c = 'e';

        if (c=='a' || c=='e' || c=='i' || c=='o' ||c=='u'){
            System.out.println("Vowels");
        }else{
            System.out.println("Not vowels");
        }
    }
}*/


/*public class Vowels {
    public static void main(String[] args) {
        char c ='i';
        if (c=='a' || c=='e'|| c=='i' || c=='o' || c=='u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Not vowel");
        }
    }
}*/

/*
public class Vowels {
    public static void main(String[] args) {
        char ch='e';
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Not vowel");
        }
    }
}*/

import java.util.Scanner;

/*
public class Vowels{
    public static void main(String[] args) {
        char ch = 'i';
        if (ch=='a' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Not vowel");
        }
    }
}*/



/*public class Vowels{
    public static void main(String[] args) {
        char ch = 'i';
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("The given letter is vowel.");
        }else{
            System.out.println("The given letter is not vowel.");
        }
    }
}*/

public class Vowels{
    public static void main(String[] args) {
        String decider;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a letter :");
            char ch=sc.next().charAt(0);

            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                System.out.println("Given Letter is Vowel.");
            }else{
                System.out.println("Given Letter is not Vowel.");
            }
            System.out.println("Do you want to check another Letter.");
            decider=sc.next();
        }while(decider.equalsIgnoreCase("yes"));
    }
}