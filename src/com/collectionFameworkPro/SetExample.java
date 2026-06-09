package com.collectionFameworkPro;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);

        System.out.println("Set elements : "+set);

        if (set.contains(20)){
            System.out.println("Set cont 20 ");
        }

        set.remove(10);
        System.out.println("After removal : "+set);

        System.out.println("Interesting through set : ");
        for (int num : set){
            System.out.println(num);
        }
    }
}
