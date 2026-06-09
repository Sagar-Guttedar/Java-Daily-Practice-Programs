public class C extends A{
    public void letsCheck(){
        System.out.println("I amm from class C");
        super.display(25, 5000.34f);
        System.out.println("Age is "+super.age+" Salary is "+super.sal);
    }

    public static void main(String[] args) {
        C c =  new C();
        c.letsCheck();
    }
}
