package com.coll;

import java.util.HashMap;
import java.util.Map;

public class MapEx6 {
    public static void main(String[] args) {
        Map<Integer, Product> mp =new HashMap<>();
        Product p1 = new Product(111,"Oppo ",15000);
        mp.put(1,p1);
        mp.put(2,new Product(222,"Samsung",20000));
        mp.put(3, new Product(333, "Realme ",18000));

        mp.forEach(
                (x,y)->{
                    int i=x;
                    Product p = y;
                    System.out.println("Key : "+i);
                    System.out.println("Id : "+p.id+" Name : "+p.name+" Price : "+p.price);
                }
        );

        System.out.println("--------------------------------------------------------------");
        mp.forEach(
                (x,y)-> {
                    int i=x;
                    Product p =y;
                    System.out.println("Key : "+i);
                    System.out.println("Id is : "+p.id+" Name : "+p.name+" price : "+p.price);

                }
        );
    }
}


