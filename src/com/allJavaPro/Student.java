package com.allJavaPro;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*public class Student {
    int id;
    String name;
    float fees;

    InputStreamReader ins = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(ins);

    public void store() throws Exception{
        System.out.println("Enter Student Id : ");
        id =Integer.parseInt(br.readLine());
        System.out.println("Enter Student Name : ");
        name =br.readLine();
        System.out.println("Enter Student Fees : ");
        fees = Float.parseFloat(br.readLine());
    }

    public void display(){
        System.out.println("Student Id : "+id);
        System.out.println("Student Name : "+name);
        System.out.println("Student Fess : "+fees);
    }

    public static void main(String[] args) throws Exception{
        Student s = new Student();
        s.store();
        s.display();
    }

}*/



public class Student{
    int id;
    String name;
    float fees;


    InputStreamReader ins = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(ins);

    public void store() throws Exception{
        System.out.println("Enter Student id : ");
        id = Integer.parseInt(br.readLine());
        System.out.println("Enter Student Name : ");
        name = br.readLine();
        System.out.println("Enter Student Fees  : ");
        fees = Float.parseFloat(br.readLine());
    }

    public void display(){
        System.out.println("Student Id : "+id);
        System.out.println("Student Name : "+name);
        System.out.println("Student Fees  :"+fees);
    }

    public static void main(String[] args) throws Exception{
        Student s = new Student();
        s.store();
        s.display();
    }
}