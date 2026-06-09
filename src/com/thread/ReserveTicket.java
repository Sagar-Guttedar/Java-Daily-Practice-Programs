package com.thread;

import java.util.Scanner;

/*
public class ReserveTicket extends Thread{
    int available =10;
    int wanted=1;
    Scanner sc = new Scanner(System.in);

    public synchronized void run(){
        System.out.println("Enter how many seats you want to reserve : ");
        wanted = sc.nextInt();

        if(wanted <= available){  //If the number of seats requested (wanted) is less than or equal to the available seats, the booking is allowed.
            System.out.println("Booking the ticket : "+Thread.currentThread().getName());
            available -= wanted; // Available
            try {
                Thread.sleep(2000); // Thread is puased for 2 seconds
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("Sorry seats are not available : "+Thread.currentThread().getName());
        }

    }

    public static void main(String[] args) {
        ReserveTicket r = new ReserveTicket();
        Thread t1 = new Thread(r, "A");
        Thread t2 = new Thread(r, "B");

        t1.start();
        t2.start();

    }
}*/




/*
public class ReserveTicket extends Thread{
    int available =10;
    int wanted =2;

    Scanner sc = new Scanner(System.in);

    public  void run(){
        synchronized(this){
            System.out.println("Enter how many seats you to book: ");
            wanted =sc.nextInt();
            if(wanted <= available) {
                System.out.println("Booking successfull : " + Thread.currentThread().getName());
                available -= wanted;

                try {
                    Thread.sleep(2000);
                }catch (InterruptedException e) { // InterruptedException
                    throw new RuntimeException(e);
                }
            }else{
                System.out.println("Sorry, Seats are not avialbale : ");
            }
        }

    }

    public static void main(String[] args) {
        ReserveTicket t = new ReserveTicket() ;
        Thread t1 = new Thread(t, "Sagar");
        Thread t2 = new Thread(t, "Guttedar");

        t1.start();
        t2.start();

    }
}*/



/*
public class ReserveTicket extends Thread{

    int available =10;
    int wanted =2;

    Scanner sc = new Scanner(System.in);

    public  synchronized void run() {

        System.out.println("Enter ticket you want to book :");
        wanted = sc.nextInt();

        if (wanted <= available) {
            System.out.println("Booking successfull : " + Thread.currentThread().getName());
            available -= wanted;

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("Sorry seats are not available ");
        }
    }

    public static void main(String[] args) {
        ReserveTicket r = new ReserveTicket();
        Thread t1 = new Thread(r, "Sagar");
        Thread t2 = new Thread(r, "Guttedar");

        t1.start();
        t2.start();
    }
}
*/


/*
public class ReserveTicket extends Thread {

    int available =10;
    int  wanted = 2;

    Scanner sc  = new Scanner(System.in);

    public synchronized void run(){

        System.out.println("Enter how many tickets you want to book : ");
        wanted=sc.nextInt();

        if(wanted <= available){
            System.out.println("Booking Successfully : " +Thread.currentThread().getName());
            available -= wanted;

            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("Sorry, seats are not available");
        }
    }

    public static void main(String[] args) {
        ReserveTicket s = new ReserveTicket();
        Thread t1 = new Thread(s, " Sagar");
        Thread t2 = new Thread(s, " Guttedar");

        t1.start();
        t2.start();

    }
}
*/


public class ReserveTicket{

}






















