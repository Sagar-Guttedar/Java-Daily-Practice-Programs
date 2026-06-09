package com.intr;

public class LetTestConnection implements TestConnection {

    public void disConnect(String dbname) {
        System.out.println("Dis connectiong from " +dbname+ " database");
    }


    @Override
    public void connect(String dbname) {
        System.out.println("Connectiong to " +dbname+ " database");
    }


    public static void main(String[] args) {
        LetTestConnection l = new LetTestConnection();
        l.connect("MySQL");
        l.disConnect("MySQL");
    }
}



