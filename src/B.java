public class B extends A{
    String name;

    public B(){
        System.out.println("Hi all, I am no argumented constructor from class B");
    }

    public B(String name){
        this.name=name;
        System.out.println("Name is: "+name);
    }

    public void test(){
        super.test();
        super.display(18,3000.23f);
        System.out.println("Super class age is:"+super.age+"  Salary is "+super.sal);
    }

    public static void main(String[] args){
        B b = new B();
        b.test();
    }
}
















