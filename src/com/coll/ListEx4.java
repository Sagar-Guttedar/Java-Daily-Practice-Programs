package com.coll;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class ListEx4 {
    public static void main(String[] args) {
        List<Integer> li =Arrays.asList(20,10,30);

        System.out.println(" Value in List : "+li);
        System.out.println("------------------------------------- ");

        Collections.sort(li);
        System.out.println("Ascending order Sorted Value : "+li);

        System.out.println("---------------------------------------- ");

        Collections.sort(li,Collections.reverseOrder());
        System.out.println("Reverse Value :  "+li);
    }
}
