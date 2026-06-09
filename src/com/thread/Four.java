package com.thread;

/*
public class Four extends Thread {

    public void run(){
        for (int i=1; i<=3; i++){
            System.out.println(" Value of I : "+i+" "+Thread.currentThread().getName());
            // System.out.println("Value of I "+i+" "+Thread.currentThread().getName());
            */
/*System.out.println("Value of  i  :  "+i+"  "+Thread.currentThread().getName());
            System.out.println("Value of  I :"+i+" "+Thread.currentThread().getName());
            System.out.println("Value of i:"+i+" "+Thread.currentThread().getName());*//*

        }
    }

    public static void main(String[] args) {
        Four f = new Four();
        Thread t1 =  new Thread(f);
        Thread t2 =  new Thread(f);


        t1.setName("Sagar");
        t2.setName("Guttedar");


    */
/*  t1.setName("Sagar");
        t1.setName("Guttedar");*//*


        t1.start();
        t2.start();
    }
}
*/


/*
public class Four extends Thread{

    public void run(){
        for (int i=1; i<=3; i++){
            System.out.println("Value of i : "+i+" "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Four f = new Four();
        Thread t1 = new Thread(f);
        Thread t2 = new Thread(f);

        t1.setName("MyThread1");
        t2.setName("MyThread2");

        t1.start();
        t2.start();
    }
}*/


/*
public class Four extends Thread{

    public  void run(){
        for(int i=0;i<=3;i++){
            System.out.println("Value of i : "+i+ " "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Four f = new Four();
        Thread t1 = new Thread(f);
        Thread t2 = new Thread(f);

        t1.setName("MyThread1");
        t2.setName("MyThread2");

        t1.start();
        t2.start();
    }
}*/
/*
public class Four extends Thread {
    public synchronized void run(){
        for(int i=0;i<=3;i++){
            System.out.println("Value of I : "+i+ ""+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Four f = new Four();
        Thread t1 =new Thread(f);
        Thread t2 = new Thread(f);

        t1.setName("Sagar");
        t2.setName("Naveen");

        t1.start();
        t2.start();
    }
}*/


import java.util.concurrent.ThreadPoolExecutor;

public class Four extends Thread{
    public synchronized void run(){
        for (int i=1;i<=3;i++){
            System.out.println("Value of i : "+i+" "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Four f = new Four();
        Thread t1 = new Thread(f);
        Thread t2 = new Thread(f);

        t1.setName("A");
        t2.setName("B");

        t1.start();
        t2.start();
    }
}