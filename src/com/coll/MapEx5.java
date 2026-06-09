package com.coll;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx5 {
    public static void main(String[] args) {
        Map<String, List<String>> mp = new HashMap<>();
        List<String> l1 = Arrays.asList("Java is simple", "Java is Robust", "Java is OOPS");
        List<String> l2 = Arrays.asList("Single Level Inheritance ", "Multilevel Inheritance", "Hybrid Inheritance");

        mp.put("What is java?", l1);
        mp.put("Types Of inheritance ", l2);
        mp.forEach(
                (x,y)->{
                    String key = x;
                    List<String> val = y;
                    System.out.println("Key : "+key+" Value : "+val);
                }
        );

    }

}

