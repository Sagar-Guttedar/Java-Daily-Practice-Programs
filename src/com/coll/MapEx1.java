package com.coll;

import java.util.HashMap;

public class MapEx1 {
    public static void main(String[] args) {
        HashMap mp = new HashMap();
        mp.put(1,"Hi");
        mp.put("Hello",123);
        mp.put(true,false);
        mp.put(100.234f,'x');
        mp.put(4,"Hi");
        System.out.println("Value in Map : "+mp);
        mp.put(4,"Hello Sagar");
        System.out.println("Value in map : "+mp);
    }
}
