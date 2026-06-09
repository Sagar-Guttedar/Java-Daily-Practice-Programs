package com.coll;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharMap {
    public static void main(String[] args) {
        String s = "Hi all welcome to java world";

        Map<Character, Long> mp = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        mp.forEach(
                (x,y) -> System.out.println("Character is "+x+"  Count is : "+y)
        );
    }
}
