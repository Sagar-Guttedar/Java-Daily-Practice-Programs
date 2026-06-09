package com.javaPrograms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Write a program to count the characters in string  using stream api

/*public class StreamAPICharCount {
    public static void main(String[] args) {
        String s ="Hi all welcome to java world";

        Map<Character , Long> mp=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        mp.forEach(
                (x,y)-> System.out.println("Characters is : "+x+" Count is : "+y)
        );
    }
}*/












public class StreamAPICharCount{
    public static void main(String[] args) {
        String s= "Hi all welcome to java world";

        Map<Character ,Long> mp = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        mp.forEach(
                (x,y) -> System.out.println("Character is  : "+x+"  Count is : "+y)
        );
    }
}















