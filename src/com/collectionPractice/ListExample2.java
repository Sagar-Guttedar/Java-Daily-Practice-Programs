package com.collectionPractice;

import java.util.List;
import java.util.ArrayList;

/*public class ListExample2 {
    public static void main(String[] args) {
        List l1 =new ArrayList<>();
        l1.add("hello");
        l1.add(25000.34f);
        l1.add('A');
        l1.add(true);

        l1.forEach(
                (x) -> System.out.println("Displaying heterogeneous value ing lambda expression : "+x)
        );
    }
}*/

public class ListExample2{
    public static void main(String[] args) {
        List li=new ArrayList();
        li.add("Hi Good Morning");
        li.add(300000.234f);
        li.add(24);
        li.add('z');
        li.add(true);

        li.forEach(
                (x)-> System.out.println("Displaying value using lamda expression : "+x)
        );
    }
}