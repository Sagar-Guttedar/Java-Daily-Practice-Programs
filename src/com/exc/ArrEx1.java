/*
package com.exc;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrEx1 {
    int size;
    String s[];
    Scanner sc = new Scanner(System.in);


    public void saveInfo(){
        System.out.println("Enter the size of array :");
        size= sc.nextInt();
        s=new String[size];
        for (int i=0; i<size; i++){
            System.out.println("Enter the value :");
            s[i] = sc.next();
        }
    }


    public void display(){
        for (String ss: s){
            System.out.println("Value are:"+ss);
        }
    }

    public static void main(String[] args){
        ArrEx1 ae=new ArrEx1();
        ae.saveInfo();
        ae.display();
    }
}
*/

import java.util.Scanner;

public class ArrEx1{
    int size;
    String s[];
    Scanner sc =new Scanner(System.in);

    public void saveInfo(){
        System.out.println("Enter the size of an arrray :");
        size= sc.nextInt();
        s = new String[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the value :");
            s[i] =sc.next();
        }
    }

    public void display(){
        for (String ss: s){
            System.out.println("Value are:"+ss);
        }
    }

    public static void main(String[] args){
        ArrEx1 a = new ArrEx1();
        a.saveInfo();
        a.display();
    }
}