package com.coll;

import java.util.LinkedHashSet;
import java.util.Set;

/*
public class SetEx {
    public static void main(String[] args) {
        Set s = new LinkedHashSet();
        s.add("HEllo");
        s.add(10);
        s.add("HELLO");
        System.out.println("Elements are : "+s+"  SIze is : "+s.size());
    }
}
*/

public class SetEx4{
    public static void main(String[] args) {
        Set s = new LinkedHashSet();
        s.add("Hello");
        s.add(10);
        s.add(10);
        s.add("Hello");

        System.out.println("Elements are : "+s+" Size : "+s.size());
    }
}

