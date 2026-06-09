package com.allJavaPro;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*public class Institute {
    int id;
    String iname, course;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void store() throws Exception{
        System.out.println("Enter Institute Id : ");
        id = Integer.parseInt(br.readLine());
        System.out.println("Enter Intitute Name :");
        iname = br.readLine();
        System.out.println("Enter Course Name : ");
        course  = br.readLine();
    }

    public void display(){
        System.out.println("Intitute Id : "+id);
        System.out.println("Institute name : "+iname);
        System.out.println("Course Name : "+course);
    }

    public static void main(String[] args) throws Exception {
        Institute i = new Institute();
        i.store();
        i.display();
    }
}*/



public class Institute{
    int id;
    String iname, course;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void store() throws Exception{
        System.out.println("Enter Institute Id : ");
        id = Integer.parseInt(br.readLine());
        System.out.println("Enter Institute Name : ");
        iname = br.readLine();
        System.out.println("Enter Course Name : ");
        course = br.readLine();
    }

    public void display(){
        System.out.println("Student Id  :"+id);
        System.out.println("Student Name : "+iname);
        System.out.println("Course Name : "+course);
    }

    public static void main(String[] args) throws Exception {
        Institute i = new Institute();
        i.store();
        i.display();
    }
}