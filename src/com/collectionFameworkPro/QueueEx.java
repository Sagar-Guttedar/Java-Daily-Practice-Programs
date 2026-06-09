package com.collectionFameworkPro;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("Apple");
        q.add("Apple");
        q.add("Banana");
        q.add("Cat");
        q.add("Dog");

        System.out.println(q.offer("Fish"));
        System.out.println(q);
    }
}
