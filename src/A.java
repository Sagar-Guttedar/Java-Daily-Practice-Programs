 public class A {
    int age;
    float sal;

    public A() {
        System.out.println("Hi all, I am no argumented constructor from  class A");
    }

    public A(int age){
        this.age=age;
        System.out.println("Age from class A:"+age);
    }

    public A(int age, float sal){
        this.age=age;
        this.sal=sal;
        System.out.println("Hi all, I am double argumented constructor");
        System.out.println("Age is "+age+" Sal is "+sal);
    }

    public void test(){
        System.out.println("I am a test method");
    }

    public void display(int age, float sal){
        this.age=age;
        this.sal=sal;
        System.out.println("Age is "+age+" Sal is "+sal);
        System.out.println("I am display method");
    }
}
