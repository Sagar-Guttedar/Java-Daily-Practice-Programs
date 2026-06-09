package com.javaPrograms;

import com.AlphabetsPatternPro.I;

import java.util.Arrays;
import java.util.List;

/*public class StreamAPIMaxMin {
    public static void main(String[] args) {

        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7);
        int maxVal = li.stream().max(Integer::compare).get();
        System.out.println("Maximum Value : "+maxVal);
        System.out.println("----------------------------------");
        int minVal = li.stream().min(Integer::compare).get();
        System.out.println("Minimum Value : "+minVal);
    }
}*/


/*public class StreamAPIMaxMin {
    public static void main(String[] args) {
        List<Integer> li =Arrays.asList(1,20,3,40,5,6);

        int maxVal = li.stream().max(Integer::compare).get();
        System.out.println("Maximum value : "+maxVal);

        int minVal = li.stream().min(Integer::compare).get();
        System.out.println("Minimum value : "+minVal);
    }
}*/


/*public class StreamAPIMaxMin{
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,20,30,4,5,6,7);

        int maxval = li.stream().max(Integer::compare).get();
        System.out.println("Max value : "+maxval);

        int minVal = li.stream().min(Integer::compare).get();
        System.out.println("Min value : "+minVal);
    }
}*/


public class StreamAPIMaxMin{
    public static void main(String[] args) {
        List<Integer>li=Arrays.asList(1,23,45,55,60);

        int maxVal=li.stream().max(Integer::compare).get();
        System.out.println("MAximum Value : "+maxVal);

        int minVal=li.stream().min(Integer::compare).get();
        System.out.println("Minimum Value : "+minVal);
    }
}









