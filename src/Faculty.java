package Constructor;
public class Faculty {
    int fid;
    String fname;
    float fsalary;

    public Faculty() {
        System.out.println("hi all im no arg constructor from faculty class");
    }

    public Faculty(int id) {
        fid = id;
        System.out.println("hi all iam single arg constructor");

        System.out.println("Faculty id is :" + id);
    }

    public Faculty(int id, String name) {
        fid = id;
        fname = name;
        System.out.println("hi all im a double arg constructor");
        System.out.println("Faculty id is : "+id+" name is :" +name);
    }

    public Faculty(int id, String name, float sal){
        fid = id;
        fname = name;
        fsalary = sal;
        System.out.println("hi all im a three arg constructor");
        System.out.println("faculty id is :" +id+"name is:" +name+ "salary is :" +sal);
    }

    public static void main(String[] args) {
        Faculty f = new Faculty(123, "abc", 123.254f);

    }
}