/*
public class Propogation {
    int a=10,b=10,c=0;

    public void method1(){
        System.out.println("Started executing method1.");
        try {
            method2();
        }catch (ArithmeticException ae){
            ae.printStackTrace();
        }
        System.out.println("Finished Executing the method1.");
    }

    public void method2(){
        System.out.println("Started executing method2");
        method3();
        System.out.println("Finished Executing method3");
    }

    public void method3(){
        System.out.println("Started Executing method3 ");
    }

    public static void main(String[] args) {
        Propogation p=new Propogation();
        p.method1();
    }
}
*/



/*
public class Propogation{

    int a=10,b=10,c=0;

    public void method1(){
        System.out.println("Started Executing method1 ");
        try {
            method2();
        }catch (ArithmeticException ae){
            ae.printStackTrace();
        }
        System.out.println("Finished Executing method1");
    }

    public void method2(){
        System.out.println("Started Executing method2");
        method3();
        System.out.println("Finished Executing method 2");
    }

    public void method3(){
        System.out.println("Started Executing method 3.");
    }

    public static void main(String[] args) {
        Propogation p=new Propogation();
        p.method1();
    }

}

*/



public class Propogation{
    int a=10,b=10,c=0;

    public void method1(){
        System.out.println("Started Executing method1");
        try {
            method2();
        }catch (ArithmeticException ae){
            ae.printStackTrace();
        }
        System.out.println("Finished Executing method1");
    }

    public void method2(){
        System.out.println("Started Executing method2");
        method3();
        System.out.println("Finished Executing method2");
    }

    public void method3(){
        System.out.println("Sarted Executing method3");
    }


    public static void main(String[] args) {
        Propogation p = new Propogation();
        p.method1();
    }
}














