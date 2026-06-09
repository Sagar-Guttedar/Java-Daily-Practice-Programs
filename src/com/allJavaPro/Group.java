package com.allJavaPro;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Group {
    int id;
    String name;
    float coll;

    Scanner sc = new Scanner(System.in);

    public void store(){
        System.out.println("Enter Group Id : ");
        id =sc.nextInt();
        System.out.println("Enter Group Name : ");
        name = sc.next();
        System.out.println("Enter Fees : ");
        coll = sc.nextFloat();
    }

    public void display(){
        System.out.println("Group Id : "+id);
        System.out.println("Group Name : "+name);
        System.out.println("Fees  : "+coll);
    }

    public static void main(String[] args) {
        Group g = new Group();
        g.store();
        g.display();
    }

}
