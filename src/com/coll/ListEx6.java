package com.coll;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;


/*public class  ListEx6 {
    public static void main(String[] args) {
        List<Product>plist = Arrays.asList(
                new Product(3,"IPhone 6",60000),
                new Product(1,"Iphone 10",100000),
                new Product(2,"IPhone 15",150000)
        );

        System.out.println("Before Sorting : ");
        for (Product p:plist){
            System.out.println("Product are : "+p);
        }

        List<Product> slist = plist.stream().sorted(Comparator.comparing(Product::getPrice)).collect(Collectors.toList());
        System.out.println("-----------------------------------------");
        System.out.println("After Sorting : ");


        for (Product p:slist){
            System.out.println("Product are  : "+p);
        }
        System.out.println("---------Descending Order----------");
        plist.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).forEach(
                (x)-> System.out.println(x)
        );
    }
}*/


public class ListEx6{
    public static void main(String[] args) {
        List<Product> plist = Arrays.asList(
                new Product(3,"IPhone 6",600000),
                new Product(1,"Iphone 10",100000),
                new Product(2,"IPhone 15",150000)
        );

        System.out.println("Before Sorting :");
        for (Product p:plist){
            System.out.println("Products are : "+p);
        }

        List<Product> slist = plist.stream().sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());
        System.out.println("----------------------------");
        System.out.println("After Sorting");

        for (Product p:slist){
            System.out.println("Product are  : "+p);
        }
        System.out.println("---------Descending Order----------");
        plist.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).forEach(
                (x)-> System.out.println(x)
        );

    }
}