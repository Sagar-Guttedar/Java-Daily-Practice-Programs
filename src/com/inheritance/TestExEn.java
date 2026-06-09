package com.inheritance;

public class TestExEn {
    public static void main(String[] args) {
        EnEx n=new EnEx();
        n.setId(123);
        n.setName("Sagar");
        n.setSal(25000.43f);

        System.out.println("Id : "+n.getId()+" Name :"+n.getName());
        System.out.println("Salary : "+n.getSal());
    }
}