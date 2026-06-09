package com.coll;

import java.util.*;

public class SortedExx {
    public static void main(String[] args) {
        Set ss = new HashSet();
        ss.add(3);
        ss.add(1);
        ss.add(2);
        ss.add(1);
        System.out.println("Elements is ascending order : "+ss);

        List li = new ArrayList(ss);
        System.out.println("Values in List : "+li);
        Collections.sort(li, Collections.reverseOrder());
        System.out.println("List --> : "+li);
        Set s1 = new LinkedHashSet(li);
        System.out.println("Values in descending order : "+s1);
    }
}
