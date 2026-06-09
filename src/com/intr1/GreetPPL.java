package com.intr1;

public class GreetPPL {
    public static void main(String[] args) {
       /* Greetings g = (a) ->{
            System.out.println("Greeting all the PPl");
            return a;
        };
        String s = g.greet("Good Evening");
        System.out.println("with a message"+s);*/

        Greetings g= (a,b)->{
            System.out.println("Doing addition of two numbers");
            int c = a+b;
            return c;
        };
        int x = g.add(100, 200);
        System.out.println(x);
    }
}
