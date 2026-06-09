package com.coll;

import java.util.*;

public class MapEx3 {
    public static void main(String[] args) {
        Map<String, List<String>> mp = new HashMap<>();

        List<String> l1 = Arrays.asList("Java is simple","Java is Robust","Java is OOPS");
        List<String> l2 =Arrays.asList("Single Level Inheritance ","Multilevel Inheritance","Hybrid Inheritance");

        mp.put("What is java?",l1);
        mp.put("Types Of inheritance ",l2);

        // keySet() method
        Set<String> s = mp.keySet();
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            String key = (String)itr.next();
            System.out.println("Keys --> : "+key);
            List<String>myList = mp.get(key);
            myList.forEach(
                    (x) -> System.out.println("Values are : "+x)
            );
        }
    }
}

