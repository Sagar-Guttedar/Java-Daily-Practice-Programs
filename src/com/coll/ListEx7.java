package com.coll;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListEx7 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,1,3,4,2,3,5,4,6);
        System.out.println("Duplicate elements "+li);
        li.stream().distinct().forEach(
                (x)-> System.out.println("Quinque elements "+x)
        );

        List<Integer> l1 = Arrays.asList(1,2,3);
        List<Integer> l2 = Arrays.asList(4,5,6);
        List<Integer> l3 = Arrays.asList(7,8,9);

        List<List<Integer>> bigList = Arrays.asList(l1,l2,l3);
        System.out.println("Printing the outer list "+bigList);

        List<Integer> sList= bigList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(sList);

        sList.stream().map(x->x*2).forEach(
                (y)-> System.out.println("Elements multiplied by two "+y)
        );
    }
}
