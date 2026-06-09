package com.Exceptionn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "user", "pass");
        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}*/


/*
public class SQLExceptionExample{
    public static void main(String[] args) {
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname","username","passwd");
        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}*/



/*
public class SQLExceptionExample{
    public static void main(String[] args) {
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname","username","passwd");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}*/


public class SQLExceptionExample{
    public static void main(String[] args) {
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname","username","password");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}