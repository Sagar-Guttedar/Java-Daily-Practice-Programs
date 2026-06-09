package com.intr1;

public class TestConnections {

    public static void main(String[] args){

        MySQLConnect mc = new MySQLConnect();
        OracleConnect oc = new OracleConnect();
        DB2Connect dc = new DB2Connect();

        mc.testConnect();
        oc.testConnect();
        dc.testConnect();

        mc.testDisConnect();
        oc.testDisConnect();
        dc.testDisConnect();


    }
}
