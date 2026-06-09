/*
public class UnCheckedEx4 {
    public void finalize(){
        System.out.println("Inside the finalize method");
        System.gc();
    }

    public static void main(String[] args) {
        UnCheckedEx4 u=new UnCheckedEx4();
        u.finalize();
    }
}
*/
/*
public class UnCheckedEx4{

    public void Finalize(){
        System.out.println("Inside the finalize method.");
        System.gc();
    }
    public static void main(String[] args) {
        UnCheckedEx4 c = new UnCheckedEx4();
        c.Finalize();
    }
}*/



public class UnCheckedEx4{
    public void Finalize(){
        System.out.println("Inside Finalize method ");
        System.gc();
    }

    public static void main(String[] args) {
        UnCheckedEx4 u= new UnCheckedEx4();
        u.Finalize();
    }
}