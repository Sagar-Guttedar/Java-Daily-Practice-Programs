package com.coll;

import java.util.LinkedList;
import java.util.List;



public class LinkedListEx3{

    List li = new LinkedList();

    public void addToList(Object x){
        li.add(x);
        System.out.println("Element  added : "+x);

    }

    public void display(){
        System.out.println("Elements Are : "+li);
    }

    public static void main(String[] args) {
        LinkedListEx3 li3 = new LinkedListEx3();
        li3.addToList("hello");
        li3.addToList(100);
        li3.addToList('c');
        li3.addToList(25000.23f);
        li3.addToList(true);
    }
}