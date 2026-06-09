/*
public class UnCheckedEx3 {

    public void test(){
        String n=null;
        int x = 0;
        try{
            x=n.length();
        }catch (ArithmeticException ae){
            ae.printStackTrace();
            System.out.println("From Arithmetic block");
        }catch (ArrayIndexOutOfBoundsException ne){
            ne.printStackTrace();
            System.out.println("NullPointerException block");
        } finally{
            System.out.println("From finally block");
        }
        System.out.println("Length of the String is:  "+x);
    }

    public static void main(String[] args){
        UnCheckedEx3 u= new UnCheckedEx3();
        u.test();
    }
}
*/


/*public class UnCheckedEx3{


    public void test(){
        String n=null;
        int x=0;
        try {
            x=n.length();
        }catch (ArithmeticException ae){
            ae.printStackTrace();
            System.out.println("From ArithmeticException block.");
        }catch (ArrayIndexOutOfBoundsException ai){
            ai.printStackTrace();
            System.out.println("From NullPointerException : ");
        }finally {
            System.out.println("From Finally block  :");
        }
    }

    public static void main(String[] args) {
        UnCheckedEx3 u = new UnCheckedEx3();
        u.test();
    }
}*/


/*public class UnCheckedEx3{

    public void test(){
        String n=null;
        int x=0;
        try {
            x=n.length();
        }catch (ArithmeticException ae){
            ae.printStackTrace();
            System.out.println("From ArithmeticException block.");
        }catch (ArrayIndexOutOfBoundsException ai){
            ai.printStackTrace();
            System.out.println("From NullPointerException block");
        }finally{
            System.out.println("From finally block : ");
        }
    }

    public static void main(String[] args) {
        UnCheckedEx3 u = new UnCheckedEx3();
        u.test();
    }
}*/




public class UnCheckedEx3{

    public void test(){
        String n=null;
        int x=0;
        try{
            x=n.length();
        }catch (ArithmeticException ae){
            ae.printStackTrace();
            System.out.println("I am From ArithmeticException block.");
        }catch (ArrayIndexOutOfBoundsException ai){
            ai.printStackTrace();
            System.out.println("I am From NullPointerException block.");
        }finally{
            System.out.println("I am From Finally Block. ");
        }
    }

    public static void main(String[] args) {
        UnCheckedEx3 u=new UnCheckedEx3();
        u.test();
    }

}












