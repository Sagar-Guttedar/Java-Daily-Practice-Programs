package com.collectionPractice;

import com.coll.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*public class ListExample5 {
    public static void main(String[] args) {
        List<Product> li = new ArrayList();

        Product p1 = new Product(1, "Vivo",15000);
        Product p2 = new Product(2, "Oppo",17000);
        Product p3 = new Product(3, "Samsung",20000);

        li.add(p1);
        li.add(p2);
        li.add(p3);

        li.forEach(
                (x) -> System.out.println(x)
        );

        System.out.println("---------------------------------------------");

        List<Product>plist = Arrays.asList(
                new Product(1,"Vivo",15000),
                new Product(2,"Oppo",17000),
                new Product(3, "Samsung",20000)
        );

        Iterator itr = plist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}*/


public class ListExample5{
    public static void main(String[] args) {
        List<Product> li = new ArrayList<>();
        Product p1 = new Product(1,"vivo",15000);
        Product p2=new Product(2,"Oppo",20000);
        Product  p3=new Product(3,"IPhone", 505050);

        li.add(p1);
        li.add(p2);
        li.add(p3);

        li.forEach(
                (x)-> System.out.println(x)
        );

        System.out.println("-----------------------------------------");

        List<Product> lii = Arrays.asList(
                new Product(1,"Oppo1",20000),
                new Product(2,"Oppo2",21000),
                new Product(3,"Oppo3",40000)
        );

        Iterator itr = lii.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}