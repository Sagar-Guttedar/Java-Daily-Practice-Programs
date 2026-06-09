package com.collectionPractice;

import com.OOPS.A;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/*
public class ListExample4 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(20,10,30);

        System.out.println(" Value in List : "+li);
        System.out.println("------------------------------------- ");

        Collections.sort(li);
        System.out.println("Ascending order Sorted Value : "+li);

        System.out.println("---------------------------------------- ");

        Collections.sort(li,Collections.reverseOrder());
        System.out.println("Reverse Value :  "+li);
    }
}*/

/*
public class ListExample4{
    public static void main(String[] args) {
        List<Integer> li=Arrays.asList(10,30,20,40);
        System.out.println("Value in arralist : "+li);

        Collections.sort(li);
        System.out.println("Value are :"+li);

        Collections.sort(li, Collections.reverseOrder());
        System.out.println("Reverse Value : "+li);

    }
}*/



public class ListExample4{
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(20,40,10,30,50);

        System.out.println("Values : "+li);

        Collections.sort(li);
        System.out.println("Ascending order : "+li);

        Collections.sort(li,Collections.reverseOrder());
        System.out.println("Descending order : "+li);

    }
}