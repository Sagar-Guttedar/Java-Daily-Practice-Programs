package com.coll;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("hello");
        l1.add(20000.12f);
        l1.add('x');
        l1.add(25);
        l1.add(false);

        // Enhanced For Loop
        l1.forEach(
                (x) -> System.out.println("value are : "+x)
        );
    }
}
