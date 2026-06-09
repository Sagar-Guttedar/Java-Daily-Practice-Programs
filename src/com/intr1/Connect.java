package com.intr1;

public interface Connect {
    void testConnect();

    default void testDisConnect(){
        System.out.println("Disconnecting from the database");
    }

    static void noOfUsers(){
        System.out.println("Thousends of people are getting connected");
    }
}
