package com.OOPS;

public class TestSingleInheritance {
    public static void main(String[] args) {
        B b=new B();
        b.setId(123);
        b.setName("sagar");
        b.setFees(200000.23f);

        int x=b.getId();
        String n=b.getName();

        System.out.println("Id is : "+x);
        System.out.println("Name : "+n);
        System.out.println("Fees is :"+b.getFees());
    }
}
