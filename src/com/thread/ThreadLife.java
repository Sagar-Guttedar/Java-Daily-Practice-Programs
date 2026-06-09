package com.thread;


public class ThreadLife implements Runnable{

    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Value of I : "+i+Thread.currentThread().getState());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        ThreadLife t = new ThreadLife();
        Thread t1 = new Thread(t);
        System.out.println("State is "+Thread.currentThread().getState());
        t1.start();
        for(int j=10;j>=7;j--){
            Thread.sleep(2000);
            System.out.println("Value of J : "+j);
        }
        System.out.println("Checking its state "+t1.getState());
    }

}





