package com.collectionPractice;

/*public class Product {

    int id;
    String name;
    float price;

    public Product(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String  toString() {
        return "Id :" + id + " Name : " + name + " Price : " + price;
    }
}*/


public class Product{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }


    public String toString() {
        return " Id : "+id+ " Name : "+name+ " price : "+price;
    }
}