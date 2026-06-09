package com.allJavaPro;

import java.io.FileInputStream;
import java.util.Properties;

public class Course {
    int id;
    String name;
    float fees;

    public void store() throws Exception{
        FileInputStream fis = new FileInputStream("C:/Users/Sagar Guttedar/OneDrive/Desktop/Joctopus/a1.java");
        Properties pr = new Properties();
        pr.load(fis);
        id = Integer.parseInt(pr.getProperty("cid"));
        name =pr.getProperty("name");
        fees = Float.parseFloat(pr.getProperty("fees"));
    }

    public void display(){
        System.out.println("Course Id : "+id);
        System.out.println("Course Name : "+name);
        System.out.println("Course Fees : "+fees);
    }

    public static void main(String[] args) throws Exception {
        Course c = new Course();
        c.store();
        c.display();
    }
}
