package com.allJavaPro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

//Top 25 java 8 coding interview question and Ans .

public class Java8Strea {
    public static void main(String[] args) {

        /*// 1.  given the list of integers, find the first element of the list using streams function
        List<Integer> nums = Arrays.asList(30,15,20,10,20,30,40);
        nums.stream().findFirst().ifPresent(System.out::println);

        // 2. Given list of integers, find the total number of elements present in the list using streams fuctions.
        System.out.println(nums.stream().count());

        // 3.  Given list of Integers find out all the even and Odd Numbers that is exists in the list using Streams functions.
        List<Integer> li = Arrays.asList(1,2, 23,10,20,30,40,50,50,54);

        li.stream().filter(num -> num%2==0).forEach(System.out::println);
        System.out.println("----------------------------");
        li.stream().filter(num -> num%2!=0).forEach(System.out::println);
        System.out.println("----------------------------");

        // 4.  Given a list of integers, find all the numbers starting with 5 using Stream functions.
        li.stream().filter(num-> num.toString().startsWith("5")).forEach(System.out::println);
        System.out.println("----------------------------");

        // 5. Ho to find duplicate elements in a given integers list in java using Stream Functions?.
        Set<Integer> temp = new HashSet();
        li.stream().filter(num -> !temp.add(num)).forEach(System.out::println);


        // 5. How to find duplicate elements in a given integers list in java using Stream Functions?.

        List<Integer> li = Arrays.asList(10,20,30,30,40,50,60,70,70,80,80);

        Set<Integer> temp1 = new HashSet();
        li.stream().filter(num -> !temp1.add(num)).forEach(System.out::println);*/

        // 6. Given a list of Integers, Find the maximum and value element present in it using Stream Function.

        List<Integer> li = Arrays.asList(10,20,30,51,40,50);



       /* Optional<Integer> max = li.stream().max(Integer::compareTo);
        Optional<Integer> min = li.stream().min(Integer::compareTo);
        System.out.println("------------ Maximum Minimum ---------------------");
        System.out.println(max.orElse(null));
        System.out.println("------------ Miniimum Minimum ---------------------");
        System.out.println(min.orElse(null));



        // 7. Given a list of integers, sort all the values present in it uusing Stream Functions
        li.stream().sorted().forEach(System.out::println);


        // 8. Given a list of integers, sort all the values present in it using Stream Functions.
        li.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        // 9. Check Array contain duplicate values or not.
        int[] numbers={1,2,4,4,5,7};
        if(Arrays.stream(numbers).distinct().count()!=numbers.length){
            System.out.println("It contain duplicate value.");
        }else{
            System.out.println("It not contain duplicate values.");
        }
        */

        // 10. Java 8 program to perform square on list elements and filter numbers greater than 50.

        List<Integer> nums = Arrays.asList(30,15,20,10,20,30,40);

        /*//Write a java 8 program to sort an array and then convert the sorted array into stream
        int[] numbers={1,2,4,7,8, 4,5,7};
        Arrays.sort(numbers);
        Arrays.stream(numbers).forEach(System.out::println);*/

       /* //12. How to use map to convert words into UPPERCASE in java 8.
        List<String> words = Arrays.asList("hi","hello","good");
        words.stream().map(l -> l.toUpperCase()).forEach(System.out::println);*/
/*
        //14.  Write a program in Stream to concatenate two Streams
        Stream<Integer> s1 = Stream.of(1,2,3);
        Stream<Integer> s2  = Stream.of(4,5,6);
        Stream.concat(s1,s2).forEach(System.out::println);*/
/*

        // 15. Write a program in stream to print random number.
        Random random = new Random();
        Stream.generate(random::nextInt).limit(10).forEach(System.out::println);


        // 16. Print date and time using java 8 feature.
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // 17. Then format it in dd-mm-yyyy format
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(dateTimeFormatter.format(localDateTime));

        // 18. How to check if list is empty in java 8 using Optional, "+ " if not null iterate through the list and print the object.
        List<String> list =  null;   /*Arrays.asList("Sagar","ram","shyam");
        Optional<List<String>>OptionalList = Optional.ofNullable(list);
        OptionalList.ifPresentOrElse(i->i.stream().forEach(System.out::println),()->System.out.println("the list is empty. "));
*/
       //19. Given the array {10,1,20,100,100,100}.
        // Write java code usong java streams to determine the number of occurrences of a particular value.

        int[] values = {10,1,20,100,100,100,100};

        int number =100;
        long result=Arrays.stream(values).filter(value -> value ==number).count();
        System.out.println(result);

        //20.How to find duplicate elements with its count from the String ArrayList in java.
        List<String> list = Arrays.asList("Sagar","ram","shyam");
        /*list.stream().filter(n->n %2==0).forEach(System.out::println);
*/

    }
}
