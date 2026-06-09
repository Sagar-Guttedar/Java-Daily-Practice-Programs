package com.coll;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListEx1{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Hello");
        al.add(1000.234f);
        al.add(25);
        al.add('x');
        al.add(true);
        System.out.println("Value of arrayList is : "+al);

        // for loop
        for (int i=0; i<al.size();i++){
            System.out.println("For loop Values : "+al.get(i));
        }
        System.out.println("-----------------------------------------");

        // Enhanced for loop
        for (Object o : al){
            System.out.println("Enhanced for loop Values : "+o);
        }

        System.out.println("-----------------------------------------");

        // Iterator interface
       Iterator itr =al.iterator();
       while(itr.hasNext()){
           System.out.println("Iterator Interface elements: "+itr.next());
       }


        System.out.println("-----------------------------------------");

       //ListIterator Interface
        ListIterator li = al.listIterator();
        while (li.hasNext()){
            System.out.println("List Iterator Interface value :  "+li.next());
        }

        System.out.println("-----------------------------------------");

        // Lambda Expression
        al.forEach(
                (x)-> System.out.println("value of Lambda Expression  :"+x)
        );


    }

}



