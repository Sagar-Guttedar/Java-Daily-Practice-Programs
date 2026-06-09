package com.coll;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx1 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(10);
        set.add(10);
        set.add("String");
        set.add(true);
        set.add(200.345f);
        System.out.println("Values in set : "+set);

        System.out.println("--------------Enhanced For loop--------------------");

        for (Object o : set){
            System.out.println("Values in Set : "+o);
        }

        System.out.println("-----------Iterator Interface-----------------------");

        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println("Values are : "+itr.next());
        }

        System.out.println("----------- Lambda Expression-----------------------");

        set.forEach(
                (x)-> System.out.println(x)
        );

    }
}
