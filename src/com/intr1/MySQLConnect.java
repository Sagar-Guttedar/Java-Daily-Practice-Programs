package com.intr1;

public class MySQLConnect implements Connect{
    public void testConnect(){
        System.out.println("Connection successfull for MySQL DB");
    }

    public void testDisConnect(){
        System.out.println("Getting Disconnect from the MySQL Database");
    }
}
