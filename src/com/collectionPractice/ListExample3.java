package com.collectionPractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*public class ListExample3 {
    public static void main(String[] args) {
      *//*  List li= Arrays.asList(10,2000.23f,false,"hello");

        Iterator itr = li.iterator();
        while(itr.hasNext()){
            System.out.println(" value in list : "+itr.next());
        }*//*

        List li=Arrays.asList("hello",100,2000.23f,true,'x');

        Iterator itr = li.iterator();
        while (itr.hasNext()){
            System.out.println("Value in Liste Iterartor : "+itr.next());
        }
    }
}*/


public class ListExample3{
    public static void main(String[] args) {
        List li = Arrays.asList("Hello",30000.23f,true,'a');

        for (int i=0;i<li.size();i++){
            System.out.println("Values : "+li.get(i));
        }

        System.out.println("-----------------");
        Iterator itr = li.iterator();
        while (itr.hasNext()){
            System.out.println("Values : "+itr.next());
        }

        ListIterator lii=li.listIterator();
        while(lii.hasNext()){
            System.out.println("List Iteraator"+lii.next());
        }


    }
}