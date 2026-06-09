package com.collectionPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*public class ListExample1 {
    public static void main(String[] args) {
        ArrayList al  =new ArrayList<>();
        al.add("Hello");
        al.add("100.23f");
        al.add(25);
        al.add('x');
        al.add(true);
        System.out.println("Value in arraylist : "+al);

        //for loop
        for (int i=0;i<al.size();i++){
            System.out.println("Value : "+al.get(i));
        }

        System.out.println("---------------------------------");
        //Enhanced forloop
        for (Object o:al){
            System.out.println("Value using Enahnced for loop : "+o);
        }

        System.out.println("-------------------------------------------");

        // Using Iterator interface
        Iterator itr = al.iterator();
        while (itr.hasNext()){
            System.out.println("Using Iterator Interface : "+itr.next());
        }
        System.out.println("-------------------------------------------");

        // Using List iterator
        ListIterator li =al.listIterator();
        while (li.hasNext()){
            System.out.println("Using List Iterator  : "+li.next());
        }

        System.out.println("-------------------------------------------");

        al.forEach(
                (x) -> System.out.println("Displaying Value using lamda Expression : "+x)
        );

    }
}*/

/*public class ListExample1{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Hello");
        al.add(10000.23f);
        al.add(25);
        al.add('x');
        al.add(true);

        System.out.println("Values in ArrayList : "+al);

        System.out.println("--------------for loop-----------------------");

        // for loop
        for (int i=0; i<al.size(); i++){
            System.out.println("Values : "+al.get(i));
        }

        System.out.println("-------------Enhanced for loop-------------------");

        // Enhanced for loop
        for(Object o:al){
            System.out.println("Enhanced for loop values : "+o);
        }

        System.out.println("-------------Iterator interface--------------------");

        // Iterator interface
        Iterator itr = al.iterator();
        while (itr.hasNext()){
            System.out.println("Elements : "+itr.next());
        }

        System.out.println("-------------List iterator forward--------------------");

        //List iterator
        ListIterator li = al.listIterator();
        while(li.hasNext()){
            System.out.println("Values : "+li.next());
        }

        System.out.println("--------List Iterator Backword-------------");
        // Backword direction
        while(li.hasPrevious()){
            System.out.println("Backword direction values : "+li.previous());
        }

        System.out.println("--------Lamda Expression-----------");

        al.forEach(
                (x)->{
                    System.out.println("From lamda Values : "+x);
                }
        );

    }
}*/


public class ListExample1{
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add("hello");
        al.add(20000.234f);
        al.add(100);
        al.add('a');
        al.add(true);

        System.out.println("values : "+al);

        System.out.println("------------For loop-------------");
        //for loop
        for (int i=0; i<al.size();i++){
            System.out.println("For loop values : "+al.get(i));
        }

        System.out.println("------Enhanced for loop--------------");
        for (Object o:al){
            System.out.println("Enhanced for loop : "+o);
        }

        System.out.println("------Iterator-----------");
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println("Iterator Values : "+itr.next());
        }

        System.out.println("------List Iterator Forword Direction--------");
        ListIterator li = al.listIterator();
        while(li.hasNext()){
            System.out.println("List Iterator Values : "+li.next());
        }

        System.out.println("-----List Iterator Backword Direction");
        // List Iterator Bckword Direction
        while(li.hasPrevious()){
            System.out.println("ListIterator Backword values : "+li.previous());
        }

        System.out.println("------Lamda Expression-------");
        al.forEach(
                (x)-> System.out.println("Values : "+x)
        );

    }
}






