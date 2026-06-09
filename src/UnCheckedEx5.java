/*public class UnCheckedEx5 {

    int a=10, b=10, c=0;

    public void test(){
        try{
            c=c/b;
        }catch (ArrayIndexOutOfBoundsException ae){
            ae.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("From Exception Block");
        }
        finally {
            System.out.println("From finally block");
        }
    }


    public static void main(String[] args) {
        UnCheckedEx5 u=new UnCheckedEx5();
        u.test();
    }
}*/



/*public class UnCheckedEx5{
    int a=10, b=0, c=0;
    public void test(){
        try {
            c=a/b;
        }catch (ArrayIndexOutOfBoundsException ai){
            ai.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("From Exception : ");
        }finally {
            System.out.println("From finally block.");
        }
    }

    public static void main(String[] args) {
        UnCheckedEx5 u = new UnCheckedEx5();
        u.test();
    }
}*/


public class UnCheckedEx5{
    int a=10,b=10,c;
    public void test(){
        try {
            c=a/b;
        }catch (ArrayIndexOutOfBoundsException ai){
            ai.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("From finally block.");
        }
    }

    public static void main(String[] args) {
        UnCheckedEx5 u =new UnCheckedEx5();
        u.test();
    }
}
















