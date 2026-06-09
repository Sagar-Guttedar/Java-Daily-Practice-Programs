package com.constructor;

/*public class Faculty {
    int fid;
    String fname;
    float salary;

    public Faculty(){
        System.out.println("Hi all, I am No argument Constructor");
    }

    public Faculty(int fid) {
        this.fid = fid;
        System.out.println("Hii all, I am Single argumented constructor");
        System.out.println("Faculty id : "+fid);
    }

    public Faculty(int fid, String fname){
        this.fid=fid;
        this.fname=fname;
        System.out.println("Hi all, I am double Argumented constructor ");
        System.out.println("Faculty id : "+fid+" Faculty Name : "+fname);
    }

    public Faculty(int fid, String fname,float salary){
        this.fid=fid;
        this.fname=fname;
        this.salary=salary;
        System.out.println("Hii all, I am three Argumented constructor");
        System.out.println("Faculty id : "+fid+" Faculty Name : "+fname+" Faculty Salary : "+salary);
    }

    public static void main(String[] args) {
        Faculty f = new Faculty(1,"Sagar",54000);
    }
}*/


public class Faculty{
    int id;
    String name;
    float salary;

    public Faculty(){
        System.out.println("Hi all, i am No argumented Constructor ");
    }

    public Faculty(int id){
        this.id=id;
        System.out.println("Hi all, I am single argumented Constructor.");
        System.out.println("Faculty Id : "+id);
    }

    public Faculty(int id, String name){
        this.id=id;
        this.name=name;
        System.out.println("Hii all, I am Double Argumented Constructor");
        System.out.println("Faculty Id : "+id+"  Faculty Name : "+name);
    }

    public static void main(String[] args) {
        Faculty f=new Faculty(1,"sagar");
    }
}