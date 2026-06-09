import java.util.Scanner;

/*public class UnChekedEx2 {
    int a[];
    int size;

    Scanner sc = new Scanner(System.in);

    public void save(){
        System.out.println("Enter the size of an array : ");
        size=sc.nextInt();
        a=new int[size];
        for (int i=0;i<=size;i++){
            try {
                System.out.println("Enter the element : ");
                a[i]=sc.nextInt();
            }catch (ArithmeticException ae){
                System.out.println("From Arithmetic Exception block. ");
                ae.printStackTrace();
            }catch (ArrayIndexOutOfBoundsException ai){
                System.out.println("From ArrayIndexOutOfBoundException block.");
                ai.printStackTrace();
            }
            System.out.println("Saved the element in the array.");
        }
    }
    public void display(){
        for (int i=0;i<=size;i++){
            System.out.println("Value are : "+a[i]);
        }
    }

    public static void main(String[] args) {
        UnChekedEx2 c = new UnChekedEx2();
        c.save();
        c.display();
    }

}*/



public class UnChekedEx2{
    int a[];
    int size;

    Scanner sc=new Scanner(System.in);

    public void save(){
        System.out.println("Enter the size of an array : ");
        size=sc.nextInt();
        a=new int[size];
        for (int i=0;i<=size;i++){
            try {
                System.out.println("Enter the Element : ");
                a[i]=sc.nextInt();
            }catch (ArithmeticException ae){
                System.out.println("From ArithmeticException block.");
                ae.printStackTrace();
            }catch (ArrayIndexOutOfBoundsException ai){
                System.out.println("From ArrayIndexOutOfBoundException block.");
                ai.printStackTrace();
            }
            System.out.println("Saved the element in the array: ");
        }
    }

    public void display(){
        for (int i=0;i<=size;i++){
            System.out.println("Value Are : "+a[i]);
        }
    }

    public static void main(String[] args) {
        UnChekedEx2 u = new UnChekedEx2();
        u.save();
        u.display();
    }

}








