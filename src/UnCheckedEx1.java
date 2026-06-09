
/*public class UnCheckedEx1 {
    int a = 10, b=0, c;
   public void test(){
       try{
           c=a/b;
       }catch(ArithmeticException ae){
           ae.printStackTrace();
       }
       System.out.println("Value of c : "+c);
   }

    public static void main(String[] args) {
        UnCheckedEx1 u = new UnCheckedEx1();
        u.test();
        System.out.println("Finished executing the main method");
    }
}*/



/*
public class UnCheckedEx1{
    int a=10,b=0,c;

    public void test(){
        try {
            c=a/0;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("Value of c : "+c);
    }

    public static void main(String[] args) {
        UnCheckedEx1 c= new UnCheckedEx1();
        c.test();
        System.out.println("Finished Executing the main method.");
    }
}*/



/*
public class UnCheckedEx1{
    int a=10,b=0,c;

    public void test(){
        try {
            c=a/0;
        }catch (ArithmeticException ae ){
            ae.printStackTrace();
        }
        System.out.println("Value of C : "+c);
    }

    public static void main(String[] args) {
        UnCheckedEx1 c = new UnCheckedEx1();
        c.test();
        System.out.println("FInshed Executing the main method");
    }
}
*/




public class UnCheckedEx1{
    int a=10,b=0,c;

    public void test(){
        try {
            c=a/0;
        }catch (ArithmeticException ae){
            ae.printStackTrace();
        }
        System.out.println("Value od C is : "+c);
    }

    public static void main(String[] args) {
        UnCheckedEx1 c = new UnCheckedEx1();
        c.test();
        System.out.println("Finished Executing the main method.");
    }
}











