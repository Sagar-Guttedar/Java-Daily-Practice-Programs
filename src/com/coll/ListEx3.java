package com.coll;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
public class ListEx3 {
    public static void main(String[] args) {
        List li= Arrays.asList("Hello",2000.23f, true , false);
        Iterator itr = li.iterator();
        while(itr.hasNext()){
            System.out.println("itr values : "+itr.next());
        }
    }
}
*/


public class ListEx3{
    public static void main(String[] args) {
        List li =Arrays.asList(2000000.23f, "hello", true, false);
        Iterator itr = li.iterator();
        while(itr.hasNext()){
            System.out.println("value "+itr.next());
        }
    }
}