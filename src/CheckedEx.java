import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
public class CheckedEx {
    String name;
    int id;

    InputStreamReader ins =new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ins);

    public void store(){
        try{
            System.out.println("Enter Id");
            id = Integer.parseInt(br.readLine());
            System.out.println("Enter name");
            name = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Finished Executing Store Method");
    }

    public void display(){
        System.out.println("ID is :"+id+" Name is : "+name);
    }


    public static void main(String[] args){
        CheckedEx c=new CheckedEx();
        c.store();
        c.display();
    }
}
*/

/*
public class CheckedEx{
    String name;
    int id;

    InputStreamReader ins = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(ins);


    public void store(){
        try {
            System.out.println("Enter ID :");
            id=Integer.parseInt(br.readLine());
            System.out.println("Enter name : ");
            name=br.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Finished Executing store method.");
    }

    public void display(){
        System.out.println("Id : "+id+" Name : "+name);
    }

    public static void main(String[] args) {
        CheckedEx c = new CheckedEx();
        c.store();
        c.display();
    }

}*/


/*public class CheckedEx{
    String name;
    int id;

    InputStreamReader ins = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(ins);

    public void store(){
        try {
            System.out.println("Enter Id : ");
            id=Integer.parseInt(br.readLine());
            System.out.println("Enter name : ");
            name=br.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Finished executing store emthod.");
    }

    public void display(){
        System.out.println("Id : "+id+" Name  :"+name);
    }

    public static void main(String[] args) {
        CheckedEx c = new CheckedEx();
        c.store();
        c.display();
    }
}*/


public class CheckedEx{
    String name;
    int id;

    InputStreamReader ins = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(ins);

    public void store(){
        try {
            System.out.println("Enter Id : ");
            id = Integer.parseInt(br.readLine());
            System.out.println("Enter name : ");
            name=br.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Finished Executing store method.");
    }

    public void display(){
        System.out.println("Id : "+id+" Name  :"+name);
    }

    public static void main(String[] args) {
        CheckedEx c = new CheckedEx();
        c.store();
        c.display();
    }
}





















