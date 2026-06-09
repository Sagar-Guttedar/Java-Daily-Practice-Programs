package com.coll;

import java.util.SortedMap;
import java.util.TreeMap;

public class MapEx8 {
    public static void main(String[] args) {
        SortedMap sm = new TreeMap();
        sm.put(1,"Hello");
        sm.put(2,"Hii");
        sm.put(3,"hru");
        System.out.println("Values in sorted map: "+sm);
    }
}
