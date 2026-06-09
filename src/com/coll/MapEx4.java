package com.coll;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx4 {
    public static void main(String[] args) {
        Map<String, List<String>> mp = new HashMap<>();
        List<String> l1 = Arrays.asList("Java is simple", "Java is Robust", "Java is OOPS");
        List<String> l2 = Arrays.asList("Single Level Inheritance ", "Multilevel Inheritance", "Hybrid Inheritance");

        mp.put("What is java?", l1);
        mp.put("Types Of inheritance ", l2);

        //entrySet() method
        for (Map.Entry<String,List<String>> m : mp.entrySet()){
            String key=m.getKey();
            List<String> li =m.getValue();
            System.out.println("Key --> :"+key);
            for (int i=0; i<li.size(); i++){
                System.out.println("Value are : "+li.get(i));
            }
            System.out.println("----------------------------");
        }

    }
}
