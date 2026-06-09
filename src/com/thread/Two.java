package com.thread;

/*public class Two implements Runnable{
    @Override
    public void run() {
        for(int j=3;j>0;j--)
            System.out.println("Value of J "+j);
    }

    public void test(){
        System.out.println("Checking the test method");
    }

    public static void main(String[] args) {
        Two t = new Two();
        Thread t1 = new Thread(t);
        t1.start();
        t.test();
    }
}*/

/*public class Two implements Runnable{
    @Override
    public void run(){
        for (int i=1; i<=3;i++){
            System.out.println("Value of i :"+i);
        }
    }

    public void test(){
        System.out.println("Checking the test method :");
    }

    public static void main(String[] args) {
        Two t = new Two();
        Thread t1 = new Thread(t);
        t1.start();
        t.test();

    }
}*/


/*public class Two implements Runnable {

    @Override
    public void run() {
        for (int i=1;i<=3;i++){
            System.out.println("Value of i : "+i);
        }
    }

    public void test(){
        System.out.println("Checking the test method :");
    }

    public static void main(String[] args) {
        Two t=new Two();
        Thread t1 = new Thread(t);
        t1.start();
        t.test();
    }
}*/

public class Two implements Runnable{

    public void run(){
        for (int i=0;i<=3;i++){
            System.out.println("Value of i : "+i);
        }
    }

    public void test(){
        System.out.println("Checking the test method");
    }

    public static void main(String[] args) {
        Two t = new Two();
        Thread t1 = new Thread(t);
        t1.start();
        t.test();
    }
}