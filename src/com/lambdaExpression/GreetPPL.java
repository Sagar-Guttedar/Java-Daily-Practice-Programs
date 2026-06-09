package com.lambdaExpression;

public class GreetPPL {
    public static void main(String[] args) {
        Greetings g = (a)->{
            System.out.println("Greeting all the PPl");
            return a;
        };
        String s = g.greet("Good Evening.");
        System.out.println("With a message "+s);
    }
}
