package com.javaPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPi {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5,2,3,6);
        li.stream().distinct().forEach((x) -> System.out.println("QUnique element : "+x));

        List<Integer> l1 =Arrays.asList(1,2,3);
        List<Integer> l2 = Arrays.asList(4,5,6);
        List<Integer> l3 =Arrays.asList(7,8,9);

        List<List <Integer>> bigList=Arrays.asList(l1,l2,l3);
        System.out.println("Print  the List : "+bigList);


        List<Integer> sList =bigList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(sList);

        sList.stream().map(x->x*2).forEach((x)-> System.out.print(x));
    }
}
