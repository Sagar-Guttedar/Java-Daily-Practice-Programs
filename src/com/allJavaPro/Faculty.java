package com.allJavaPro;

/*
public class Faculty {
    int fid;
    String fname;
    float salary;

    public Faculty(){
        System.out.println("Hi all, I am no argumented constructor from faculty class : ");
    }
    public Faculty(int id){
        fid = id;
        System.out.println("Hi all, I am Single argumented constructor from faculty class : ");
        System.out.println("Faculti Id is : "+fid);
    }

    public Faculty(int id, String name){
        fid = id;
        fname = name;
        System.out.println("Hi all, I am Double argumented constructor from faculty class :");
        System.out.println("Faculty Id : "+fid+" Faculty name : "+fname);
    }


    public Faculty(int id, String name, float sal){
        fid = id;
        fname = name;
        salary = sal;
        System.out.println("Hi all, I am three argumented constructor from faculty class : ");
        System.out.println("Faculty id : "+fid+" Faculty name : "+fname+" Faculty Salary : "+salary);
    }

    public static void main(String[] args) {
        Faculty f = new Faculty(10,"sagar",50000);
    }
}
*/



public class Faculty{
    int fid;
    String fname;
    float salary;

    public Faculty(){
        System.out.println("Hi all, I am Noo argumented constructor from Faculty class.");
    }

    public Faculty(int id){
        fid = id;
        System.out.println("Hi all, I am Single argumented Constructor from Faculty class.");
        System.out.println("Faculty Id is : "+fid);
    }

    public Faculty(int id, String name){
        fid = id;
        fname = name;
        System.out.println("Hi all, I am Double argumented Constructor from Faculty class.");
        System.out.println("Faculty id : "+fid+" Faculty name : "+fname);
    }

    public Faculty(int id, String name, float sal){
        fid = id;
        fname =name;
        salary = sal;
        System.out.println("Hi all, I am Three argumented Constructor from Faculty class.");
        System.out.println("Faculty Id : "+fid+" Faculty Name : "+fname+" Faculty Salary : "+salary);
    }

    public static void main(String[] args) {
        Faculty f = new Faculty(10, "sagar", 50000);
    }

}













