package com.collectionFameworkPro;

import java.util.ArrayList;
import java.util.List;

/*public class ListExample {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple");

        System.out.println("First Fruit : "+fruits.get(0));
        System.out.println("_________________________");

        System.out.println("List of Fruits : ");
        for (String s:fruits){
            System.out.println(s);
        }
        System.out.println("-------------------------");
        fruits.remove("Banana");
        System.out.println("After Removing: "+fruits);

    }
}*/

public class ListExample{
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple");

        System.out.println("First fruit : "+fruits.get(0));

        System.out.println("-----------------");
        System.out.println("List of all Fruits : ");
        for (String s : fruits){
            System.out.println(s);
        }
        System.out.println("-----------------------");

        fruits.remove("Cherry");
        System.out.println("After Removal : "+fruits);
    }
}



























